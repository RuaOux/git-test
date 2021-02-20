package com.ruaoux.controller;

import com.ruaoux.domain.Role;
import com.ruaoux.domain.User;
import com.ruaoux.service.RoleService;
import com.ruaoux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        List<User> list = userService.list();
        // 设置模型对象
        mav.addObject("userList",list);
        // 设置视图
        mav.setViewName("user-list");
        return mav;
    }

    @RequestMapping("/saveUI")
    public ModelAndView saveUI(){
        ModelAndView mav = new ModelAndView();
        List<Role> roles = roleService.list();
        mav.addObject("roleList",roles);
        mav.setViewName("user-add");
        return mav;
    }

    @RequestMapping("/save")
    public String save(User user,Long[] roleIds){
        userService.save(user,roleIds);
        return "redirect:/user/list";
    }

    @RequestMapping("/del/{userId}")
    public String del(@PathVariable("userId")long userId){
        userService.del(userId);
        return "redirect:/user/list";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        User user = userService.login(username,password);
        if (user != null) {
            // 登录成功
            session.setAttribute("user",user);
            return "redirect:/index.jsp";
        }

        return "redirect:/login";
    }



}
