package com.xl.dy.common.util.dy;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class IdGenFactory {
	private static Long workerId;
	private static Long datacenterId;
	private static ConcurrentMap<String, SnowflakeIdWorker> concurrentMap = new ConcurrentHashMap<>();
	private IdGenFactory()
	{
	}
	/**
	 * 设置全局工作ID
	 * @param workerId
	 */
	public static void setWorkerId(Long workerId) {
		IdGenFactory.workerId = workerId;
	}
	/**
	 * 设置数据中心ID
	 * @param datacenterId
	 */
	public static void setDatacenterId(Long datacenterId) {
		IdGenFactory.datacenterId = datacenterId;
	}
	
	public static Long getId()
	{
		if(workerId==null)
		{
			workerId=1l;
		}
		if(datacenterId==null)
		{
			datacenterId=1l;
		}
		String key=workerId.toString()+datacenterId.toString();
		SnowflakeIdWorker idWorker=concurrentMap.get(key);
		if(idWorker==null)
		{
			idWorker=new SnowflakeIdWorker(workerId,datacenterId);
			concurrentMap.put(key, idWorker);
		}
		return idWorker.nextId();
	}
	
	public static Long getTimeStamp() {
		Long timeStamp = System.currentTimeMillis();
		timeStamp = timeStamp/1000;
		return timeStamp;
	}

}
