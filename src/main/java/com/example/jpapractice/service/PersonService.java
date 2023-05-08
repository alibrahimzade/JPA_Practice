package com.example.jpapractice.service;

import com.example.jpapractice.exception.NoSuchPersonException;
import com.example.jpapractice.dao.Person;
import com.example.jpapractice.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {

    private final PersonRepository personRepository;


    public List<Person> getAll(){
        log.info("People are found");
        return personRepository.findAll();
    }

    public Person getOne(Long id){
        log.info("Person is found");
        return personRepository.findById(id).orElseThrow(()->  new NoSuchPersonException("Person is not found"));
    }

    public Person create(Person person){
        log.info("Person is updated");
        return personRepository.save(person);
    }

    public void delete(Long id){
        log.info("Person is deleted");
        personRepository.deleteById(id);
    }

    public Person deletePersonById(Long id){
         return personRepository.deletePersonById(id).orElseThrow( () -> new NoSuchPersonException("Person is not exist"));
    }
}
