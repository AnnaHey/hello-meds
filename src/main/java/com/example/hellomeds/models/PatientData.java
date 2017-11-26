package com.example.hellomeds.models;

import java.util.ArrayList;

/**
 * Created by Anna Hexter on 11/7/2017.
 */
public class PatientData {
    static ArrayList<Patient> patients = new ArrayList<>();

    public static void add(Patient newPatient) {
        patients.add(newPatient);
    }
}

