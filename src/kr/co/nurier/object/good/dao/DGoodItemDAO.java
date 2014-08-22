package kr.co.nurier.object.good.dao;

import kr.co.nurier.vo.good.DGoodItemVO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dGoodItemDAO")
public class DGoodItemDAO extends SqlSessionDaoSupport{
    public DGoodItemVO select(DGoodItemVO dGoodItemVO) throws Exception {
        return (DGoodItemVO) getSqlSession().selectOne("dGoodItemDAO.select",dGoodItemVO);
    }
    
    public List<DGoodItemVO> selectList(DGoodItemVO dGoodItemVO) throws Exception {
        return getSqlSession().selectList("dGoodItemDAO.selectList",dGoodItemVO); 
    }
    
    public int count(DGoodItemVO dGoodItemVO) throws Exception {
        return (Integer) getSqlSession().selectOne("dGoodItemDAO.count", dGoodItemVO);
    }   
    
    public int insert(DGoodItemVO dGoodItemVO) throws Exception {
        return getSqlSession().insert("dGoodItemDAO.goodOrderIsert",dGoodItemVO);
    }
    
    public int update(DGoodItemVO dGoodItemVO) throws Exception {
        return getSqlSession().update("dGoodItemDAO.update",dGoodItemVO);
    }
    
    public int delete(DGoodItemVO dGoodItemVO) throws Exception {
        return getSqlSession().update("dGoodItemDAO.delete",dGoodItemVO);
    }
}
