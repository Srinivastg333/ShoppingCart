package com.example.Shopping_Cart2.Controller;

import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.ServicesImpl.UserProfileImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping("api/V3")
public class UserProfileController {

    @Autowired
    UserProfileImpl userProfile;

    @PutMapping("/ViewUser/{id}")
    public ResponseEntity<User> EditUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        return ResponseEntity.ok(userProfile.Edituser(user,id));
    }

    @GetMapping("/ViewUser")
    public List<User> getAllUsers(){
        return userProfile.getAllUsers();
    }

    @DeleteMapping("/ViewUser/{id}")
    public ResponseEntity<Object>DeleteUser(@PathVariable("id") int id)
    {
        userProfile.DeleteUser(id);
        return new ResponseEntity<>("", HttpStatus.NO_CONTENT);
    }

}
