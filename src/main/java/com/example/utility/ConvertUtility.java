package com.example.utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertUtility {

	private ConvertUtility() {

	}

	// LocalDate ⇒ String
	public static String dateToString(LocalDate date) {
		return DateTimeFormatter.ofPattern("yyyy/MM/dd").format(date);
	}

	// LocalDateTime ⇒ String
	public static String dateTimeToString(LocalDateTime dateTime) {
		return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(dateTime);
	}

	// 削除フラグから管理ステータスを判定して返却
	public static String deleteFlagToBmStatus(String deleteFlag) {

		String status = "";

		if (deleteFlag.equals("0")) {
			status = "管理中";
		} else if (deleteFlag.equals("1")) {
			status = "削除済み";
		} else {
			status = "不明";
		}

		return status;
	}

}
