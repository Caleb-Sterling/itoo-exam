package com.tfjybj.itoo.exam;

import org.junit.Test;
import redis.clients.jedis.Jedis;


public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("112.126.72.101");
        jedis.ping();
        jedis.set("1","1");
        System.out.println(jedis.ping());
    }
}
