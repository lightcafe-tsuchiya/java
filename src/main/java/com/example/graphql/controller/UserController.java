package com.example.graphql.controller;

import com.example.graphql.entity.Users;
import com.example.graphql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(path="/users", params="id")
    public Users findOneBy(String id){
        return usersRepository.findOneBy(id);
    }

    @GetMapping(path="/users")
    public List<Users> findAll(){
        return usersRepository.findAll();
    }
}
