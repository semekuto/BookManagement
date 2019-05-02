package com.example.logic;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.entity.BookEntity;
import com.example.service.BookService;

public class EntryBookInfo {

	// 1件登録用メソッド
	public void entrySingleBookInfo(BookService bookService, String bookId, String bookName) {

		LocalDate createDate = LocalDate.now();
		LocalDateTime createTime = LocalDateTime.now();

		BookEntity bookEntity = new BookEntity();

		bookEntity.setBookId(bookId);
		bookEntity.setBookName(bookName);
		bookEntity.setBmStartDate(createDate);
		bookEntity.setDeleteFlag("0");
		bookEntity.setCreateTime(createTime);
		bookEntity.setUpdateTime(createTime);

		bookService.insert(bookEntity);
	}
}
