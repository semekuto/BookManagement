package com.example.mapper;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.UserEntity;

@Mapper
public interface UserMapper {

	// Create
	void insert(UserEntity userEntity);

	// Read
	List<UserEntity> selectAll();

	UserEntity selectByPrimaryKey(String userId);

	UserEntity selectForLogin(String userId, String password);

	// Update
	void updateUserNameByPrimaryKey(String userName, LocalDateTime updateTime, String userId);

	// Delete
	void deleteAll();

	void deleteByPrimaryKey(String userId);

}
