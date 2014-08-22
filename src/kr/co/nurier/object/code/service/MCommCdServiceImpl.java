package kr.co.nurier.object.code.service;

import kr.co.nurier.object.code.dao.MCommCdDAO;
import kr.co.nurier.vo.code.MCommCdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MCommCdServiceImpl implements MCommCdService{
    
    @Autowired
    private MCommCdDAO mCommCdDAO;
    
    @Override
    public MCommCdVO select(MCommCdVO mCommCdVO) throws Exception {
        return this.mCommCdDAO.select(mCommCdVO);
    }
    
    @Override
    public List<MCommCdVO> selectList(MCommCdVO mCommCdVO) throws Exception {
        return this.mCommCdDAO.selectList(mCommCdVO);
    }
    
    @Override
    public int count(MCommCdVO mCommCdVO) throws Exception {
        // TODO Auto-generated method stub
        return this.mCommCdDAO.count(mCommCdVO);
    }
    
    @Override
    public int insert(MCommCdVO mCommCdVO) throws Exception {
        return this.mCommCdDAO.insert(mCommCdVO);
    }
    
    @Override
    public int update(MCommCdVO mCommCdVO) throws Exception {
        return this.mCommCdDAO.update(mCommCdVO);
    }
}
