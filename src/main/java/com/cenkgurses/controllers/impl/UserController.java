package com.cenkgurses.controllers.impl;

import com.cenkgurses.dto.user.DtoUser;
import com.cenkgurses.dto.user.DtoUserIU;
import com.cenkgurses.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/create")
    public DtoUser createUser(@RequestBody DtoUserIU dtoUserIU) {
        return userService.createUser(dtoUserIU);
    }

    @GetMapping("/list")
    public List<DtoUser> getUsers() {
        return userService.getUsers();
    }
}
