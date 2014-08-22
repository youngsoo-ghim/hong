package kr.co.nurier.controller.front;

import kr.co.nurier.object.bbs.service.BBSService;
import kr.co.nurier.vo.bbs.BbsVO;
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
public class NewsController {
    private Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    private BBSService bbsService;
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{frontJspMap['nurier0002']}") String nurier0002;
    @RequestMapping("/news")
    public ModelAndView newsList(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        BbsVO bbsVO = new BbsVO();
        try {
            logger.info("sddddddddddddddddddddddddddddddddd"+req.getParameter("searchKeyWord"));
            if (req.getParameter("searchKeyWord") != null && !req.getParameter("searchKeyWord").equals("")){
                if(req.getParameter("searchMode").equals("title")){
                    bbsVO.setPostTitle(req.getParameter("searchKeyWord"));
                } else {
                    bbsVO.setPostContents(req.getParameter("searchKeyWord"));
                }
            }
            List<BbsVO> bbsList = (List<BbsVO>) bbsService.selectList(bbsVO);
            mav.setViewName(nurier0002);

            mav.addObject("resultMessage", "");
            mav.addObject("bbsList", bbsList);
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
    @Value("#{frontJspMap['nurier0003']}") String nurier0003;
    @RequestMapping("/news/{postId}")
    public ModelAndView newsDetail(@PathVariable("postId") String postId) {
        ModelAndView mav = new ModelAndView();
        BbsVO bbsVO = new BbsVO();
        try {
            bbsVO.setPostId(postId);
            BbsVO bbsDetail = (BbsVO) bbsService.select(bbsVO);
            mav.setViewName(nurier0003);
            
            mav.addObject("resultMessage", "");
            mav.addObject("bbsDetail", bbsDetail);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return mav;
    }
}
