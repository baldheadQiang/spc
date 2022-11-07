package com.spc.controller;

import com.spc.entity.User;
import com.spc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model, User user){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user = userService.login(username,password);
        if(user!=null){
            model.addAttribute("res","登录成功！");
            return "index";
        }
        model.addAttribute("res","登录失败！");
        return "login";
    }
}
