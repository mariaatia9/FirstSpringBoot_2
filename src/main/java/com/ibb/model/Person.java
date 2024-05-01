/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author trainer
 */
//@Data
@Getter
@Setter
public class Person {
    private String firstname;
    private String lastname;
    private Address address;

    public Person() {
       address=new Address();
    }
    
    
    
    

    public Person(String firstname, String lastname) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
    }
 
    
}
