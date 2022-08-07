package com.swaggertest.swaggerdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Configuration
public class TEmployeeController {
    ConcurrentMap<String ,Contact> contacts = new ConcurrentHashMap<>();
    @Autowired
    private TEmployeeRepo tEmployeeRepo;

    @PostMapping("/employee")
    public TEmployee saveEmployee(@RequestBody TEmployee tEmployee){
        return tEmployeeRepo.save(tEmployee);
    }

    @GetMapping("/employee")
    public List<TEmployee> getEmployees(){
        return tEmployeeRepo.findAll();
    }

    @GetMapping("/employee/{id}")
    public TEmployee getTEmployee(@PathVariable Long id){
        return tEmployeeRepo.findById(id).get();
    }

    @PutMapping("employee/{id}")
    public TEmployee update(@PathVariable Long id, @RequestBody TEmployee tEmployee){
        TEmployee temp = tEmployeeRepo.findById(id).get();
        temp.setLocation(tEmployee.getLocation());
        temp.setName(tEmployee.getName());
        return temp;
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable  Long id){
        tEmployeeRepo.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
    // @GetMapping("/{id}")
    // public Contact getContact(@PathVariable String id) {
    //     return contacts.get(id);

    // }

    // @GetMapping("/")
    // public List<Contact> getAllContacts(){
    //     return new ArrayList<Contact>(contacts.values());
    // }
    // @PostMapping("/")
    // public Contact addContact(@RequestBody Contact contact) {
    //     contacts.put(contact.getId(), contact);
    //     return contact;
    // }
}
