package com.cenkgurses.controllers.impl;

import com.cenkgurses.controllers.IUserController;
import com.cenkgurses.dto.user.DtoUser;
import com.cenkgurses.dto.user.DtoUserIU;
import com.cenkgurses.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController implements IUserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/create")
    @Override
    public DtoUser createUser(@RequestBody DtoUserIU dtoUserIU) {
        return userService.createUser(dtoUserIU);
    }

    @GetMapping("/list")
    @Override
    public List<DtoUser> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/list/{id}")
    @Override
    public DtoUser getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PutMapping("/update/{id}")
    @Override
    public DtoUser updateUser(@PathVariable Long id, @RequestBody DtoUserIU dtoUserIU) {
        return userService.updateUser(id, dtoUserIU);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }


}
