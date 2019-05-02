package com.example.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookEntity {

	// 書籍管理ID
	private String bookId;

	// 書籍名
	private String bookName;

	// 管理開始日
	private LocalDate bmStartDate;

	// 削除フラグ
	private String deleteFlag;

	// 登録日時
	private LocalDateTime createTime;

	// 更新日時
	private LocalDateTime updateTime;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public LocalDate getBmStartDate() {
		return bmStartDate;
	}

	public void setBmStartDate(LocalDate bmStartDate) {
		this.bmStartDate = bmStartDate;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

}
