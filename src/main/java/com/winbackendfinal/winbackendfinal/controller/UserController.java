package com.winbackendfinal.winbackendfinal.controller;

import com.winbackendfinal.winbackendfinal.configurations.utils.CustomPrincipal;
import com.winbackendfinal.winbackendfinal.model.User;
import com.winbackendfinal.winbackendfinal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;// per restituire webControllers
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("all")
    public List<User> all(@AuthenticationPrincipal CustomPrincipal customPrincipal){

        return userService.findall();

    }

    @PostMapping("save")
    public String save(@RequestBody User user){

        return userService.saveuser(user);

    }

}
