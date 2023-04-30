package com.example.jpapractice.service;

import com.example.jpapractice.model.StudentEntity;
import com.example.jpapractice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentEntity get(Long id){
        return studentRepository.findById(id).get();
    }

    public StudentEntity create(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

}
