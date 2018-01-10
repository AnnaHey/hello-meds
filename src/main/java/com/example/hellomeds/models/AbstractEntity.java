package com.example.hellomeds.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by Anna Hexter on 1/3/2018.
 */

@MappedSuperclass
public abstract class AbstractEntity {


    @Id
    @GeneratedValue
    private int uid;

    public int getUid() {
        return this.uid;
    }


}
