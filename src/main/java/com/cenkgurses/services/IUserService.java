package com.cenkgurses.services;

import com.cenkgurses.dto.user.DtoUser;
import com.cenkgurses.dto.user.DtoUserIU;
import com.cenkgurses.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {

    public DtoUser createUser(DtoUserIU dtoUserIU);

    public List<DtoUser> getUsers();

    public DtoUser getUser(Long id);

    public User updateUser(Long id, User user);

    public void deleteUser(Long id);

}
