package org.example.service;

import jakarta.transaction.Transactional;
import org.example.models.Person;
import org.example.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPersonById(int id){
        Optional<Person> person = personRepository.findById(id);
        return person.orElse(null);
    }
}
