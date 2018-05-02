package com.f22pkj31.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public void add(String key, String string, Long time) {
        stringRedisTemplate.opsForValue().set(key, string, time, TimeUnit.MINUTES);
    }

    public String get(String key) {
        String source = stringRedisTemplate.opsForValue().get(key);
        return source;
    }
    public void delete(String key) {
        stringRedisTemplate.opsForValue().getOperations().delete(key);
    }
}