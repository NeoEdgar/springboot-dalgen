package com.xl.dy.platform.service.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.dy.common.util.ResultBuilder;
import com.xl.dy.dal.dao.HipUserDAO;

import java.util.*;

/**
 * @author LHJ
 */
@Service
public class TestService{
	
	@Autowired
	private HipUserDAO hipUserDAO;

	public String testAll() {
		return ResultBuilder.buildDataSuccess(hipUserDAO.getByPrimary(65L));
	}


	public static void main(String[] args) {
		List<String> classTime = new ArrayList<String>();
		classTime.add("b");
		classTime.add("b");
		classTime.add("b");
		classTime.add("a");
		classTime.add("a");
		classTime.add("a");
		classTime.add("c");
		classTime.add("c");

		classTime = new ArrayList<String>(new LinkedHashSet<String>(classTime));//去重保持当前排序
		System.out.println(classTime.toString());


		Collections.sort(classTime);


	}
   
}
