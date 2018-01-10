package com.example.hellomeds.models.data;

import com.example.hellomeds.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anna Hexter on 1/3/2018.
 */
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
