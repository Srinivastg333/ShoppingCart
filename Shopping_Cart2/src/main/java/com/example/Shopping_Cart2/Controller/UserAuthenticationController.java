package com.example.Shopping_Cart2.Controller;

import com.example.Shopping_Cart2.ServicesImpl.UserAuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("api/v1")
public class UserAuthenticationController {

    @Autowired
    UserAuthenticationServiceImpl userAuthenticationService;

    @GetMapping("users/{email}/{Password}")
    public ResponseEntity<Object> UserLogin(@PathVariable("email")String email,@PathVariable("Password")String Password)
    {

        Boolean hi = userAuthenticationService.LoginUser(email, Password);
        if(hi){
            return new ResponseEntity<Object>("Login Successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<Object>("Login Unsuccessful", HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
