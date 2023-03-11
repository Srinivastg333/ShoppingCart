package com.example.Shopping_Cart2.ServicesImpl;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.Repository.UserRepo;
import com.example.Shopping_Cart2.Services.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationImpl implements UserRegistration {

    @Autowired
    UserRepo userRepo;

    @Override
    public User addNewUserRegistration(User user) {
        return userRepo.save(user);
    }

    @Override
    public User newAgeLimits(User user,int Age, int id) {
        User u1 = userRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Please Enter the Valid Age")
        );
        u1.setAge(user.getAge());
        return userRepo.save(user);
    }
}
