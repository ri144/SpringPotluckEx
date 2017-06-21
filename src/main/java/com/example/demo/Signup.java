package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 6/21/17.
 */
@Entity
public class Signup {
    @Id
    private String name;

    private String thing;

    public String getName(){
        return name;
    }

    public String getThing(){
        return thing;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setThing(String thing){
        this.thing = thing;
    }

}
