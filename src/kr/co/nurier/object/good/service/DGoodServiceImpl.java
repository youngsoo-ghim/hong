package kr.co.nurier.object.good.service;

import kr.co.nurier.object.good.dao.DGoodDAO;
import kr.co.nurier.vo.good.DGoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DGoodServiceImpl implements DGoodService{
    
    @Autowired
    private DGoodDAO dGoodDAO;
    
    @Override
    public DGoodVO select(DGoodVO dGoodVO) throws Exception {
        return this.dGoodDAO.select(dGoodVO);
    }
    
    @Override
    public List<DGoodVO> selectList(DGoodVO dGoodVO) throws Exception {
        return this.dGoodDAO.selectList(dGoodVO);
    }
    
    @Override
    public int count(DGoodVO dGoodVO) throws Exception {
        // TODO Auto-generated method stub
        return this.dGoodDAO.count(dGoodVO);
    }
    
    @Override
    public int insert(DGoodVO dGoodVO) throws Exception {
        return this.dGoodDAO.insert(dGoodVO);
    }
    
    @Override
    public int update(DGoodVO dGoodVO) throws Exception {
        return this.dGoodDAO.update(dGoodVO);
    }
}
