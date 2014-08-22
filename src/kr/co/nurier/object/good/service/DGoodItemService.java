package kr.co.nurier.object.good.service;

import kr.co.nurier.vo.good.DGoodItemVO;

import java.util.List;

public interface DGoodItemService {
    
    public DGoodItemVO select(DGoodItemVO dGoodItemVO) throws Exception;
    
    public List<DGoodItemVO> selectList(DGoodItemVO dGoodItemVO) throws Exception;
    
    public int count(DGoodItemVO dGoodItemVO) throws Exception;
    
    public int insert(DGoodItemVO dGoodItemVO) throws Exception;
    
    public int update(DGoodItemVO dGoodItemVO) throws Exception;
}
