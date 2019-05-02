package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.constant.Message;
import com.example.entity.ForDispBookEntity;
import com.example.entity.UserEntity;
import com.example.logic.SearchBookInfo;
import com.example.service.BookService;
import com.example.service.UserService;
import com.example.utility.SessionUtility;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
    private UserService userService;

	@Autowired
    private BookService bookService;

	@Autowired
	HttpSession session;

	// セッション情報を取得
	UserEntity userInfo = new UserEntity();

	SearchBookInfo searchBookInfo = new SearchBookInfo();


	// 書籍情報検索ボタン押下時の処理
	@RequestMapping("/bookSearch")
	public String bookSearch(Model model) {

		userInfo = SessionUtility.getUserInfo(session);

		// ユーザ情報を画面に渡す
		model.addAttribute("userId", userInfo.getUserId());

		// ロジッククラスを呼び出してbms_bookを全検索
		List<ForDispBookEntity> forDispBookEntityList = searchBookInfo.searchBookInfoAll(bookService);

		if (forDispBookEntityList != null) {

			// bms_bookから1件以上データを取得できた場合
			// modelに画面表示用の書籍情報をセット
			model.addAttribute("forDispBooks", forDispBookEntityList);

			// メッセージを設定
			model.addAttribute("message", Message.msg0011I);

		} else {

			// bms_bookが0件の場合
			// メッセージを設定
			model.addAttribute("message", Message.msg0011E);
		}

		return "BookSearch";
	}

	// 検索ボタン押下時の処理
	@RequestMapping("/bookSearchByCondition")
	public String SearchByCondition(Model model, @ModelAttribute("searchBookId") String searchBookId) {

		userInfo = SessionUtility.getUserInfo(session);

		// ユーザ情報を画面に渡す
		model.addAttribute("userId", userInfo.getUserId());


		// 検索条件を判定
		if (searchBookId == null || searchBookId.isEmpty() == true) {
			// 検索条件が未入力の場合は全検索する

			List<ForDispBookEntity> forDispBookEntityList = searchBookInfo.searchBookInfoAll(bookService);

			if (forDispBookEntityList != null) {

				// bms_bookから1件以上データを取得できた場合
				// modelに画面表示用の書籍情報をセット
				model.addAttribute("forDispBooks", forDispBookEntityList);

				// メッセージを設定
				model.addAttribute("message", Message.msg0011I);

			} else {

				// bms_bookが0件の場合
				// メッセージを設定
				model.addAttribute("message", Message.msg0011E);
			}

		} else {
			// 検索条件が入力されている場合は主キー検索
			ForDispBookEntity forDispBookEntity = searchBookInfo.searchSingleBookInfo(bookService, searchBookId);

			if (forDispBookEntity != null) {

				// bms_bookからデータを取得できた場合
				// modelに画面表示用の書籍情報をセット
				model.addAttribute("forDispBooks", forDispBookEntity);

				// メッセージを設定
				model.addAttribute("message", Message.msg0011I);

			} else {

				// bms_bookが0件の場合
				// メッセージを設定
				model.addAttribute("message", Message.msg0011E);
			}

		}

		return "BookSearch";
	}





	// 書籍情報登録ボタン押下時の処理
	@RequestMapping("/bookEntry")
	public String bookEntry(Model model) {

		userInfo = SessionUtility.getUserInfo(session);

		// ユーザ情報を画面に渡す
		model.addAttribute("userId", userInfo.getUserId());

		// メニュー画面に遷移(仮置き)
		return "Menu";
	}


	// 書籍情報更新ボタン押下時の処理
	@RequestMapping("/bookUpdate")
	public String bookUpdate(Model model) {

		userInfo = SessionUtility.getUserInfo(session);

		// ユーザ情報を画面に渡す
		model.addAttribute("userId", userInfo.getUserId());

		// メニュー画面に遷移(仮置き)
		return "Menu";
	}


	// 書籍情報削除ボタン押下時の処理
	@RequestMapping("/bookDelete")
	public String bookDelete(Model model) {

		userInfo = SessionUtility.getUserInfo(session);

		// ユーザ情報を画面に渡す
		model.addAttribute("userId", userInfo.getUserId());

		// メニュー画面に遷移(仮置き)
		return "Menu";
	}

}
