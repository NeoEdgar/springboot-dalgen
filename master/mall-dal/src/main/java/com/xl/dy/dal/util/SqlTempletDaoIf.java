package com.xl.dy.dal.util;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.xl.dy.dal.util.error.SqlTempletException;

public interface SqlTempletDaoIf {
    /**
     * 执行SQL
     * execute:方法描述
     *
     * @author 张晓冬
     * @param argSqlStr
     * @throws SqlTempletException
     */
    public void execute(String argSqlStr) throws SqlTempletException;
    /**
     * 执行更新SQL
     * update:方法描述
     *
     * @author 张晓冬
     * @param argSqlStr
     * @return 影响行数
     * @throws SqlTempletException
     */
    public int update(String argSqlStr)  throws SqlTempletException;
    /**
     * 
     * executeQuery:方法描述
     *
     * @author 张晓冬
     * @param argSqlStr
     * @return 查询结果
     * @throws SqlTempletException
     */
    public List<Map> executeQuery(String argSqlStr)  throws SqlTempletException;
    
    /**
     * @Title: selectMap   
     * @Description: TODO   
     * @author: lingy
     * @param: @param argSqlStr
     * @param: @return
     * @param: @throws SqlTempletException      
     * @return: Map<K,V>      
     * @throws
     */
    public Map selectMap(String argSqlStr) throws SqlTempletException;
    /**
     * 
     * @Title: call 
     * @Description: 执行存储过程
     * @author: lenovo
     * @param argSqlStr
     * @param argRoute
     * @return
     * @throws SqlTempletException
     * @return: List<Map>
     */
    public List<Map> call(String argSqlStr,String argRoute) throws SqlTempletException;
    
    /**
     * 执行插入SQL
     * insert:方法描述
     *
     * @author 张晓冬
     * @param argSqlStr
     * 
     * @return 影响行数
     * @throws SqlTempletException
     */
    public int insert(String argSqlStr)  throws SqlTempletException;
    /**
     * 获得数据库链接
     * @return
     * @throws SqlTempletException
     */
    public Connection getDbConn();
   
}
