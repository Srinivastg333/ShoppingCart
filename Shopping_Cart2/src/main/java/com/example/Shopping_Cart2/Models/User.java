package com.example.Shopping_Cart2.Models;

import com.example.Shopping_Cart2.SD.Account_Status;
import com.example.Shopping_Cart2.SD.Gender;
import com.example.Shopping_Cart2.SD.Roles;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="table1")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username")
    private String Name;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_Password")
    private String Password;
    @Column(name = "user_Address")
    private String Address;
    @Column(name = "user_phone")
    private Long PhoneNumber;
    @Column(name="user_age")
    private int Age;
    @Column(name = "user_dob")
    private Date DateOfBirth;
    @Column(name = "user_gender")
    private Gender Gender;
    @Column(name = "user_accountStatus")
    private Account_Status accountStatus;
    @Column(name = "user_CreationDate")
    private Date accountCreationDate;
    @Column(name = "user_LastLoginDate")
    private Date lastLoginDate;
    @Column(name = "user_role")
    private Roles Role;

}
