package com.xl.dy.dal.util;

import com.xl.dy.dal.util.error.SqlTempletException;

public interface TreeFunctionServiceIf {
	/**
	 * 
	 * @Title: getTreeParentIds 
	 * @Description: 获得所有父节点IDS
	 * @author: lenovo
	 * @param argChildId
	 * @param argTableName
	 * @param argIdColName
	 * @param argPidColName
	 * @return
	 * @throws SqlTempletException
	 * @return: String
	 */
	public String getTreeParentIds(Long argChildId,String argTableName,String argIdColName,String argPidColName)  throws SqlTempletException;
}
