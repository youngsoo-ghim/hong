package kr.co.nurier.controller.mobile;

import kr.co.nurier.object.code.service.DCommCdService;
import kr.co.nurier.object.good.service.MGoodService;
import kr.co.nurier.vo.code.DCommCdVO;
import kr.co.nurier.vo.good.MGoodVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
@Controller 
public class MGoodController {
    private Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    private MGoodService mGoodService;
    @Autowired
    private DCommCdService dCommCdService;
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{mobileJspMap['M030002']}") String M030002;
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
    @RequestMapping(value="/m/goodList")
    public ModelAndView mGoodList(@ModelAttribute  MGoodVO mGoodVO) {
        ModelAndView mav = new ModelAndView();
        DCommCdVO dCommCdVO = new DCommCdVO();
        try {
            //해당 날짜에 값이 존제 하는지 확인
            if(mGoodVO.getBaseDate() != null && !mGoodVO.getBaseDate().equals("")) {
                mGoodVO.setBaseDate(mGoodVO.getBaseDate().replace("-", ""));
            }
            mGoodVO.setGdClsCd("VSL");              // 용기로된 재료만 가져오기
            List<MGoodVO> goodList = (List<MGoodVO>) mGoodService.selectList(mGoodVO);
            
            dCommCdVO.setCdId("VSL");
            List<DCommCdVO> cdList = (List<DCommCdVO>) dCommCdService.selectList(dCommCdVO);
            
            mav.setViewName(M030002);
            
            mav.addObject("resultMessage", "");
            mav.addObject("goodList", goodList);
            mav.addObject("cdList", cdList);
            mav.addObject("mGoodVO", mGoodVO);
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
    @RequestMapping("/m/good/orderInsert")
    public ModelAndView adminNewsInsert(@ModelAttribute  MGoodVO mGoodVO) {
        ModelAndView mav = new ModelAndView();
        try {
            mav.setViewName(M030002);
            
            //해당 날짜에 값이 존제 하는지 확인
            if(mGoodVO.getBaseDate() == null || mGoodVO.getBaseDate().equals("")) {
                Date today = new Date();
                String nowDate = (new SimpleDateFormat("yyyyMMdd").format(today));
                mGoodVO.setBaseDate(nowDate);
            } else {
                mGoodVO.setBaseDate(mGoodVO.getBaseDate().replace("-", ""));
            }
            
            String[] aGdCd = mGoodVO.getaGdCd();
            int[] aOrdAmt = mGoodVO.getaOrdAmt();
            mGoodVO.setGdClsCd("VSL"); 
            //String[] aGdKey = mGoodVO.getaGdKey();
            
            for(int i = 0 ; aOrdAmt.length > i ; i++) {
                mGoodVO.setGdCd(aGdCd[i]);
                mGoodVO.setOrdAmt(aOrdAmt[i]);
                //mGoodVO.setGdKey(aGdKey[i]);
                
                if(mGoodService.count(mGoodVO) > 0) {
                    mGoodService.update(mGoodVO);
                }else {
                    mGoodService.insert(mGoodVO);
                }
            }
            
            mav.addObject("resultMessage", "");
            
            //mav.setView(new RedirectView("/m/goodList"));
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return new ModelAndView("redirect:/m/goodList");
    }
}
