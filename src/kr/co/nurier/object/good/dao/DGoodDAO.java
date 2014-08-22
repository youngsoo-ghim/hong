package kr.co.nurier.object.good.dao;

import kr.co.nurier.vo.good.DGoodVO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dGoodDAO")
public class DGoodDAO extends SqlSessionDaoSupport{
    public DGoodVO select(DGoodVO dGoodVO) throws Exception {
        return (DGoodVO) getSqlSession().selectOne("dGoodDAO.select",dGoodVO);
    }
    
    public List<DGoodVO> selectList(DGoodVO dGoodVO) throws Exception {
        return getSqlSession().selectList("dGoodDAO.selectList",dGoodVO); 
    }
    
    public int count(DGoodVO dGoodVO) throws Exception {
        return (Integer) getSqlSession().selectOne("dGoodDAO.count", dGoodVO);
    }   
    
    public int insert(DGoodVO dGoodVO) throws Exception {
        return getSqlSession().insert("dGoodDAO.goodIsert",dGoodVO);
    }
    
    public int update(DGoodVO dGoodVO) throws Exception {
        return getSqlSession().update("dGoodDAO.update",dGoodVO);
    }
    
    public int delete(DGoodVO dGoodVO) throws Exception {
        return getSqlSession().update("dGoodDAO.delete",dGoodVO);
    }
}
