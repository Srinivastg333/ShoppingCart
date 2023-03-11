package com.example.Shopping_Cart2.ServicesImpl;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.Repository.UserRepo;
import com.example.Shopping_Cart2.SD.Roles;
import com.example.Shopping_Cart2.Services.UserRolePermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoles implements UserRolePermissions {
    @Autowired
    UserRepo userRepo;
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
