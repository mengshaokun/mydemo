package com.msk.springcache;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msk.springcache.entity.User;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJson {

    @Test
    public void test1() throws Exception{
        User user = new User();
        user.setName("zz");
        user.setAge(1);
        user.setBirthday(new Date());

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);
        User user1 = objectMapper.readValue(s, User.class);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(user1.getBirthday()));

    }


}
