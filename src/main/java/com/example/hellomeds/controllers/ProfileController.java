package com.example.hellomeds.controllers;

import com.example.hellomeds.models.data.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anna Hexter on 12/14/2017.
 */

@Controller
@RequestMapping(value="profile")
public class ProfileController {



    @Autowired
    private PatientDao patientDao;

}
