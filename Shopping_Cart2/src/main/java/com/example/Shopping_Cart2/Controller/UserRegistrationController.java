package com.example.Shopping_Cart2.Controller;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.ServicesImpl.UserRegistrationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("api/V3")
public class UserRegistrationController {

    @Autowired
    UserRegistrationImpl userRegistration;

    @PostMapping("/Users")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        return new ResponseEntity<>(userRegistration.addNewUserRegistration(user),HttpStatus.CREATED);
    }
}
