package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
        private StudentRepo studentRepo;

    @GetMapping(value = "/students")
        public List<Student> getStudents(){
           return studentRepo.findAll();
        }

    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "Student saved...";
    }

    @PutMapping(value = "/update/{id}")
    public String updateStudent(@PathVariable long id, @RequestBody Student student){
        Student updatedStudent = studentRepo.findById(id).get();
        updatedStudent.setMark(student.getMark());
        updatedStudent.setName(student.getName());
        studentRepo.save(updatedStudent);
        return "Updated...";
    }

    @DeleteMapping(value = "/remove/{id}")
    public String removeStudent(@PathVariable long id){
        Student removedStudent = studentRepo.findById(id).get();
        studentRepo.delete(removedStudent);
        return "Student has been removed...";

    }
}
