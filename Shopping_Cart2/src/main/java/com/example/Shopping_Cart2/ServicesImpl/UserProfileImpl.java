package com.example.Shopping_Cart2.ServicesImpl;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.Repository.UserRepo;
import com.example.Shopping_Cart2.Services.ProfileManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserProfileImpl implements ProfileManagement {

    @Autowired
    UserRepo userRepo;
    @Override
    public User Edituser(User user, Integer id) {
        User a1=userRepo.findById(id).orElseThrow(
                ()->new RuntimeException("Please Enter all information's Correctly")
        );
        a1.setName(user.getName());
        a1.setEmail(user.getEmail());
        a1.setPassword(user.getPassword());
        a1.setAddress(user.getAddress());
        a1.setPhoneNumber(user.getPhoneNumber());
        a1.setAge(user.getAge());
        a1.setDateOfBirth(user.getDateOfBirth());
        a1.setGender(user.getGender());
        a1.setAccountStatus(user.getAccountStatus());
        a1.setAccountCreationDate(user.getAccountCreationDate());
        a1.setLastLoginDate(user.getLastLoginDate());
        a1.setRole(user.getRole());
        return userRepo.save(a1);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void DeleteUser(Integer id) {
        User mt=userRepo.findById(id).orElseThrow(()->new RuntimeException());
            userRepo.delete(mt);
        }
}
