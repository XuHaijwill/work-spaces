package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
public class UserController {


    @RequestMapping(value = "/hello.do")
    @ResponseBody
    public Map<String,String> sayHello(){
        //json
        Map<String,String> map = new HashMap<>();
        map.put("name","Alvin");
        return map;
    }

    @RequestMapping("/user.do")
    public ModelAndView user(){
        ModelAndView mv = new ModelAndView("user");
        mv.addObject("name","Alvin");
        return mv;
    }


}
