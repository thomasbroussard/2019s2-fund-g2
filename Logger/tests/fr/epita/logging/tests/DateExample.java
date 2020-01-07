package fr.epita.logging.tests;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
		String timestamp = sdf.format(new Date());
		System.out.println(timestamp);
	}

}
