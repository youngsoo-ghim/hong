package kr.co.nurier.object.bbs.dao;

import kr.co.nurier.vo.bbs.BbsVO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bbsDAO")
public class BBSDAO extends SqlSessionDaoSupport{
    public BbsVO select(BbsVO bbsVO) throws Exception {
        return (BbsVO) getSqlSession().selectOne("bbsDAO.select",bbsVO);
    }
    
    public List<BbsVO> selectList(BbsVO bbsVO) throws Exception {
        return getSqlSession().selectList("bbsDAO.selectList",bbsVO); 
    }
    
    public int count(BbsVO bbsVO) throws Exception {
        return (Integer) getSqlSession().selectOne("bbsDAO.count", bbsVO);
    }   
    
    public int insert(BbsVO bbsVO) throws Exception {
        return getSqlSession().insert("bbsDAO.insert",bbsVO);
    }
    
    public int update(BbsVO bbsVO) throws Exception {
        return getSqlSession().update("bbsDAO.update",bbsVO);
    }
    
    public int delete(BbsVO bbsVO) throws Exception {
        return getSqlSession().update("bbsDAO.delete",bbsVO);
    }
}
