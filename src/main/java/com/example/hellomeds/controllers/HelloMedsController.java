package com.example.hellomeds.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Anna Hexter on 10/10/2017.
 */
@Controller
public class HelloMedsController {
    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello Med Order App";
    }
}
