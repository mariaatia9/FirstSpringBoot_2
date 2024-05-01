/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.demo;

import com.ibb.model.Address;
import com.ibb.model.Person;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author trainer
 */
@RestController
public class HelloWorldController {

    public HelloWorldController() {
        System.out.println("Mein Restcontroller wurde instantiiert!");
    }
    
   
    
    
    @GetMapping(path = "greeting")
    public String doSomething(){
        return "Hallo Spring Boot World";
    }
    
    
    
    
     @GetMapping(path = "greet")
    public String doSomething1(){
        return "Hallo Spring Boot World 2";
    }
    
    @GetMapping(path="person")
    public Person takePerson(){
        Person p=new Person("Hans","Musterman");
        
        return p;
    }
    
    @GetMapping(path="liste")
    public List<Person> listPerson(){
        List<Person> lp=new ArrayList<>();
        
        Faker f=new Faker(new Locale("de"));
        for (int i = 0; i <8; i++) {
            Person p=new Person(f.address().firstName(),f.address().lastName());
            Address a=new Address(f.address().cityName(), f.address().streetName());
            p.setAddress(a);
            lp.add(p);
        }
        return lp;
    }
    
}
