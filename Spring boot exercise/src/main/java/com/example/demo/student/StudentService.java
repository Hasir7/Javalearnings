package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Mohamed Hasir",
                "mdhasir96@gmail.com",
                LocalDate.of(1996, 11,4),
                26));
    }

}
