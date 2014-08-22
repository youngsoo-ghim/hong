package kr.co.nurier.object.good.service;

import kr.co.nurier.vo.good.DGoodVO;

import java.util.List;

public interface DGoodService {
    
    public DGoodVO select(DGoodVO dGoodVO) throws Exception;
    
    public List<DGoodVO> selectList(DGoodVO dGoodVO) throws Exception;
    
    public int count(DGoodVO dGoodVO) throws Exception;
    
    public int insert(DGoodVO dGoodVO) throws Exception;
    
    public int update(DGoodVO goodVO) throws Exception;
}
