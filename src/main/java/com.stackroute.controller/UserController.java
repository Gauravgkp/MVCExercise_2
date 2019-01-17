package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.stackroute.service.User;

@Controller
public class UserController {

    @RequestMapping("/")
    public String view(ModelMap map){
        return "index";
    }

    @RequestMapping("userForm")
    public ModelAndView userForm(@RequestParam("userName") String userName, @RequestParam("password") String password){
        User user = new User(userName,password);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greeting");
        modelAndView.addObject("greeting",user.getUserName());
        return modelAndView;
    }

}
