package com.msk.springcache.service.impl;

import com.msk.springcache.entity.User;
import com.msk.springcache.service.TestCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TestCacheServiceImpl implements TestCacheService {

    @Override
    @Cacheable("user")
    public Object getUserInfo(String name) {
        System.out.println(name);
        return this.getUser(name);
    }


    private User getUser(String name) {
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("name: " + name);
        User user = new User();
        user.setBirthday(new Date());
        user.setAge(12);
        user.setName(name);
        return user;
    }
}
