package com.example.jpapractice.contoller;

import com.example.jpapractice.model.Person;
import com.example.jpapractice.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;


    @GetMapping()
    public List<Person> getAllPeople(){
        return personService.getAll();
    }

    @GetMapping("{id}")
    public Person getPerson(Long id){
        return personService.getOne(id);
    }

    @PostMapping()
    public Person createPerson(@RequestBody Person person){
        return personService.create(person);
    }

    @DeleteMapping()
    public void deletePerson(@RequestParam Long id){
         personService.delete(id);
    }


    @DeleteMapping("/delete")
    public Optional<Person> deletePersonById(@RequestParam Long id){
        return personService.deletePersonById(id);
    }

}
