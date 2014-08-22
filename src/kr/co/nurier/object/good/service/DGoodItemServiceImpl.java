package kr.co.nurier.object.good.service;

import kr.co.nurier.object.good.dao.DGoodItemDAO;
import kr.co.nurier.vo.good.DGoodItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DGoodItemServiceImpl implements DGoodItemService{
    
    @Autowired
    private DGoodItemDAO dGoodItemDAO;
    
    @Override
    public DGoodItemVO select(DGoodItemVO dGoodItemVO) throws Exception {
        return this.dGoodItemDAO.select(dGoodItemVO);
    }
    
    @Override
    public List<DGoodItemVO> selectList(DGoodItemVO dGoodItemVO) throws Exception {
        return this.dGoodItemDAO.selectList(dGoodItemVO);
    }
    
    @Override
    public int count(DGoodItemVO dGoodItemVO) throws Exception {
        // TODO Auto-generated method stub
        return this.dGoodItemDAO.count(dGoodItemVO);
    }
    
    @Override
    public int insert(DGoodItemVO dGoodItemVO) throws Exception {
        return this.dGoodItemDAO.insert(dGoodItemVO);
    }
    
    @Override
    public int update(DGoodItemVO dGoodItemVO) throws Exception {
        return this.dGoodItemDAO.update(dGoodItemVO);
    }
}
