package kr.co.nurier.object.code.service;

import kr.co.nurier.vo.code.DCommCdVO;

import java.util.List;

public interface DCommCdService {
    
    public DCommCdVO select(DCommCdVO dCommCdVO) throws Exception;
    
    public List<DCommCdVO> selectList(DCommCdVO dCommCdVO) throws Exception;
    
    public int count(DCommCdVO dCommCdVO) throws Exception;
    
    public int insert(DCommCdVO dCommCdVO) throws Exception;
    
    public int update(DCommCdVO dCommCdVO) throws Exception;
}
