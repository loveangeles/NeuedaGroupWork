package com.example.financialapplication.persons;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("person")
    public Person getPerson(){
        Person person = new Person("Yulun", "Gao");
        Bonds bonds = new Bonds();
        bonds.setBondid(1000);
        bonds.setActiontype("buy");
        bonds.setAmount(12.3f);
        bonds.setBondtype("Long-Term");
        bonds.setDate("2022-08-08");
        person.setBonds(bonds);

        Cash cash = new Cash();
        cash.setCashid(2000);
        cash.setActiontype("save");
        cash.setAmount(4399);
        cash.setDate("2022-08-09");
        person.setCash(cash);

        Stocks stocks = new Stocks();
        stocks.setStockid(3000);
        stocks.setActiontype("sell");
        stocks.setStockcode("APPL");
        stocks.setAmount(101.6f);
        stocks.setPrice(2333);
        stocks.setDate("2022-08-10");
        person.setStocks(stocks);
        return person;
    }

    //////////////////////////////////////////////////
    @GetMapping("personsinfo")
    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    @PostMapping("personsinfo")
    public void addPerson(@RequestBody Person person) {
        personRepository.save(person);
    }

    @GetMapping("personsinfo/{pid}")
    Person one(@PathVariable Long pid){
        return personRepository.findById(pid).orElseThrow(() -> new PersonNotFoundException(pid));
    }

    @DeleteMapping("personsinfo/{pid}")
    void deletePerson(@PathVariable Long pid){
        personRepository.deleteById(pid);
    }
}
