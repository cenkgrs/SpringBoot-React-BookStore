package com.cenkgurses.services;

import com.cenkgurses.dto.user.DtoUser;
import com.cenkgurses.dto.user.DtoUserIU;

import java.util.List;

public interface IUserService {

    public DtoUser createUser(DtoUserIU dtoUserIU);

    public List<DtoUser> getUsers();

    public DtoUser getUser(Long id);

    public DtoUser updateUser(Long id, DtoUserIU dtoUserIU);

    public void deleteUser(Long id);

}
