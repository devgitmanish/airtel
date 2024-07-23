package com.interview.practice.service;

import com.interview.practice.Entity.Student;
import com.interview.practice.exception.InvalidArgumentException;
import com.interview.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusinessLogic {

    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<?> getStudent(int id) throws InvalidArgumentException {

        if(id==0){
            throw new InvalidArgumentException("bad request : invalid Id");
        }
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent())
            return ResponseEntity.ok(student.get());
        return ResponseEntity.ok("FAILURE");
    }
}
