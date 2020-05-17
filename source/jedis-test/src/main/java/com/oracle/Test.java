package com.oracle;

import redis.clients.jedis.BinaryClient;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        Jedis jedis = new Jedis("192.168.30.181",6379);
        /*jedis.set("name-one","tom");
        // 批量存储字符串
        jedis.mset("name2","jim","name3","rose");
        List<String> list = jedis.mget("name-one","name2","name3");
        System.out.println(list);
        jedis.set("n1","10");
        jedis.incr("n1");
        System.out.println(jedis.get("n1"));

        jedis.lpush("list1","a","b","c");
        list = jedis.lrange("list1",0,-1);
        System.out.println(list);

        Map<String,String> map = new HashMap<String,String>();
        map.put("100","tom");
        map.put("101","jim");
        map.put("102","king");
        jedis.hmset("h1",map);
        jedis.hset("h1","103","rose");

        list = jedis.hmget("h1","100","101","102","103");
        System.out.println(list);
        map = jedis.hgetAll("h1");
        System.out.println(map);

        jedis.zadd("zs1",10,"tom");
        // jim 20   king 30
        Map<String,Double> m = new HashMap<String,Double>();
        m.put("jim",20d);
        m.put("king",30d);
        jedis.zadd("zs1",m);

        Set<String> set  = jedis.zrevrange("zs1",0,-1);
        System.out.println(set);

        System.out.println(jedis.type("zs1"));*/
/*        System.out.println(jedis.get("a"));
        Transaction transaction = jedis.multi();
        jedis.incr("a");
        transaction.exec();*/

        jedis.linsert("names", BinaryClient.LIST_POSITION.BEFORE,"阿根廷","尼日利亚");



        while(true) {
            jedis.incr("a");
            System.out.println(jedis.get("a"));
        }

    }
}
