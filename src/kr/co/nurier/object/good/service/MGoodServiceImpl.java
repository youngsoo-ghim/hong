package kr.co.nurier.object.good.service;

import kr.co.nurier.object.good.dao.MGoodDAO;
import kr.co.nurier.vo.good.MGoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MGoodServiceImpl implements MGoodService{
    
    @Autowired
    private MGoodDAO mGoodDAO;
    
    @Override
    public MGoodVO select(MGoodVO goodVO) throws Exception {
        return this.mGoodDAO.select(goodVO);
    }
    
    @Override
    public List<MGoodVO> selectList(MGoodVO goodVO) throws Exception {
        return this.mGoodDAO.selectList(goodVO);
    }
    
    @Override
    public int count(MGoodVO goodVO) throws Exception {
        // TODO Auto-generated method stub
        return this.mGoodDAO.count(goodVO);
    }
    
    @Override
    public int insert(MGoodVO goodVO) throws Exception {
        return this.mGoodDAO.insert(goodVO);
    }
    
    @Override
    public int update(MGoodVO goodVO) throws Exception {
        return this.mGoodDAO.update(goodVO);
    }
}
