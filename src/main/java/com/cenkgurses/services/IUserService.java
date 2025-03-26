package com.cenkgurses.services;

import com.cenkgurses.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    public User createUser(User user);

    public List<User> getUsers();

    public User updateUser(Long id, User user);

    public void deleteUser(Long id);

}
