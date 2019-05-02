package com.example.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.UserEntity;
import com.example.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	@Transactional
	public void insert(UserEntity userEntity) {

	}

	@Transactional
	public List<UserEntity> selectAll() {
		return userMapper.selectAll();
	}

	@Transactional
	public UserEntity selectByPrimaryKey(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Transactional
	public UserEntity selectForLogin(String userId, String password) {
		return userMapper.selectForLogin(userId, password);
	}

	@Transactional
	public void updateUserNameByPrimaryKey(String userName, LocalDateTime updateTime, String userId) {

	}

	@Transactional
	public void deleteAll() {

	}

	@Transactional
	public void deleteByPrimaryKey(String userId) {

	}

}
