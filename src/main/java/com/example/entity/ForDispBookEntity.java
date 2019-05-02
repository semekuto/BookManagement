package com.example.entity;

public class ForDispBookEntity {

	// 書籍管理ID
	private String bookId;

	// 書籍名
	private String bookName;

	// 管理開始日(表示用)
	private String bmStartDate;

	// 管理ステータス
	private String bmStatus;

	// 登録日時
	private String createTime;

	// 更新日時
	private String updateTime;

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

	public String getBmStartDate() {
		return bmStartDate;
	}

	public void setBmStartDate(String bmStartDate) {
		this.bmStartDate = bmStartDate;
	}

	public String getBmStatus() {
		return bmStatus;
	}

	public void setBmStatus(String bmStatus) {
		this.bmStatus = bmStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
