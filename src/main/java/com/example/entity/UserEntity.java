package com.example.entity;

import java.time.LocalDateTime;

public class UserEntity {

	// ユーザID
	private String userId;

	// パスワード
	private String password;

	// ユーザ名
	private String userName;

	// ユーザ名(漢字)
	private String userNameKanji;

	// 登録日時
	private LocalDateTime createTime;

	// 更新日時
	private LocalDateTime updateTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNameKanji() {
		return userNameKanji;
	}

	public void setUserNameKanji(String userNameKanji) {
		this.userNameKanji = userNameKanji;
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
