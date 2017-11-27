package com.example.hellomeds.controllers;
import com.example.hellomeds.models.Patient;
import com.example.hellomeds.models.PatientData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by Anna Hexter on 10/10/2017.
 */
@Controller
public class HelloMedsController {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Order My Meds");
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String displayLoginForm(Model model) {
        //model.addAttribute("login_name", "username");
        model.addAttribute("title", "Login");
        //model.addAttribute(new Patient());
        return "login";
    }

    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String displayAddNewPatientForm(Model model) {
        model.addAttribute("title", "Registration!");
        model.addAttribute(new Patient());
        return "registration";
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String addNewPatient(@ModelAttribute @Valid Patient newPatient, Errors errors, Model model) {

        if (errors.hasErrors()){
            model.addAttribute("title", "Registration!");
            return "registration";
        }
        PatientData.add(newPatient);
        return "registration";
    }

}
