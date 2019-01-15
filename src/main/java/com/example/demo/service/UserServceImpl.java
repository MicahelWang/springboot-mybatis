package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServceImpl
 */
@Service
public class UserServceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }

    @Override
    public UserEntity getById(long id) {
        return userMapper.getOne(id);
    }

    @Override
    public void insert(UserEntity user) {
        userMapper.insert(user);
    }

    @Override
    public void update(UserEntity user) {
        userMapper.update(user);
    }

	@Override
	public void delete(long id) {
        userMapper.delete(id);
	}

    
}