package com.example.springbootnewsecurity.service;

import com.example.springbootnewsecurity.entity.User;
import com.example.springbootnewsecurity.entity.UserRecord;

import java.util.List;

public interface IUserService {
    User add(User user);
    List<UserRecord> getAllUsers();
    void delete(String email);
    User getUser(String email);

    User update(User user);

}
