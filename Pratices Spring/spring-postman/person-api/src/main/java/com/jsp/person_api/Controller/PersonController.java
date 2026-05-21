package com.jsp.person_api.Controller;

import com.jsp.person_api.entity.Person;
import com.jsp.person_api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonService personService;

    // Save Person
    @PostMapping("/person")
    public Person savePerson(@RequestBody Person person) {

        return personService.savePerson(person);
    }

    // Find By Id
    @GetMapping("/person")
    public Person findById(@RequestParam Integer rol) {

        return personService.findById(rol);
    }

    // Update Email
    @PutMapping("/person/email")
    public Person updateEmail(@RequestParam Integer rol,
                              @RequestParam String newEmail) {

        return personService.updateEmail(rol, newEmail);
    }
}