package com.example.jpapractice.contoller;

import com.example.jpapractice.model.StudentEntity;
import com.example.jpapractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public StudentEntity getById(Long id){
        return studentService.get(id);
    }

    @PostMapping
    public StudentEntity save(@RequestBody StudentEntity studentEntity){
        return studentService.create(studentEntity);
    }

}
