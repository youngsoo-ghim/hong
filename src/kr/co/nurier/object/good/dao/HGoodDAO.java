package kr.co.nurier.object.good.dao;

import kr.co.nurier.vo.good.MGoodVO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("hGoodDAO")
public class HGoodDAO extends SqlSessionDaoSupport{
    public MGoodVO select(MGoodVO goodVO) throws Exception {
        return (MGoodVO) getSqlSession().selectOne("hGoodDAO.select",goodVO);
    }
    
    public List<MGoodVO> selectList(MGoodVO goodVO) throws Exception {
        return getSqlSession().selectList("hGoodDAO.selectList",goodVO); 
    }
    
    public int count(MGoodVO goodVO) throws Exception {
        return (Integer) getSqlSession().selectOne("hGoodDAO.count", goodVO);
    }   
    
    public int insert(MGoodVO goodVO) throws Exception {
        return getSqlSession().insert("hGoodDAO.insert",goodVO);
    }
    
    public int update(MGoodVO goodVO) throws Exception {
        return getSqlSession().update("hGoodDAO.update",goodVO);
    }
    
    public int delete(MGoodVO goodVO) throws Exception {
        return getSqlSession().update("hGoodDAO.delete",goodVO);
    }
}
