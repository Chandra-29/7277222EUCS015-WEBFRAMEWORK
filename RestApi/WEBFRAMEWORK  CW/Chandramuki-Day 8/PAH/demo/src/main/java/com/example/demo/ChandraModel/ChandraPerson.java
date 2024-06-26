package com.example.demo.ChandraModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChandraPerson {
    @Id
    private long id;
    private String firstname;
    private String lastname;
    private int age;

    public ChandraPerson(){}

    public ChandraPerson(long id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   
}
