package com.example.demoForOneToMany.repository;

import com.example.demoForOneToMany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
