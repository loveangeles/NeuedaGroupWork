package com.example.hrapplication.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;


    @GetMapping("greeting")
    public String welcome(@RequestParam String name) {
        return "Greeting " + name;
    }
    @GetMapping("greeting/{name}")
    public String meetPath(@PathVariable String name){
        return "Greeting " + name;
    }
    @GetMapping("person")
    public Person getPerson(){
        Person person = new Person("Yulun", "Gaming");
        Address address = new Address();
        address.setStreet("Kurtz Ave");
        address.setCity("Los Angeles");
        address.setStates("California");
        address.setCountry("US");
        person.setAddress(address);
        return person;
    }
    /*
    @GetMapping("address")
    public Address getAddress(){
        Address address = new Address("US", "California","Irvine","Jamboree Blvd");
        return address;
    }
    */

    /////////////////////////////////////////////////////////////////
    @GetMapping("persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }


    @PostMapping("persons")
    public void addPerson(@RequestBody Person person) {
        personRepository.save(person);
    }

    @GetMapping("persons/{id}")
    Person one(@PathVariable Long id){
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }

    @DeleteMapping("persons/{id}")
    void deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
    }



}
