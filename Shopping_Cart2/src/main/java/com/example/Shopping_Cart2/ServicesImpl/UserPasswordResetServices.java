package com.example.Shopping_Cart2.ServicesImpl;


import com.example.Shopping_Cart2.Models.User;
import com.example.Shopping_Cart2.Repository.UserRepo;
import com.example.Shopping_Cart2.Services.PasswordReset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserPasswordResetServices implements PasswordReset {

    @Autowired
    static
    UserRepo userRepo;

//    @Override
//    public Boolean PasswordReset(String email, String Password) {
////         User u1= userRepo.findByPassword(Password);
////           return Objects.equals(u1.getPassword(),Password)||Objects.equals(u1.getEmail(),email);
//        //     }
//        return null;
//    }
}


//    @Override
//    public User PasswordReset(User user, String Password, Integer id) {
//        User user2 = userRepo.findById(id).orElseThrow(
//                () -> new RuntimeException("Password Reset")
//        );
//        user2.setPassword(user.getPassword());
//        return userRepo.save(user2);
//    }
//}
//}

