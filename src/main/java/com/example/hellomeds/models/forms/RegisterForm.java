package com.example.hellomeds.models.forms;

import javax.validation.constraints.NotNull;

/**
 * Created by Anna Hexter on 1/3/2018.
 */
public class RegisterForm extends LoginForm {

    @NotNull(message = "Passwords to not match")
    private String verifyPassword;

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
        checkPasswordForRegistration();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPasswordForRegistration();
    }

    private void checkPasswordForRegistration() {
        if (!getPassword().equals(verifyPassword)) {
            verifyPassword = null;
        }
    }
}
