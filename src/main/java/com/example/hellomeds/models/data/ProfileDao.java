package com.example.hellomeds.models.data;

import com.example.hellomeds.models.forms.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Anna Hexter on 12/21/2017.
 */
@Repository
@Transactional
public interface ProfileDao extends CrudRepository<Profile, Integer> {
}
