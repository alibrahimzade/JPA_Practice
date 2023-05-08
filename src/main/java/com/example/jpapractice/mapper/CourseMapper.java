package com.example.jpapractice.mapper;

import com.example.jpapractice.dao.CourseEntity;
import com.example.jpapractice.model.CourseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseDto EntityToDto(CourseEntity course);
}
