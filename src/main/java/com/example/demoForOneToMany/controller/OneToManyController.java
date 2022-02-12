package com.example.demoForOneToMany.controller;

import com.example.demoForOneToMany.entity.Student;
import com.example.demoForOneToMany.repository.SportRepository;
import com.example.demoForOneToMany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OneToManyController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
   SportRepository sportRepository;
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student Students){
      Student sts=  studentRepository.save(Students);
      return  sts;

    }
    @DeleteMapping("/remove/{id}")
    public String deleteInfo(@PathVariable("id") String id){
        studentRepository.deleteById(id);
        return  "Deleted";
    }
}
