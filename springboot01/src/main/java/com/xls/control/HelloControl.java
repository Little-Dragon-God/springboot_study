package com.xls.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello springboot";
    }
}
