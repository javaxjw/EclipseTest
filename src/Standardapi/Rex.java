package Standardapi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rex {
	public static void main(String[] args) {
		
//		String rex = "a*b";
//		Pattern p = Pattern.compile(rex);
//		Matcher result = p.matcher("aaaab");
//		boolean b = result.matches();
//		System.out.println(b);
//		
//		b = Pattern.matches(rex, "aaab");
//		System.out.println(b);
		
//		String tar = "我想买一本Java书籍，有的联系我13844567787" 
//				+ "交朋友，电话是15899865523" + "出售二手电脑，联系方式13533678897";
//		
//		Pattern p = Pattern.compile("((13\\d{9})|(15\\d{9}))");
//		Matcher m = p.matcher(tar);
//		System.out.println(m.matches());
//		while(m.find())
//		{
//			System.out.println(m.group());
//			System.out.println(m.start());
//			System.out.println(m.end());
//		}
		
//		String tar = "Java is very easy";
//		Pattern p = Pattern.compile("\\w+");
//		Matcher m = p.matcher(tar);
//		while(m.find())
//		{
//			System.out.println(m.group());
//			System.out.println(m.start());
//			System.out.println(m.end());
//		}
		
		String[] arrStr = {"kongyeeku@163.com", "kongyeeku@gmail.com"
				, "ligang@crazy.org","wawa@abc.xx" };
		
		Pattern p = Pattern.compile("\\w{3,20}@\\w+\\.(com|org|cn|net|gov)");
		Matcher m =null;
		
		for(String s : arrStr)
		{
			if(m==null){
				m = p.matcher(s);
			}
			else{
				m.reset(s);
			}
			System.out.println( s + (m.matches()?"是有效邮箱地址" : "不是有效邮箱地址"));
		}
		
		}
	}

