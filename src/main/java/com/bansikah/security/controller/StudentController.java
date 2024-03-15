package com.bansikah.security.controller;

import com.bansikah.security.model.Student;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasRole;

@RestController
public class StudentController {

   private final List<Student> students  = new ArrayList<>();

    //or hasRole('USER')

    @PreAuthorize("hasRole('ADMIN')") //or hasRole('USER')
    @GetMapping("/get")
    public List<Student> students(){

       Student student1 = new Student();
       student1.setId(1);
       student1.setFirstName("Bansikah");
       student1.setLastName("Noel");

        Student student2 = new Student();
        student2.setId(1);
        student2.setFirstName("Blanch");
        student2.setLastName("white");

        students.add(student1);
        students.add(student2);

        return students;
    }
    @PostMapping("/post")
    public Student postStudent(Student student){
        students.add(student);
        return student;
    }
}
