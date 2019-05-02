package com.example.mapper;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.BookEntity;

@Mapper
public interface BookMapper {

	// Create
	void insert(BookEntity bookEntity);

	// Read
	List<BookEntity> selectAll();

	BookEntity selectByPrimaryKey(String bookId);

	// Update
	void updateBookNameByPrimaryKey(String bookName, LocalDateTime updateTime, String bookId);

	void updateDeleteFlagByPrimaryKey(String deleteFlag, LocalDateTime updateTime, String bookId);

	// Delete
	void deleteAll();

	void deleteByPrimaryKey(String bookId);

}
