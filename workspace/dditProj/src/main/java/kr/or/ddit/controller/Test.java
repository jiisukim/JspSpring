package kr.or.ddit.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = new Date();
		String str = sdf.format(date);
		
		System.out.println(str);
		System.out.println(str.replace("-", File.separator));
		
	}
}
