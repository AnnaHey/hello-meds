package com.example.hellomeds.controllers;
import com.example.hellomeds.models.Login;
import com.example.hellomeds.models.Patient;
import com.example.hellomeds.models.data.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Anna Hexter on 10/10/2017.
 */
@Controller
public class HelloMedsController {

    @Autowired
    private PatientDao patientDao;


    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Order My Meds");
        return "index";
    }

    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String displayAddNewPatientForm(Model model) {
        model.addAttribute("title", "Registration!");
        model.addAttribute(new Patient());
        return "registration";
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String addNewPatient(@ModelAttribute @Valid Patient newPatient, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Registration!");
            return "registration";
        }
        Patient alreadyInSystem = patientDao.findByUsername(newPatient.getUsername());

        if (alreadyInSystem != null) {
            errors.rejectValue("username", "username.alreadyexists", "That username already exists.");
            return "registration";
        }


        patientDao.save(newPatient);

        return "redirect:";
    }

   @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute(new Login());
        model.addAttribute("title", "Log In");
        return "login";



    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("title", "Login");
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@ModelAttribute @Valid Patient patient, Errors errors, HttpServletRequest request) {

        if (errors.hasErrors()) {
            return "login";
        }

        Patient theUser = patientDao.findByUsername(patient.getUsername());

        if (theUser == null) {
            errors.rejectValue("username", "user.invalid", "The given username does not exist");
            return "login";
        }

        String password = patient.getPassword();

        if (password != )
        if (!theUser.isMatchingPassword(password)) {
            errors.rejectValue("password", "password.invalid", "Invalid password");
            return "login";
        }

        setUserInSession(request.getSession(), theUser);

        return "redirect:";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:/login";


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String showNewUser(Model model){
        model.addAttribute("title","New User Information Saved" );
        return "user";

        }



