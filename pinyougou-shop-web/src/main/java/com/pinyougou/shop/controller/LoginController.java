package com.pinyougou.shop.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @描述:
 * @创建人: 柯南_java
 * @修改人和其它信息:
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping( value = "name")
    public Map name(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map map=new HashMap();
        map.put("logName",name);
        return map;
    }
}


