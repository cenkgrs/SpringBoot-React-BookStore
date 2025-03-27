package com.cenkgurses.services.impl;

import com.cenkgurses.dto.user.DtoUser;
import com.cenkgurses.dto.user.DtoUserIU;
import com.cenkgurses.entities.User;
import com.cenkgurses.repositories.UserRepository;
import com.cenkgurses.services.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public DtoUser createUser(DtoUserIU dtoUserIU) {
        User user = new User();
        BeanUtils.copyProperties(dtoUserIU, user);

        User createdUser = userRepository.save(user);

        DtoUser dtoUser = new DtoUser();
        BeanUtils.copyProperties(createdUser, dtoUser);

        return dtoUser;
    }

    @Override
    public List<DtoUser> getUsers() {

        List<DtoUser> dtoUserList = new ArrayList<DtoUser>();

        List<User> userList = userRepository.findAll();

        for (User user: userList) {
            DtoUser dtoUser = new DtoUser();
            BeanUtils.copyProperties(user, dtoUser);

            dtoUserList.add(dtoUser);
        }

        return dtoUserList;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
