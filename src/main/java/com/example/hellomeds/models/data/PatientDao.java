package com.example.hellomeds.models.data;

import com.example.hellomeds.models.Patient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anna Hexter on 11/27/2017.
 */
public interface PatientDao extends CrudRepository<Patient, Integer> {
}
