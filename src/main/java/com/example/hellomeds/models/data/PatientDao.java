package com.example.hellomeds.models.data;

import com.example.hellomeds.models.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Anna Hexter on 11/27/2017.
 */
@Repository
@Transactional
public interface PatientDao extends CrudRepository<Patient, Integer> {
}
