package com.example.demospringboot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(1L, "Gam", "gam@gmail.com", LocalDate.of(1992, Month.APRIL, 12), 28)
        );
    }
}
