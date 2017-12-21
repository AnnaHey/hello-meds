package com.example.hellomeds.models.forms;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * Created by Anna Hexter on 12/21/2017.
 */
@Entity
public class Profile {


    @Size(min = 3, max = 20)
    private String address;

    @Size(min = 3, max = 50)
    private String city;

    @Size(min = 3, max = 30)
    private String emergencyName;

    @Size(min = 7, max = 20)
    private String emergencyNumber;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

}