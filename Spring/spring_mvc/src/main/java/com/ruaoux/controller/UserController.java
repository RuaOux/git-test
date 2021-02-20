package com.ruaoux.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.fabric.xmlrpc.base.Data;
import com.ruaoux.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/xxx")
// http://localhost:80/xxx
public class UserController {

    @RequestMapping(value = "/quick16")
    @ResponseBody
    public void save16(String username, MultipartFile[] uploadFiles) throws IOException{
        // 获得上传文件的名称
        for (MultipartFile uploadFile : uploadFiles) {
            String of = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File("D:\\upload\\" + of));
        }
    }


    @RequestMapping(value = "/quick15")
    @ResponseBody
    public void save15(String username, MultipartFile uploadFile,MultipartFile uploadFile2) throws IOException{
        // 获得上传文件的名称
        String of = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("D:\\upload\\" + of));
        String of2 = uploadFile2.getOriginalFilename();
        uploadFile2.transferTo(new File("D:\\upload\\" + of2));
    }


    @RequestMapping(value = "/quick14")
    @ResponseBody
    public void save14(@CookieValue(value = "JSESSIOID") String jsessionId) throws IOException{
        System.out.println(jsessionId);
    }

    @RequestMapping(value = "/quick13")
    @ResponseBody
    public void save13(@CookieValue(value = "JSESSIOID") String jsessionId) throws IOException{
        System.out.println(jsessionId);
    }

    @RequestMapping(value = "/quick12")
    @ResponseBody
    public void save12(@RequestHeader(value = "User-Agent",required = false) String user_agent) throws IOException{

    }

    @RequestMapping(value = "/quick11")
    @ResponseBody
    public void save11(Data data) throws IOException{
        System.out.println(data);
    }

    @RequestMapping(value = "/quick10/{username}")
    @ResponseBody
    public void save10(@PathVariable("username") String username) throws IOException{
        System.out.println(username);
    }


    @RequestMapping("/quick14")
    @ResponseBody
    public void save9(@RequestParam("name") String username) throws IOException{
        System.out.println(username);
    }

    @RequestMapping("/quick8")
    @ResponseBody
    // 期望SpringMVC自动将User转换成json格式的字符串
    public void save8(String username,int age) throws IOException{
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping("/quick7")
    @ResponseBody
    // 期望SpringMVC自动将User转换成json格式的字符串
    public User save7() throws IOException{
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(30);
        return user;
    }

    @RequestMapping("/quick6")
    @ResponseBody
    public String save6() throws IOException{
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(24);
        // 使用json的转换工具将对象转换成json格式字符串在返回
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick5")
    @ResponseBody
    public String save5() throws IOException{
        return "hello world";
    }


    @RequestMapping("/quick4")
    public void save4(HttpServletResponse resp) throws IOException {
        resp.getWriter().print("hello world");
    }

    @RequestMapping("/quick3")
    public String save3(HttpServletRequest re){
        /*
            model：模型  作用封装数据
            View：视图   作用展示数据
         */
        re.setAttribute("username","酷丁鱼");
        return "/success.jsp";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        /*
            model：模型  作用封装数据
            View：视图   作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        // 设置视图名称
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }


    // 请求地址 http://localhost:80/xxx/quick
    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller save running...");
        return "/success.jsp";
    }
}
