package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.constant.Message;
import com.example.entity.UserEntity;
import com.example.service.BookService;
import com.example.service.UserService;

@Controller
public class TopController {

	@Autowired
    private UserService userService;

	@Autowired
    private BookService bookService;

	@Autowired
	HttpSession session;

	// これを使えばセッションをゲットしなくても良さそう
	UserEntity userInfo = new UserEntity();

	// セッションユーザ情報を保持する際のキー
	private static final String keyUserInfo = "keyUserInfo";


	// ログイン画面アクセス時の処理
	@RequestMapping("/")
	public String firstView(Model model) {

		// ファイル名(拡張子無し)を指定することでファイル名.htmlを見に行く
		return "Top";
	}

	// ログインボタン押下時の処理
	@RequestMapping("/login")
	public String login(Model model, @ModelAttribute("userId") String userId, @ModelAttribute("password") String password) {

		System.out.println("ログインボタンが押下されました。");
		System.out.println("userId = " + userId);
		System.out.println("password = " + password);

		System.out.println("ユーザIDとパスワードを確認します");
		UserEntity loadedUserEntity = userService.selectForLogin(userId, password);

		if (loadedUserEntity != null) {

			// ログイン成功

			// コンソール出力
			System.out.println(Message.msg0001I);
			System.out.println("USER_ID           : " + loadedUserEntity.getUserId());
			System.out.println("PASSWORD          : " + loadedUserEntity.getPassword());
			System.out.println("USER_NAME         : " + loadedUserEntity.getUserName());
			System.out.println("USER_NAME_KANJI   : " + loadedUserEntity.getUserNameKanji());
			System.out.println("CREATE_TIME       : " + loadedUserEntity.getCreateTime());
			System.out.println("UPDATE_TIME       : " + loadedUserEntity.getUpdateTime());

			// DBから取得したユーザ情報を設定
			userInfo = loadedUserEntity;

			// メッセージを設定
			model.addAttribute("message", Message.msg0001I);

			// ユーザ情報をセッションに保存
			session.setAttribute(keyUserInfo, userInfo);

			// メニュー画面に遷移
			return "Menu";

		} else {

			// ログイン失敗

			// コンソール出力
			System.out.println(Message.msg0001E);

			// メッセージを設定
			model.addAttribute("message", Message.msg0001E);

			// トップ画面に戻る
			return "Top";
		}

	}






	// 戻るボタン押下時の処理
	@RequestMapping("/back")
	public String back(Model model) {

		// ユーザ情報を画面に渡す
		model.addAttribute("userId", userInfo.getUserId());

		// メニュー画面に遷移(仮置き)
		return "Menu";
	}



	// ログアウトボタン押下時の処理
	@RequestMapping("/logout")
	public String logout(Model model) {

		// コンソール出力
		System.out.println(Message.msg0002I);

		// メッセージを設定
		model.addAttribute("message", Message.msg0002I);

		// セッション(userInfo)を削除
		session.removeAttribute(keyUserInfo);

		return "Top";
	}

}
