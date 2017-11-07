package com.example.hellomeds.controllers;
import com.example.hellomeds.models.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by Anna Hexter on 10/10/2017.
 */
@Controller
public class HelloMedsController {

    static ArrayList<Patient> patients = new ArrayList<>();
    private String firstName;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Order My Meds");
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String displayLoginForm(Model model) {
        //model.addAttribute("login_name", "username");
        model.addAttribute("title", "Login");
        return "login";
    }

    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String displayAddNewPatientForm(Model model) {
        model.addAttribute("title", "Registration!");
        return "registration";
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String addNewPatient(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String username,
                                @RequestParam String email, @RequestParam String password) {
        Patient newPatient = new Patient(firstname, lastname, username, email, password);
        return "registration";
    }

}
