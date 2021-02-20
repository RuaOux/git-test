package com.ruaoux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TargetController {

    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("目标资源执行中");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","ruaoux");
        mv.setViewName("index");
        return mv;
    }

}
