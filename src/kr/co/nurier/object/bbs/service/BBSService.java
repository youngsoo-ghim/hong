package kr.co.nurier.object.bbs.service;

import kr.co.nurier.vo.bbs.BbsVO;

import java.util.List;

public interface BBSService {
    
    public BbsVO select(BbsVO bbsVO) throws Exception;
    
    public List<BbsVO> selectList(BbsVO bbsVO) throws Exception;
    
    public int count(BbsVO bbsVO) throws Exception;
    
    public int insert(BbsVO bbsVO) throws Exception;
    
    public int update(BbsVO bbsVO) throws Exception;
}
