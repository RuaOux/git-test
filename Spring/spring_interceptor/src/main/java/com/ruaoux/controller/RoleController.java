package com.ruaoux.controller;

import com.ruaoux.domain.Role;
import com.ruaoux.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/role")
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        List<Role> list = roleService.list();
        // 设置模型对象
        mav.addObject("roleList",list);
        // 设置视图
        mav.setViewName("role-list");
        return mav;
    }

    @RequestMapping("/save")
    public String Rolesave(Role role){
        roleService.save(role);
        return "redirect:/role/list";
    }


}
