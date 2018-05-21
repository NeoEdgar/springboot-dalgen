package com.xl.dy.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.*;

public class FastJsonUtils {

	private static Map<String, List<String>> valueMap = new HashMap<String, List<String>>();

	/**
	 * 遍历json串，把结果放在valueMap中
	 * 
	 * @param jsonStr
	 */
	private static void setValueMap(String jsonStr) {

		LinkedHashMap<String, String> jsonMap = JSON.parseObject(jsonStr,
				new TypeReference<LinkedHashMap<String, String>>() {
				});
		for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			List<String> valueList = null;
			if (valueMap.containsKey(key)) {
				valueList = valueMap.get(key);
			} else {
				valueList = new ArrayList<String>();
			}
			valueList.add(value);

			// 如果value为数组或对象，则需要调用自身，继续遍历，直到value不是数组，对象为止
			if (value.contains("[") || value.contains("{")) {
				// 若为[,表示多值，需要转成JSONArray，而不是JSONObject
				if (value.startsWith("[")) {
					JSONArray jsonArray = JSON.parseArray(value);
					for (int i = 0; i < jsonArray.size(); i++) {
						setValueMap(jsonArray.getString(i));
					}
				} else {
					setValueMap(value);
				}

			} else {
				valueMap.put(key, valueList);
			}
		}
	}

	/**
	 * 获取报文中某个节点的值
	 * 
	 * @param jsonStr
	 * @param name
	 * @return
	 */
	public static List<String> getValueByName(String jsonStr, String name) {
		List<String> valueList = null;
		try {
			valueList = new ArrayList<String>();
			setValueMap(jsonStr);
			valueList = valueMap.get(name);
			return valueList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			valueMap.clear();
		}
		return valueList;

	}

	/**
	 * 修改报文中，某个节点的值
	 * 
	 * @param jsonStr
	 * @param name
	 * @param value
	 * @return
	 */
	public String setValueByName(String jsonStr, String name, String value) {
		List<String> valueList = getValueByName(jsonStr, name);
		if (valueList != null) {
			// 用传进来的值value，替换原始数据
			jsonStr = jsonStr.replace(valueList.get(0), value);
		} else {
			return null;
		}
		return jsonStr;
	}
	
	
	public static <T>  T getData(String result, Class<T> T){
		JSONObject obj = JSON.parseObject(result);
		if(obj.getInteger("code")!=200){
			return null;
		}
		return JSON.parseObject(obj.getString("data"), T);
	}
	
	public static <T>  List<T> getListData(String result, Class<T> T){
		JSONObject obj = JSON.parseObject(result);
		if(obj.getInteger("code")!=200){
			return null;
		}
		return JSON.parseArray(obj.getString("data"), T);
	}
	
	public static  boolean callSuccess(String result){
		JSONObject obj = JSON.parseObject(result);
		if(obj.getInteger("code")!=200){
			return false;
		}
		return true;
	}

}
