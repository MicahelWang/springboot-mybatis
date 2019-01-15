package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("/api/Users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="",method=RequestMethod.GET)
    public List<UserEntity> getUsers() {
        List<UserEntity> users = userService.getAll();
        return users;
    }

    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public UserEntity getUser(@PathVariable("id")Long id) {
    	UserEntity user=userService.getById(id);
        return user;
    }
    
    @RequestMapping(value="",method=RequestMethod.PUT)
    public void save(@RequestBody UserEntity user) {
    	userService.insert(user);
    }
    
    @RequestMapping(value="",method=RequestMethod.POST)
    public void update(@RequestBody UserEntity user) {
    	userService.update(user);
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	userService.delete(id);
    }
    

}