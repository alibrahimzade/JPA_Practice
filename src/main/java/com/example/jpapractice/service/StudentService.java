package com.example.jpapractice.service;

import com.example.jpapractice.dao.StudentEntity;
import com.example.jpapractice.mapper.StudentMapper;
import com.example.jpapractice.model.StudentDto;
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

    public StudentDto getStudent(Long id){
        var studentEntity = studentRepository.findById(id).orElse(new StudentEntity());
        var studentDto = StudentMapper.INSTANCE.mapEntityToDto(studentEntity);
        return studentDto;
    }


    public void createDto(StudentDto studentDto){
        var student = StudentMapper.INSTANCE.mapDtoToEntity(studentDto);
        studentRepository.save(student);
    }

//    public StudentEntity create(StudentEntity studentEntity){
//        return studentRepository.save(studentEntity);
//    }

}
