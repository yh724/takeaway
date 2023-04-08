package com.yh.takeawaysystem.controller;

import com.yh.takeawaysystem.entity.User;
import com.yh.takeawaysystem.model.LoginValidator;
import com.yh.takeawaysystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody @Validated User user){
        userService.register(user);
        return new ResponseEntity<>("register success!",HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Validated LoginValidator loginValidator) {
        userService.login(loginValidator);
        return new ResponseEntity<>("login success", HttpStatus.OK);
    }

}
