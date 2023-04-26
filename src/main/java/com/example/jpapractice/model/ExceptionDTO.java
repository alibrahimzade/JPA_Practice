package com.example.jpapractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ExceptionDTO {
    private Integer code;
    private String message;
}
