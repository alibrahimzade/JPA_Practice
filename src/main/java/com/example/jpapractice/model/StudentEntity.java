package com.example.jpapractice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id",referencedColumnName = "id")
    private PassportEntity passport;

    @OneToMany(mappedBy = "studentEntity",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ContactEntity> contact;
}
