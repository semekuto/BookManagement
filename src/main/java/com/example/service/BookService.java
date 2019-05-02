package com.example.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.BookEntity;
import com.example.mapper.BookMapper;

@Service
public class BookService {

	@Autowired
	private BookMapper bookMapper;

	@Transactional
	public void insert(BookEntity bookEntity) {

	}

	@Transactional
	public List<BookEntity> selectAll() {
		return bookMapper.selectAll();
	}

	@Transactional
	public BookEntity selectByPrimaryKey(String bookId) {
		return bookMapper.selectByPrimaryKey(bookId);
	}

	@Transactional
	public void updateBookNameByPrimaryKey(String bookName, LocalDateTime updateTime, String bookId) {

	}

	@Transactional
	public void updateDeleteFlagByPrimaryKey(String deleteFlag, LocalDateTime updateTime, String bookId) {

	}

	@Transactional
	public void deleteAll() {

	}

	@Transactional
	public void deleteByPrimaryKey(String bookId) {

	}
}
