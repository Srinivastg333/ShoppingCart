package com.example.Shopping_Cart2.ServicesImpl;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.Repository.UserRepo;
import com.example.Shopping_Cart2.Services.UserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Email;
import java.util.Objects;

@Service
public class UserAuthenticationServiceImpl implements UserAuthentication {
    @Autowired
    UserRepo userRepo;
    @Override
    public Boolean LoginUser(String email, String Password) {
        User u1= userRepo.findByEmail(email);
        return Objects.equals(u1.getPassword(),Password);
    }
}
