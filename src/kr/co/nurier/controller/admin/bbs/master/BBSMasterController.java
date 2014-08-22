package kr.co.nurier.controller.admin.bbs.master;

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
public class BBSMasterController {
    private Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    private BBSService bbsService;
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{adminJspMap['admin0001']}") String admin0001;
    @RequestMapping("/admin/bbsList.nurier")
    public ModelAndView adminNewsList(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        BbsVO bbsVO = new BbsVO();
        try {
            if (req.getParameter("searchKeyWord") != null && !req.getParameter("searchKeyWord").equals("")){
                if(req.getParameter("searchMode").equals("title")){
                    bbsVO.setPostTitle(req.getParameter("searchKeyWord"));
                } else {
                    bbsVO.setPostContents(req.getParameter("searchKeyWord"));
                }
            }
            List<BbsVO> bbsList = (List<BbsVO>) bbsService.selectList(bbsVO);
            mav.setViewName(admin0001);

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
    @Value("#{adminJspMap['admin0003']}") String admin0003;
    @RequestMapping("/admin/{postId}/bbsList.nurier")
    public ModelAndView adminNewsDetail(@PathVariable("postId") String postId) {
        ModelAndView mav = new ModelAndView();
        BbsVO bbsVO = new BbsVO();
        try {
            bbsVO.setPostId(postId);
            BbsVO bbsDetail = (BbsVO) bbsService.select(bbsVO);
            mav.setViewName(admin0003);
            
            mav.addObject("resultMessage", "");
            mav.addObject("bbsDetail", bbsDetail);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("got Exception");
        }
        
        return mav;
    }
}
