package com.example.Shopping_Cart2.Services;

import com.example.Shopping_Cart2.Models.User;

import java.util.List;

public interface ProfileManagement {

    User Edituser(User user,Integer id);

    List<User> getAllUsers();

    void DeleteUser(Integer id);

}
