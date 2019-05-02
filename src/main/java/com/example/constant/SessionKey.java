package com.example.constant;

public class SessionKey {

	// privateコンストラクタでこのクラスのインスタンス化を防ぐ
	private SessionKey() {

	}

	// ユーザ情報をセッションに保持する際のキー
	public static final String keyUserInfo = "keyUserInfo";
}
