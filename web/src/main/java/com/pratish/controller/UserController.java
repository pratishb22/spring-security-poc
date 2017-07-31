package com.pratish.controller;

import com.pratish.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(LoginDTO loginDTO) {

        return "redirect:/user/dashboard";
    }

    @RequestMapping(value = "dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @RequestMapping(value = "list")
    public String list() {
        return "list";
    }

    @RequestMapping(value = "register")
    public String register() {
        return "register";
    }

}
