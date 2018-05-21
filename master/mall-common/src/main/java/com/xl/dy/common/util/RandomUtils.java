
package com.xl.dy.common.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class RandomUtils {
    public static Random random = new Random();

    public RandomUtils() {
    }

    public static String getRandom(int length) {
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            boolean isChar = random.nextInt(2) % 2 == 0;
            if (isChar) {
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
                ret.append((char)(choice + random.nextInt(26)));
            } else {
                ret.append(Integer.toString(random.nextInt(10)));
            }
        }

        return ret.toString();
    }

    public static String getRandomNumber(int length) {
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            ret.append(Integer.toString(random.nextInt(10)));
        }

        return ret.toString();
    }
    /**
     * 
    * @Title: getResultByPercent 
    * @Description: 按百分比选择结果（只支持两位小数）
    * @param @param map
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    public static String getResultByPercent(Map<String,BigDecimal> map){
    	if(checkIllegal(map)){
    		BigDecimal result = new BigDecimal((double)random.nextInt(100)/100);
    		BigDecimal totalValue = new BigDecimal(0);
    		for(Entry<String, BigDecimal> entry: map.entrySet()){
    			totalValue = totalValue.add(entry.getValue());
    			if(totalValue.compareTo(result)>=0){
    				return entry.getKey();
    			}
    		}
    	}
    	return null;
    }

	private static boolean checkIllegal(Map<String, BigDecimal> map) {
//		Collection<BigDecimal> values = map.values();
//    	BigDecimal totalValue = new BigDecimal(0);
//    	for(BigDecimal value:values){
//    		totalValue.add(value);
//    	}
//    	if(new BigDecimal(1).compareTo(totalValue)!=0){
//    		return false;
//    	}
    	return true;
	}
	/**
	 * 
	* @Title: getSelectedList 
	* @Description: 从List中随机获取指定数量的集合（不重复）
	* @param @param list
	* @param @param num
	* @return List<T>    返回类型 
	* @throws
	 */
	public static <T> List<T> getSelectedList(List<T> list, int num) {
		List<T> selectedList = new ArrayList<T>();
		if(list.size()<num){
		selectedList.addAll(list);
		return selectedList;
		}
		 
   	     for(int i=0;i<num;i++){
   	    	Random rd=new Random();
   	        int index =rd.nextInt(list.size());
   	        selectedList.add(list.get(index));
   	        list.remove(index);
   	     }
		return selectedList;
	}
}
