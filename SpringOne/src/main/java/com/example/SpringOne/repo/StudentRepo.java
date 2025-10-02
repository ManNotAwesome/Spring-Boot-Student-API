package com.example.SpringOne.repo;

import com.example.SpringOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Student, Long>{

}
