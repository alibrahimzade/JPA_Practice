package com.example.jpapractice.repository;

import com.example.jpapractice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(value = "delete from Person where id = :id")
    Optional<Person> deletePersonById(@Param("id") Long id);
}
