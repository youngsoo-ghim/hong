package kr.co.nurier.object.bbs.service;

import kr.co.nurier.object.bbs.dao.BBSDAO;
import kr.co.nurier.vo.bbs.BbsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BBSServiceImpl implements BBSService{
    
    @Autowired
    private BBSDAO bbsDAO;
    
    @Override
    public BbsVO select(BbsVO bbsVO) throws Exception {
        return this.bbsDAO.select(bbsVO);
    }
    
    @Override
    public List<BbsVO> selectList(BbsVO bbsVO) throws Exception {
        return this.bbsDAO.selectList(bbsVO);
    }
    
    @Override
    public int count(BbsVO bbsVO) throws Exception {
        // TODO Auto-generated method stub
        return this.bbsDAO.count(bbsVO);
    }
    
    @Override
    public int insert(BbsVO bbsVO) throws Exception {
        return this.bbsDAO.insert(bbsVO);
    }
    
    @Override
    public int update(BbsVO bbsVO) throws Exception {
        return this.bbsDAO.update(bbsVO);
    }
}
