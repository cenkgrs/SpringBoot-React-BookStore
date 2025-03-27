package com.cenkgurses.controllers;

import com.cenkgurses.dto.user.DtoUser;
import com.cenkgurses.dto.user.DtoUserIU;
import org.springframework.web.bind.annotation.RestController;

public interface IUserController {

    public DtoUser createUser(DtoUserIU dtoUserIU);
}
