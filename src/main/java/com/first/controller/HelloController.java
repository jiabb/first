package com.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hoperun on 2018/3/16.
 */
@RestController
public class HelloController {

        @GetMapping(value="/say")
    public String sayHello(@RequestParam(name="id",required = false,defaultValue = "0") String myId){
        return "Hello :" + myId;
    }
}
