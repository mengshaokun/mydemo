package com.msk.springcache.controller;

import com.msk.springcache.service.TestCacheService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestCacheController {

    @Resource
    private TestCacheService testCacheService;

    @PostMapping("/cache")
    public Object testCache(String name) {
        return testCacheService.getUserInfo(name);
    }


}
