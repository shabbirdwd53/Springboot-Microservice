package com.dailycodebuffer.user.controller;

import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        System.out.println("3:10 Anubhav added his first commit");
        System.out.println("4:05 Anubhav added his second commit");
       
        System.out.println("4:36 Anubhav added his 3rd commit");

       System.out.println("4:11 Om added his first commit");

        return userService.saveUser(user);
    }




}
