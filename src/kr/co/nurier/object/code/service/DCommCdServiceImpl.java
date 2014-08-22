package kr.co.nurier.object.code.service;

import kr.co.nurier.object.code.dao.DCommCdDAO;
import kr.co.nurier.vo.code.DCommCdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DCommCdServiceImpl implements DCommCdService{
    
    @Autowired
    private DCommCdDAO dCommCdDAO;
    
    @Override
    public DCommCdVO select(DCommCdVO dCommCdVO) throws Exception {
        return this.dCommCdDAO.select(dCommCdVO);
    }
    
    @Override
    public List<DCommCdVO> selectList(DCommCdVO dCommCdVO) throws Exception {
        return this.dCommCdDAO.selectList(dCommCdVO);
    }
    
    @Override
    public int count(DCommCdVO dCommCdVO) throws Exception {
        // TODO Auto-generated method stub
        return this.dCommCdDAO.count(dCommCdVO);
    }
    
    @Override
    public int insert(DCommCdVO dCommCdVO) throws Exception {
        return this.dCommCdDAO.insert(dCommCdVO);
    }
    
    @Override
    public int update(DCommCdVO dCommCdVO) throws Exception {
        return this.dCommCdDAO.update(dCommCdVO);
    }
}
