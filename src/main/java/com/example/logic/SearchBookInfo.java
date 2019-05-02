package com.example.logic;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.BookEntity;
import com.example.entity.ForDispBookEntity;
import com.example.service.BookService;
import com.example.utility.ConvertUtility;

public class SearchBookInfo {



	// 全検索用メソッド
	public List<ForDispBookEntity> searchBookInfoAll(BookService bookService) {

		// bms_bookを全検索
		List<BookEntity> loadedBookEntityList = bookService.selectAll();

		// 画面表示用のデータを作成
		List<ForDispBookEntity> forDispBookEntityList = new ArrayList<ForDispBookEntity>();
		ForDispBookEntity forDispBookEntity = null;

		if (loadedBookEntityList != null) {

			// bms_bookから1件以上データが取得できた場合

			for (BookEntity loadedBookEntity : loadedBookEntityList) {

				// 検索結果をコンソールに出力
				System.out.println("=======================================================");
				System.out.println("BOOK_ID         : " + loadedBookEntity.getBookId());
				System.out.println("BOOK_NAME       : " + loadedBookEntity.getBookName());
				System.out.println("BM_START_DATE   : " + loadedBookEntity.getBmStartDate());
				System.out.println("DELETE_FLAG     : " + loadedBookEntity.getDeleteFlag());
				System.out.println("CREATE_TIME     : " + loadedBookEntity.getCreateTime());
				System.out.println("UPDATE_TIME     : " + loadedBookEntity.getUpdateTime());

				forDispBookEntity = new ForDispBookEntity();

				// 画面表示用のEntityに値を設定する
				forDispBookEntity.setBookId(loadedBookEntity.getBookId());
				forDispBookEntity.setBookName(loadedBookEntity.getBookName());
				forDispBookEntity.setBmStartDate(ConvertUtility.dateToString(loadedBookEntity.getBmStartDate()));
				forDispBookEntity.setBmStatus(ConvertUtility.deleteFlagToBmStatus(loadedBookEntity.getDeleteFlag()));
				forDispBookEntity.setCreateTime(ConvertUtility.dateTimeToString(loadedBookEntity.getCreateTime()));
				forDispBookEntity.setUpdateTime(ConvertUtility.dateTimeToString(loadedBookEntity.getUpdateTime()));

				// 画面表示用のリストに追加
				forDispBookEntityList.add(forDispBookEntity);

			}

		} else {
			// 何もしない
		}

		return forDispBookEntityList;

	}

	// 1件検索用メソッド
	public ForDispBookEntity searchSingleBookInfo(BookService bookService, String bookId) {

		BookEntity loadedBookEntity = bookService.selectByPrimaryKey(bookId);

		// 画面表示用のデータを作成
		ForDispBookEntity forDispBookEntity = new ForDispBookEntity();

		if (loadedBookEntity != null) {

			// データが取得できた場合

			// 画面表示用のEntityに値を設定する
			forDispBookEntity.setBookId(loadedBookEntity.getBookId());
			forDispBookEntity.setBookName(loadedBookEntity.getBookName());
			forDispBookEntity.setBmStartDate(ConvertUtility.dateToString(loadedBookEntity.getBmStartDate()));
			forDispBookEntity.setBmStatus(ConvertUtility.deleteFlagToBmStatus(loadedBookEntity.getDeleteFlag()));
			forDispBookEntity.setCreateTime(ConvertUtility.dateTimeToString(loadedBookEntity.getCreateTime()));
			forDispBookEntity.setUpdateTime(ConvertUtility.dateTimeToString(loadedBookEntity.getUpdateTime()));

		} else {

			// データが取得できなかった場合

			forDispBookEntity = null;
		}

		return forDispBookEntity;

	}



}
