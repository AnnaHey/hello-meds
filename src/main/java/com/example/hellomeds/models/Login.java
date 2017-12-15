package com.example.hellomeds.models;

import javax.validation.constraints.Size;

/**
 * Created by Anna Hexter on 12/4/2017.
 */
public class Login {

    @Size(min=3, max=20)
    private String loginUsername;

    @Size(min=5, max=15)
    private String loginPassword;

    public Login (String loginUsername, String loginPassword) {
        this.loginUsername = loginUsername;
        this.loginPassword = loginPassword;
    }
}

