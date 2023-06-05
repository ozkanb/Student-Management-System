package com.ozkan.studentmanagementsystem.repository;

import com.ozkan.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
