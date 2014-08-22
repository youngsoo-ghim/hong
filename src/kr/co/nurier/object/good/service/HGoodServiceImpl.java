package kr.co.nurier.object.good.service;

import kr.co.nurier.object.good.dao.HGoodDAO;
import kr.co.nurier.vo.good.MGoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HGoodServiceImpl implements HGoodService{
    
    @Autowired
    private HGoodDAO hGoodDAO;
    
    @Override
    public MGoodVO select(MGoodVO goodVO) throws Exception {
        return this.hGoodDAO.select(goodVO);
    }
    
    @Override
    public List<MGoodVO> selectList(MGoodVO goodVO) throws Exception {
        return this.hGoodDAO.selectList(goodVO);
    }
    
    @Override
    public int count(MGoodVO goodVO) throws Exception {
        // TODO Auto-generated method stub
        return this.hGoodDAO.count(goodVO);
    }
    
    @Override
    public int insert(MGoodVO goodVO) throws Exception {
        return this.hGoodDAO.insert(goodVO);
    }
    
    @Override
    public int update(MGoodVO goodVO) throws Exception {
        return this.hGoodDAO.update(goodVO);
    }
}
