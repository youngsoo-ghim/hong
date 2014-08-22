package kr.co.nurier.controller.admin.code;

import kr.co.nurier.object.code.service.DCommCdService;
import kr.co.nurier.object.code.service.MCommCdService;
import kr.co.nurier.vo.bbs.BbsVO;
import kr.co.nurier.vo.code.DCommCdVO;
import kr.co.nurier.vo.code.MCommCdVO;
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
public class CodeController {
    private Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    private MCommCdService mCommCdService;
    @Autowired
    private DCommCdService dCommCdService;
    
    /**
     * 최초 접속시 페이지 이동
     * @return ModelAndView
     * @throws Exception 
     */
    @Value("#{adminJspMap['A010001']}") String A010001;
    @RequestMapping("/admin/codeList")
    public ModelAndView adminNewsList(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        MCommCdVO mCommCdVO = new MCommCdVO();
        try {

            List<MCommCdVO> bbsList = (List<MCommCdVO>) mCommCdService.selectList(mCommCdVO);
            mav.setViewName(A010001);

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
    @Value("#{adminJspMap['010002']}") String admin0002;
    @RequestMapping("/admin/code/{mCdId}")
    public ModelAndView adminNewsDetail(@PathVariable("mCdId") String mCdId) {
        ModelAndView mav = new ModelAndView();
        DCommCdVO dCommCdVO = new DCommCdVO();
        try {
            dCommCdVO.setCdId(mCdId);
            List<DCommCdVO> codeDetailList = (List<DCommCdVO>) dCommCdService.selectList(dCommCdVO);
            mav.setViewName(admin0002);
            
            mav.addObject("resultMessage", "");
            mav.addObject("result", codeDetailList);
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
    @RequestMapping("/admin/code/insert")
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
