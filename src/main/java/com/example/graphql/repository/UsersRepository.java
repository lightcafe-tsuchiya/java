package com.example.graphql.repository;

import com.example.graphql.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Users findOneBy(String id){

        String query = "select id, name, age from users where id = ?";

        return (Users)jdbcTemplate.queryForObject(
                query,
                new Object[]{id},
                new BeanPropertyRowMapper(Users.class));

    }

    public List<Users> findAll(){

        String query = "select id, name, age from users";

        return jdbcTemplate.query(
                query,
                new BeanPropertyRowMapper(Users.class));
    }
}
