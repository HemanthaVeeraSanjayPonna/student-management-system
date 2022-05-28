package com.prathyusha.studentmanagementsystem.entites;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Value
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long userId;
    public String fName;
    public String lName;
    public Long contactNumber;
    public String emailId;
    public String city;
    public String password;
    public String role;
}
