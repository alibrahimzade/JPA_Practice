package com.example.jpapractice.mapper;

import com.example.jpapractice.dao.StudentEntity;
import com.example.jpapractice.model.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper
public  interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "name" , source = "name")
//    @Mapping(target = "courseName" , source = "courseList.courseName")
    StudentDto mapEntityToDto(StudentEntity student);


    StudentEntity mapDtoToEntity(StudentDto student);
}
