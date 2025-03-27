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
import java.util.Optional;

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
    public DtoUser getUser(Long id) {

        DtoUser responseUser = new DtoUser();
        Optional<User> optional = userRepository.findById(id);

        if (optional.isPresent()) {
            User dbUser = optional.get();
            BeanUtils.copyProperties(dbUser, responseUser);

            return responseUser;
        }

        return null;
    }

    @Override
    public DtoUser updateUser(Long id, DtoUserIU dtoUserIU) {

        Optional<User> optional = userRepository.findById(id);

        if (optional.isPresent()) {
            User dbUser = optional.get();
            BeanUtils.copyProperties(dtoUserIU, dbUser);

            User updatedUser = userRepository.save(dbUser);

            DtoUser response = new DtoUser();
            BeanUtils.copyProperties(updatedUser, response);

            return response;
        }

        return null;

    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> optional = userRepository.findById(id);

        if (optional.isEmpty()) {
            throw new NullPointerException();
        }

        User dbUser = optional.get();
        userRepository.delete(dbUser);
    }
}
