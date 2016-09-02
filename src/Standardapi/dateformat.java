package Standardapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {
	public static void main(String[] args) throws ParseException {
		
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
//		DateFormat tf = DateFormat.getTimeInstance(DateFormat.FULL);
//		System.out.println(df.format(Calendar.getInstance().getTime()));
//		System.out.println(tf.format(new Date()));
//		
//		System.out.println(df.parse("2015年13月30日 星期六"));
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(new Date()));
		System.out.println(sdf.parse("今天是2088年8月8日，好日子啊！"));
		
		
	}
}
