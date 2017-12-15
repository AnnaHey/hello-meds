package com.example.hellomeds.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Created by Anna Hexter on 11/2/2017.
 */

@Entity
public class Patient {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=3, max=20)
    private String firstname;

    @Size(min=3, max=20)
    private String lastname;

    @Size(min=3, max=20)
    private String username;

    @Size(min=5, max=15)
    private String password;

    private String email;


    public Patient(String fname, String lastname, String username, String password, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public Patient(){}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String isMatchingPassword(String password) {
        return password;}
}
