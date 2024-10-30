package com.codegym.c0624g1i18n.controller;

import com.codegym.c0624g1i18n.model.User;
import com.codegym.c0624g1i18n.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("/user/login");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }
}
