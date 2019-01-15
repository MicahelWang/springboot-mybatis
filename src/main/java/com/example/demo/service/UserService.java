package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserEntity;


/**
 * UserService
 */
public interface UserService {

    public List<UserEntity> getAll();


    public UserEntity getById(long id);

    public void insert(UserEntity user);

    public void update(UserEntity user);

    public void delete(long id);
}