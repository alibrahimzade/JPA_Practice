package com.example.jpapractice.contoller;

import com.example.jpapractice.dao.StudentEntity;
import com.example.jpapractice.model.StudentDto;
import com.example.jpapractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;


//    @GetMapping("/{id}")
//    public StudentEntity getById(@PathVariable Long id){
//        return studentService.get(id);
//    }

    @GetMapping("/{id}")
    public StudentDto get(@PathVariable Long id){
        return studentService.getStudent(id);
    }


    @PostMapping
    public void save(@RequestBody StudentDto student){
        studentService.createDto(student);
    }

}
