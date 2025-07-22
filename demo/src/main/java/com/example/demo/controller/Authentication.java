package com.example.demo.controller;

import com.example.demo.pojo.LoginRequest;
import com.example.demo.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Authentication {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest)
    {
        System.out.println("Hello");
       return new ResponseEntity<>("Hello", HttpStatus.OK);

    }

    @GetMapping(value = "/getUser/{username}",produces = {"application/xml","application/json"})
    public ResponseEntity<?> getUser(@PathVariable String username)
    {
        User user= new User();
        user.setUserName(username);
        user.setFullName("sanket lambe");
        user.setRole("admin");
        user.setPassWord("Sanket@2123");
        return  new ResponseEntity(user,HttpStatus.OK);

    }
}
