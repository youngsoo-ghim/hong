package kr.co.nurier.controller.front;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller 
public class FrontMainController {
    private Logger logger = Logger.getLogger(getClass());
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{frontJspMap['0001']}") String nurier0001;
    @RequestMapping("/home")
    public ModelAndView adminConnection() {
        ModelAndView mav = new ModelAndView();
        
        mav.setViewName(nurier0001);
        
        mav.addObject("resultMessage", "");
        
        return mav;
    }
}
