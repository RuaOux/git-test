package com.ruaoux.controller;

import com.ruaoux.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/index")
    public String show(@RequestParam(value = "name",required = true)String name) throws FileNotFoundException{
        System.out.println("show running....");
        demoService.show1();
        return "index";
    }

}
