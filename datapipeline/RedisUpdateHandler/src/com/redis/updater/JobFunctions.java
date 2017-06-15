package com.redis.updater;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class JobFunctions {
	
	Jedis jedis;
	
	public void createJedisConn(String ip) {
		jedis = new Jedis(ip, 6379);
	}
	
	public Map<String, String> getMetricURIList(String key) throws IOException {
		if(jedis.exists(key)) {
			return jedis.hgetAll(key);
		} else {
			FileReader f = new FileReader(key+".lst");
			BufferedReader br = new BufferedReader(f);
			String nextLine = null;
			
			//read from disk and create map			
			while((nextLine = br.readLine()) != null) {
				jedis.hset(key, nextLine, "0");
			}
			
			br.close();
			
			return getMetricURIList(key);
		}
	}
	
	public void updateMetricURIList(String key, String field, String val) throws IOException {
		jedis.hset(key, field, val);
	}
	
	public void pushMetricVal(String key, String val) throws IOException {
		long ret = jedis.lpush(key, val);
		System.out.println(ret);
	}
}