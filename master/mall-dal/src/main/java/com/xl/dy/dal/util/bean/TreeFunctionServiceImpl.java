package com.xl.dy.dal.util.bean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.xl.dy.dal.util.SqlTempletDaoIf;
import com.xl.dy.dal.util.TreeFunctionServiceIf;
import com.xl.dy.dal.util.error.SqlTempletException;

@Service("TreeFunctionServiceIf")
public class TreeFunctionServiceImpl implements TreeFunctionServiceIf {

	@Autowired
	@Qualifier("SqlTempletDaoIf")
	private SqlTempletDaoIf sqlTempletDaoIf;

	@Override
	public String getTreeParentIds(Long argChildId, String argTableName,
			String argIdColName, String argPidColName)
			throws SqlTempletException {
		//String route="/*!mycat: sql=select 1 from "+argTableName+" */  ";
		String route="";
		String fFr = "";
		String sql = "call P_GET_TREE_PARENT_IDS(" + argChildId + ",'"
				+ argTableName + "','" + argIdColName + "','" + argPidColName
				+ "')";
		List<Map> result = sqlTempletDaoIf.call(sql,route);
		if (result == null || result.size() == 0) {
			fFr = "";
		} else {
			fFr = (String) result.get(0).get("ffr");
		}
		return fFr;
	}

}
