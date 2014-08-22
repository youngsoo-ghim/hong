package kr.co.nurier.object.good.service;

import kr.co.nurier.vo.good.MGoodVO;

import java.util.List;

public interface MGoodService {
    
    public MGoodVO select(MGoodVO goodVO) throws Exception;
    
    public List<MGoodVO> selectList(MGoodVO goodVO) throws Exception;
    
    public int count(MGoodVO goodVO) throws Exception;
    
    public int insert(MGoodVO goodVO) throws Exception;
    
    public int update(MGoodVO goodVO) throws Exception;
}
