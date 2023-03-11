package com.example.Shopping_Cart2.Services;

import com.example.Shopping_Cart2.Models.User;

public interface UserRegistration {

    User addNewUserRegistration(User user);

    User newAgeLimits(User user,int Age, int id);
}
