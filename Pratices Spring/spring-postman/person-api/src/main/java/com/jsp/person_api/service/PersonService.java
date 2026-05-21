package com.jsp.person_api.service;

import com.jsp.person_api.entity.Person;
import com.jsp.person_api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    // Save Person
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    // Find Person By ID
    public Person findById(Integer rol) {

        Optional<Person> op = personRepository.findById(rol);

        return op.orElseThrow(() ->
                new RuntimeException("Person not found with id " + rol)
        );
    }

    // Update Email
    public Person updateEmail(Integer rol, String newEmail) {

        Optional<Person> op = personRepository.findById(rol);

        if (op.isPresent()) {

            Person per = op.get();

            per.setEmail(newEmail);

            return personRepository.save(per);
        }

        throw new RuntimeException("Person not found with id " + rol);
    }
}