package kr.co.nurier.object.code.dao;

import kr.co.nurier.vo.code.DCommCdVO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dCommCdDAO")
public class DCommCdDAO extends SqlSessionDaoSupport{
    public DCommCdVO select(DCommCdVO dCommCdVO) throws Exception {
        return (DCommCdVO) getSqlSession().selectOne("dCommCdDAO.select",dCommCdVO);
    }
    
    public List<DCommCdVO> selectList(DCommCdVO dCommCdVO) throws Exception {
        return getSqlSession().selectList("dCommCdDAO.selectList",dCommCdVO); 
    }
    
    public int count(DCommCdVO dCommCdVO) throws Exception {
        return (Integer) getSqlSession().selectOne("dCommCdDAO.count", dCommCdVO);
    }   
    
    public int insert(DCommCdVO dCommCdVO) throws Exception {
        return getSqlSession().insert("dCommCdDAO.insert",dCommCdVO);
    }
    
    public int update(DCommCdVO dCommCdVO) throws Exception {
        return getSqlSession().update("dCommCdDAO.update",dCommCdVO);
    }
    
    public int delete(DCommCdVO dCommCdVO) throws Exception {
        return getSqlSession().update("dCommCdDAO.delete",dCommCdVO);
    }
}