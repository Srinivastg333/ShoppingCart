package com.example.Shopping_Cart2.Controller;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.Repository.UserRepo;
import com.example.Shopping_Cart2.ServicesImpl.UserPasswordResetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
@RequestMapping("api/v3")
public class UserPasswordReset {

    @Autowired
    UserPasswordResetServices userPasswordResetServices;

//    @Autowired
//    UserRepo userRepo;
    //    @PutMapping("users/{email}/{Password}")
//    public ResponseEntity<Object> UserLogin(@PathVariable("email")String email,@PathVariable("Password")String Password) {
//        if (userPasswordResetServices.PasswordReset(email, Password)) {
//            return new ResponseEntity<Object>("Login Successful", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<Object>("Login Unsuccessful", HttpStatus.NOT_IMPLEMENTED);
//        }
//    }
//    @PutMapping("users/{email}/{Password}")
//    public String UserLogin(@PathVariable("email") String email, @PathVariable("Password") String Password) {
//        String u3=userRepo.findByPassword(email,Password).getPassword();
//        if(true){
//            System.out.println("You Have Logged in Successfully");
//        }
//        else
//        {
//            System.out.println("There is an error in the Password please Check ones");
//        }
//        return "reset_password";
//    }
}