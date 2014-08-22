package kr.co.nurier.object.code.service;

import kr.co.nurier.vo.code.MCommCdVO;

import java.util.List;

public interface MCommCdService {
    
    public MCommCdVO select(MCommCdVO mCommCdVO) throws Exception;
    
    public List<MCommCdVO> selectList(MCommCdVO mCommCdVO) throws Exception;
    
    public int count(MCommCdVO mCommCdVO) throws Exception;
    
    public int insert(MCommCdVO mCommCdVO) throws Exception;
    
    public int update(MCommCdVO mCommCdVO) throws Exception;
}
