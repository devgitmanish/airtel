package com.interview.practice.Controller;


import com.interview.practice.Entity.User;
import com.interview.practice.service.UserService;
import dto.UserRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class RequestValidation {

    @Autowired
    private UserService userService;

    @PostMapping("/save-user")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return ResponseEntity.ok(userService.saveUser(userRequest));
    }

    @GetMapping("/get-all-user")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/get-user/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        return ResponseEntity.ok(userService.getUser(id));
    }




}
