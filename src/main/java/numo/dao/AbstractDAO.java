package numo.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class AbstractDAO {
	protected Log log = LogFactory.getLog(AbstractDAO.class);
    
    @Autowired
    private SqlSessionTemplate sqlSession;
     
    protected void printQueryId(String queryId) {
        if(log.isDebugEnabled()){
            log.debug("\t QueryId  \t:  " + queryId);
        }
    }
     
    public Object insert(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.insert(queryId, params);
    }
     
    public Object update(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.update(queryId, params);
    }
     
    public Object delete(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.delete(queryId, params);
    }
     
    public Object selectOne(String queryId) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId);
    }
     
    public Object selectOne(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId, params);
    }
     
    @SuppressWarnings("rawtypes")
    public List selectList(String queryId){
        printQueryId(queryId);
        return sqlSession.selectList(queryId);
    }
     
    @SuppressWarnings("rawtypes")
    public List selectList(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectList(queryId,params);
    }

    public Map<String, Object> selectMapOne(String queryId) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId);
    }

    public Map<String, Object> selectMapOne(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId, params);
    }

    @SuppressWarnings("rawtypes")
    public List<Map<String, Object>> selectMapList(String queryId) {
        printQueryId(queryId);
        return sqlSession.selectList(queryId);
    }

    @SuppressWarnings("rawtypes")
    public List<Map<String, Object>> selectMapList(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectList(queryId, params);
    }
}