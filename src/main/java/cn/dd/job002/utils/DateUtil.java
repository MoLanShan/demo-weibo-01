package cn.dd.job002.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd hh:mm:ss");

	public static Date getDate(String dateString) throws ParseException {
		return dateFormat.parse(dateString);
	}
	
	public static String formatDate(Date date){
		return dateFormat.format(date);
	}
	
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(formatDate(date));
	}

}
