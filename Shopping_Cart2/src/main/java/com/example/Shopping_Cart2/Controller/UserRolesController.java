package com.example.Shopping_Cart2.Controller;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.SD.Roles;
import com.example.Shopping_Cart2.ServicesImpl.UserRoles;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
@RequestMapping("api/v3")
public class UserRolesController {

    @Autowired
    UserRoles userRoles;

 //   @GetMapping("/Users")
//    public List<User> getAllUsers(){
//        Roles myVar =Roles._Admin;
//        switch(myVar) {
//            case _Admin:
//                System.out.println("Admin Logged in Successfully");
//                break;
//            case _User:
//                System.out.println("User Logged in Successfully");
//                break;
//            case _Staff:
//                System.out.println("Staff Logged in Successfully");
//                break;
//        }
//        return userRoles.getAllUsers();
//    }
}
