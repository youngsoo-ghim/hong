package kr.co.nurier.object.code.dao;

import kr.co.nurier.vo.code.MCommCdVO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("mCommCdDAO")
public class MCommCdDAO extends SqlSessionDaoSupport{
    public MCommCdVO select(MCommCdVO mCommCdVO) throws Exception {
        return (MCommCdVO) getSqlSession().selectOne("mCommCdDAO.select",mCommCdVO);
    }
    
    public List<MCommCdVO> selectList(MCommCdVO mCommCdVO) throws Exception {
        return getSqlSession().selectList("mCommCdDAO.selectList",mCommCdVO); 
    }
    
    public int count(MCommCdVO mCommCdVO) throws Exception {
        return (Integer) getSqlSession().selectOne("mCommCdDAO.count", mCommCdVO);
    }   
    
    public int insert(MCommCdVO mCommCdVO) throws Exception {
        return getSqlSession().insert("mCommCdDAO.insert",mCommCdVO);
    }
    
    public int update(MCommCdVO mCommCdVO) throws Exception {
        return getSqlSession().update("mCommCdDAO.update",mCommCdVO);
    }
    
    public int delete(MCommCdVO mCommCdVO) throws Exception {
        return getSqlSession().update("mCommCdDAO.delete",mCommCdVO);
    }
}
