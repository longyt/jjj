package com.zking;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import sun.security.util.Password;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: longyt
 * @create: 2018-03-04 11:04
 * @desc:
 **/
public class testJrebel {
    private Jedis jedis;

    public static void main(String[] args) {

    }

    @Before
    public void INIT(){
        jedis=new Jedis("192.168.152.128",6379);
        /*String password = jedis.auth("password");
        System.out.println(password);*/
        jedis.auth("password");
        System.out.println(" auth  ok");
    }

    @Test
    public void testString(){
        jedis.mset("name","jk","age", "12","sex","男");
        System.out.println("save ok");
    }

    @Test
    public void testHasMap(){
        /*Map<String ,String > map=new HashMap<String, String>();
        map.put("mname","longyt");
        map.put("mage","11");
        map.put("msex","男");
        jedis.hmset("testHasmap",map);
*/
        jedis.del("testHasmap");
        System.out.println(jedis.hkeys("testHasmap"));
    }

    @Test
    public void testList(){
        jedis.lpush("list","longyt");
        jedis.lpush("list","男");
        jedis.lpush("list","22");

        System.out.println(jedis.lrange("list", 0, 3));
    }

    @Test
    public void testSet(){
        jedis.sadd("set","aaa");
        jedis.sadd("set","bbb");
        jedis.sadd("set","ccc");
        jedis.sadd("set","ddd");

        System.out.println(jedis.smembers("set"));
        System.out.println(jedis.srandmember("set",3));
        System.out.println("okaadsadsadsaaa");
    }
}
