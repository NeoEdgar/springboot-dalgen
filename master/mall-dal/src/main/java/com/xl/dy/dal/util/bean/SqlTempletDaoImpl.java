package com.xl.dy.dal.util.bean;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.dy.dal.util.SqlTempletDaoIf;
import com.xl.dy.dal.util.error.SqlTempletException;

@Service("SqlTempletDaoIf")
public class SqlTempletDaoImpl implements SqlTempletDaoIf {

	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
    public void execute(String argSqlStr) throws SqlTempletException {
        try {
            sqlSessionTemplate.update("com.xl.ds.dao.SqlTempletMapper.update", argSqlStr);
        } catch (Exception e) {
            throw new SqlTempletException(e.getMessage(), e);
        }
    }

    public int update(String argSqlStr) throws SqlTempletException {
        try {
           return sqlSessionTemplate.update("com.xl.ds.dao.SqlTempletMapper.update", argSqlStr);
        } catch (Exception e) {
            throw new SqlTempletException(e.getMessage(), e);
        }
    }

    public List<Map> executeQuery(String argSqlStr) throws SqlTempletException {
        try {
            return sqlSessionTemplate.selectList("com.xl.ds.dao.SqlTempletMapper.select",argSqlStr);
        } catch (Exception e) {
            throw new SqlTempletException(e.getMessage(), e);
        }
    }
    
    public Map selectMap(String argSqlStr) throws SqlTempletException {
    	try {
    		return sqlSessionTemplate.selectOne("com.xl.ds.dao.SqlTempletMapper.select", argSqlStr);
    	} catch (Exception e) {
    		throw new SqlTempletException(e.getMessage(), e);
    	}
    }

    public int insert(String argSqlStr) throws SqlTempletException {
        try {
            return sqlSessionTemplate.insert("com.xl.ds.dao.SqlTempletMapper.insert", argSqlStr);
        } catch (Exception e) {
            throw new SqlTempletException(e.getMessage(), e);
        }
    }
    public Connection getDbConn()
    {
    	return sqlSessionTemplate.getConnection();
    }

	@Override
	public List<Map> call(String argSqlStr,String argRoute)
			throws SqlTempletException {
		try {
			String route="";
			if(argRoute!=null)
				route=argRoute;
    		return sqlSessionTemplate.selectList("com.xl.ds.dao.SqlTempletMapper.select", route+argSqlStr);
    	} catch (Exception e) {
    		throw new SqlTempletException(e.getMessage(), e);
    	}
	}
}
