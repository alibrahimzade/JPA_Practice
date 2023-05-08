package com.example.jpapractice.repository;

import com.example.jpapractice.dao.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Repeatable;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
