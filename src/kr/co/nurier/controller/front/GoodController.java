package kr.co.nurier.controller.front;

import kr.co.nurier.object.good.service.MGoodService;
import kr.co.nurier.vo.bbs.BbsVO;
import kr.co.nurier.vo.good.MGoodVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
@Controller 
public class GoodController {
    private Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    private MGoodService mGoodService;
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{adminJspMap['020001']}") String F020001;
    @RequestMapping("/goodList")
    public ModelAndView goodList(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        MGoodVO goodVO = new MGoodVO();
        try {

            List<MGoodVO> goodList = (List<MGoodVO>) mGoodService.selectList(goodVO);
            mav.setViewName(F020001);

            mav.addObject("resultMessage", "");
            mav.addObject("reslutList", goodList);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return mav;
    }
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{adminJspMap['010002']}") String admin0002;
    @RequestMapping("/good/{mCdId}")
    public ModelAndView goodDetail(@PathVariable("mCdId") String mCdId) {
        ModelAndView mav = new ModelAndView();
        MGoodVO goodVO = new MGoodVO();
        try {
            goodVO.setGdCd(mCdId);
            List<MGoodVO> goodList = (List<MGoodVO>) mGoodService.selectList(goodVO);
            mav.setViewName(admin0002);
            
            mav.addObject("resultMessage", "");
            mav.addObject("result", goodList);
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
    @Value("#{adminJspMap['010002']}") String admin0003;
    @RequestMapping("/good/insert")
    public ModelAndView adminNewsInsert() {
        ModelAndView mav = new ModelAndView();
        BbsVO bbsVO = new BbsVO();
        try {
            mav.setViewName(admin0002);
            
            mav.addObject("resultMessage", "");
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return mav;
    }
}
