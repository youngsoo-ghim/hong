package kr.co.nurier.object.bbs.master.service;

import kr.co.nurier.vo.bbs.BbsVO;

import java.util.List;

public interface BBSMasterService {
    
    public BbsVO select(BbsVO bbsVO) throws Exception;
    
    public List<BbsVO> selectList(BbsVO bbsVO) throws Exception;
    
    public int count(BbsVO bbsVO) throws Exception;
    
    public int insert(BbsVO bbsVO) throws Exception;
    
    public int update(BbsVO bbsVO) throws Exception;
}
