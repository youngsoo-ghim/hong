package kr.co.nurier.object.bbs.master.service;

import kr.co.nurier.object.bbs.master.dao.BBSMasterDAO;
import kr.co.nurier.vo.bbs.BbsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BBSMasterServiceImpl implements BBSMasterService{
    
    @Autowired
    private BBSMasterDAO bbsMasterDAODAO;
    
    @Override
    public BbsVO select(BbsVO bbsVO) throws Exception {
        return this.bbsMasterDAODAO.select(bbsVO);
    }
    
    @Override
    public List<BbsVO> selectList(BbsVO bbsVO) throws Exception {
        return this.bbsMasterDAODAO.selectList(bbsVO);
    }
    
    @Override
    public int count(BbsVO bbsVO) throws Exception {
        // TODO Auto-generated method stub
        return this.bbsMasterDAODAO.count(bbsVO);
    }
    
    @Override
    public int insert(BbsVO bbsVO) throws Exception {
        return this.bbsMasterDAODAO.insert(bbsVO);
    }
    
    @Override
    public int update(BbsVO bbsVO) throws Exception {
        return this.bbsMasterDAODAO.update(bbsVO);
    }
}
