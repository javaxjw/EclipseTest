package Standardapi;

import java.util.Calendar;
import java.util.Date;
import static java.util.Calendar.*;
/**
 * 
 * @author KayWen
 *
 */
public class dateAndcalendar {
	public static void main(String[] args) {
		
		//输出2020年10月30号
		
		Calendar c = Calendar.getInstance();
		c.set(2020, 9, 30);
		System.out.println(c.getTime());
	}
}
