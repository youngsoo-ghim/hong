package kr.co.nurier.controller.mobile;

import kr.co.nurier.object.code.service.DCommCdService;
import kr.co.nurier.object.good.service.DGoodItemService;
import kr.co.nurier.object.good.service.DGoodService;
import kr.co.nurier.object.good.service.MGoodService;
import kr.co.nurier.vo.code.DCommCdVO;
import kr.co.nurier.vo.good.DGoodItemVO;
import kr.co.nurier.vo.good.MGoodVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
@Controller 
public class DGoodController {
    private Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    private MGoodService mGoodService;
    @Autowired
    private DGoodService dGoodService;
    @Autowired
    private DGoodItemService dGoodItemService;
    @Autowired
    private DCommCdService dCommCdService;
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{mobileJspMap['M030003']}") String M030003;
    @Value("#{mobileJspMap['M030004']}") String M030004;
/*    @RequestMapping(value="/m/goodList", method=RequestMethod.GET)
    public ModelAndView mGoodForm(@ModelAttribute  MGoodVO mGoodVO) {
        ModelAndView mav = new ModelAndView();
        try {
            mav.setViewName(M030002);
            
            mav.addObject("resultMessage", "");
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return mav;
    }*/
    //@RequestMapping(value="/m/goodList", method=RequestMethod.POST)
    @RequestMapping(value="/m/dosirakList")
    public ModelAndView dosirakList(@ModelAttribute  DGoodItemVO dGoodItemVO) {
        ModelAndView mav = new ModelAndView();
        try {
            //해당 날짜에 값이 존제 하는지 확인
            if(dGoodItemVO.getBaseDate() == null || dGoodItemVO.getBaseDate().equals("")) {
                Date today = new Date();
                String nowDate = (new SimpleDateFormat("yyyyMMdd").format(today));
                dGoodItemVO.setBaseDate(nowDate);
            } else {
                dGoodItemVO.setBaseDate(dGoodItemVO.getBaseDate().replace("-", ""));
            }
            
            // 해당 날자 도시락 정보 조회
            dGoodItemVO.setCdId("VSL");                                     // 용기
            List<MGoodVO> dosirakItem = (List<MGoodVO>) mGoodService.selectList(dGoodItemVO);
            
            mav.setViewName(M030004);
            
            mav.addObject("dosirakItem", dosirakItem);
            mav.addObject("dGoodItemVO", dGoodItemVO);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return mav;
    }
    @RequestMapping(value="/m/fruitList")
    public ModelAndView mGoodList(@ModelAttribute("dGoodItemVO")  DGoodItemVO dGoodItemVO) {
        ModelAndView mav = new ModelAndView();
        DCommCdVO dCommCdVO = new DCommCdVO();
        MGoodVO mGoodVO = new MGoodVO();
        DGoodItemVO dGoodItemTempVO = new DGoodItemVO();
        List<MGoodVO> goodList = null;
        try {
            //해당 날짜에 값이 존제 하는지 확인
            if(dGoodItemVO.getBaseDate() == null || dGoodItemVO.getBaseDate().equals("")) {
                Date today = new Date();
                String nowDate = (new SimpleDateFormat("yyyyMMdd").format(today));
                dGoodItemVO.setBaseDate(nowDate);
                dGoodItemVO.setBase_ymd(nowDate);
            } else {
                dGoodItemVO.setBaseDate(dGoodItemVO.getBaseDate().replace("-", ""));
                dGoodItemVO.setBase_ymd(dGoodItemVO.getBaseDate().replace("-", ""));
            }
            // 해당 날자 도시락 내용물 정보 조회 전일자로 조회를 하고 없을 경우 빈값 넘겨 주기
            if(dGoodItemVO.getDsrk_cd() == null || dGoodItemVO.getDsrk_cd().equals("")) {
                dGoodItemVO.setDsrk_cd(dGoodItemVO.getGdCd());
            }
            // 도시락 내용물을 가지고 전일자 과일 가격 가져오기
            
            DateFormat df = new SimpleDateFormat("yyyyMMdd");
            Date date = df.parse(dGoodItemVO.getBase_ymd());
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            
            // 도시락 최근 정보 가져오기
            List<DGoodItemVO> goodItemTemp = (List<DGoodItemVO>)dGoodItemService.selectList(dGoodItemTempVO);
            //모든 상품개수만큼 for문 사용
            //for(int i =0;dGoodItemService.count(dGoodItemCntVO) > i ; i++) {
                //해당 날자에 수시락이 있으면 그 날짜에 해당하는 도시락 정보를 가져 온다. 가장 최근 것
                if(!goodItemTemp.isEmpty()) {
                    //입력된 날짜에서 하루 전날
                    //cal.add(Calendar.DATE, -1);
                    //dGoodItemVO.setBase_ymd(df.format(cal.getTime()));
                    //dosirakCnt = dGoodItemService.count(dGoodItemVO);
                    dGoodItemTempVO = goodItemTemp.get(0);
                    //도시락 상품중에 가장 최근 날짜 가져오기
                    dGoodItemVO.setBase_ymd(dGoodItemTempVO.getBase_ymd());
                }
            //}
            
            // 도시작 정보가 존제하는 날짜에 도시락 정보를 가져온다.
            List<DGoodItemVO> fruitList = (List<DGoodItemVO>) dGoodItemService.selectList(dGoodItemVO);

            logger.info("도시락 과일 정보");
            //도시락 과일 정보가 있다면 그 정보로 과일정보 조회
            if(!fruitList.isEmpty()) {
                String[] ArrGcCd = new String[fruitList.size()];
                for(int i = 0 ; fruitList.size() > i; i++) {
                    ArrGcCd[i] = fruitList.get(i).getGd_cd();
                }
                mGoodVO.setaGdCd(ArrGcCd);
                mGoodVO.setGdClsCd("FRUT");
                goodList = (List<MGoodVO>) mGoodService.selectList(mGoodVO);
            }
            // 해당 날자 도시락 정보 조회
            MGoodVO dosirakInfo = (MGoodVO)mGoodService.select(dGoodItemVO);
            
            dGoodItemVO.setGdClsCd("VSL");
            dGoodItemVO.setGdCd("");
            List<MGoodVO> dosirakList = (List<MGoodVO>)mGoodService.selectList(dGoodItemVO);
            
            
            dCommCdVO.setCdId("FRUT");
            List<DCommCdVO> fList = (List<DCommCdVO>) dCommCdService.selectList(dCommCdVO);
            
            dCommCdVO.setCdId("UNIT");
            List<DCommCdVO> uList = (List<DCommCdVO>) dCommCdService.selectList(dCommCdVO);
            
            mav.setViewName(M030003);
            
            mav.addObject("goodList", goodList);
            mav.addObject("dosirakInfo", dosirakInfo);
            mav.addObject("dosirakList", dosirakList);
            mav.addObject("fruitList", fruitList);
            mav.addObject("fList", fList);
            mav.addObject("uList", uList);
            mav.addObject("dGoodItemVO", dGoodItemVO);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return mav;
    }
    
    /**
     * 세소식 입력
     * @return ModelAndView
     * @throws Exception 
     */
    @RequestMapping("/m/good/fruitInsert")
    public ModelAndView dosirakItemInsert(@ModelAttribute("dGoodItemVO")  DGoodItemVO dGoodItemVO) {
        ModelAndView mav = new ModelAndView();
        String  gdKey = "";
        try {
            
            gdKey = dGoodItemVO.getGdKey();         //도시락 조회를 위한 값 셋
            //해당 날짜에 값이 존제 하는지 확인
            if(dGoodItemVO.getBaseDate() == null || dGoodItemVO.getBaseDate().equals("")) {
                Date today = new Date();
                String nowDate = (new SimpleDateFormat("yyyyMMdd").format(today));
                dGoodItemVO.setBase_ymd(nowDate);
                dGoodItemVO.setBaseDate(nowDate);
            } else {
                dGoodItemVO.setBase_ymd(dGoodItemVO.getBaseDate().replace("-", ""));
                dGoodItemVO.setBaseDate(dGoodItemVO.getBaseDate().replace("-", ""));
            }
            
            // 과일 도시락 내용물 넣기
            dGoodItemVO.setGdClsCd("FRUT");
            String[] a_gd_cd = dGoodItemVO.getA_gd_cd();
            int[] a_gd_price = dGoodItemVO.getA_gd_price();
            int[] a_gd_unit_amt = dGoodItemVO.getA_gd_unit_amt();
            String[] a_gd_unit_cd = dGoodItemVO.getA_gd_unit_cd();
            
            for(int i = 0 ; a_gd_cd.length > i ; i++) {
                dGoodItemVO.setGd_cd(a_gd_cd[i]);
                dGoodItemVO.setGd_price(a_gd_price[i]);
                dGoodItemVO.setGd_unit_amt(a_gd_unit_amt[i]);
                dGoodItemVO.setGd_unit_cd(a_gd_unit_cd[i]);
                
                if(dGoodItemService.count(dGoodItemVO) > 0) {
                    dGoodItemService.update(dGoodItemVO);
                }else {
                    dGoodItemService.insert(dGoodItemVO);
                }
            }
            
            //구매하는 상품 넣기
            //String[] aGKey = dGoodItemVO.getaGKey();
            String[] aGdCd = dGoodItemVO.getaGdCd();
            int[] aGdPrice = dGoodItemVO.getaGdPrice();
            int[] aGdUnitAmt = dGoodItemVO.getaGdUnitAmt();
            String[] aGdUnitCd = dGoodItemVO.getaGdUnitCd();
            float[] aGdBoxAmt = dGoodItemVO.getaGdBoxAmt();
            
            for(int i = 0 ; aGdCd.length > i ; i++) {
                //dGoodItemVO.setGdKey(aGKey[i]);
                dGoodItemVO.setGdCd(aGdCd[i]);
                dGoodItemVO.setGdPrice(aGdPrice[i]);
                dGoodItemVO.setGdUnitAmt(aGdUnitAmt[i]);
                dGoodItemVO.setGdUnitCd(aGdUnitCd[i]);
                dGoodItemVO.setGdBoxAmt(aGdBoxAmt[i]);
                
                if(mGoodService.count(dGoodItemVO) > 0) {
                    mGoodService.update(dGoodItemVO);
                }else {
                    mGoodService.insert(dGoodItemVO);
                }
            }
            
            mav.addObject("resultMessage", "");
            mav.addObject("dGoodItemVO", dGoodItemVO);
            
            //mav.setView(new RedirectView("/m/goodList"));
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        //String param = "redirect:/m/fruitList?dsrk_cd="+dGoodItemVO.getDsrk_cd()+"&gdKey="+gdKey+"&base_ymd="+dGoodItemVO.getBase_ymd();
        String param = "redirect:/m/fruitList?gdCd="+dGoodItemVO.getDsrk_cd()+"&base_ymd="+dGoodItemVO.getBase_ymd();
        return new ModelAndView(param);
    }
}
