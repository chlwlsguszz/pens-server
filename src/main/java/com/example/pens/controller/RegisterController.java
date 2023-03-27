package com.example.pens.controller;

import com.example.pens.domain.UserRequest;
import com.example.pens.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RegisterController {
    private final UserService userService;

    @PostMapping("/register")
    public String Register(@RequestBody UserRequest request) {
        return userService.register(request);
    }
}