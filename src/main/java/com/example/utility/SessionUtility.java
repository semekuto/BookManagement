package com.example.utility;

import javax.servlet.http.HttpSession;

import com.example.constant.SessionKey;
import com.example.entity.UserEntity;

public class SessionUtility {

	private SessionUtility() {

	}

	// ユーザ情報のセッションキーからユーザ情報を取得
	public static UserEntity getUserInfo(HttpSession session) {

		UserEntity userInfo = (UserEntity)session.getAttribute(SessionKey.keyUserInfo);

		return userInfo;

	}

}
