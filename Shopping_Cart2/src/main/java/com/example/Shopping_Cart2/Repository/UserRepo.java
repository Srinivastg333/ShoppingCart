package com.example.Shopping_Cart2.Repository;

import ch.qos.logback.core.net.SMTPAppenderBase;
import com.example.Shopping_Cart2.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByEmail(String email);

//    public User findByPassword(String Password);




//    User findByEmilandPassword(String email, String password);
}
