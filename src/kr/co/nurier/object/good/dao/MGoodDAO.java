package kr.co.nurier.object.good.dao;

import kr.co.nurier.vo.good.MGoodVO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("mGoodDAO")
public class MGoodDAO extends SqlSessionDaoSupport{
    public MGoodVO select(MGoodVO goodVO) throws Exception {
        return (MGoodVO) getSqlSession().selectOne("mGoodDAO.select",goodVO);
    }
    
    public List<MGoodVO> selectList(MGoodVO goodVO) throws Exception {
        return getSqlSession().selectList("mGoodDAO.selectList",goodVO); 
    }
    
    public int count(MGoodVO goodVO) throws Exception {
        return (Integer) getSqlSession().selectOne("mGoodDAO.count", goodVO);
    }   
    
    public int insert(MGoodVO goodVO) throws Exception {
        return getSqlSession().insert("mGoodDAO.goodOrderIsert",goodVO);
    }
    
    public int update(MGoodVO goodVO) throws Exception {
        return getSqlSession().update("mGoodDAO.update",goodVO);
    }
    
    public int delete(MGoodVO goodVO) throws Exception {
        return getSqlSession().update("mGoodDAO.delete",goodVO);
    }
}
