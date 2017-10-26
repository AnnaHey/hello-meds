package com.example.hellomeds.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Anna Hexter on 10/10/2017.
 */
@Controller
public class HelloMedsController {

    @RequestMapping (value="")
        public String index(Model model){
        model.addAttribute("title", "Order My Meds");
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String displayLoginForm(Model model) {
        //model.addAttribute("login_name", "username");
        model.addAttribute("title", "Login");
        return "login";
    }
}
