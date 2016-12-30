package Standardapi;

import java.util.Arrays;

public class string {
	public static void main(String[] args) throws Exception
	{
		//生成String字符窜的方法
		String str = new String();
		System.out.println(str);
		
		String str1 = "";
		System.out.println(str1);
		
		byte[] b = {1,5,10};
		String b_str = new String(b,"utf-8");
		System.out.println(b_str);
		
		
		char[] ch = {'l','o','v','e'};
		String c_str = new String(ch);
		System.out.println(c_str);
		
		c_str = new String(ch,1,3);
		System.out.println(c_str);
		
		String strN = "love";
		System.out.println(strN);
		
		//分解字符串
		byte[] str_b = b_str.getBytes("utf-8");
		System.out.println(Arrays.toString(str_b));
		
		char[] str_ch = c_str.toCharArray();
		System.out.println(str_ch + " " + Arrays.toString(str_ch));
		
		//查询字符串的方法
		char ch0 = strN.charAt(0);
		char ch1 =strN.charAt(1);
		char ch2 =strN.charAt(2);
		char ch3 = strN.charAt(3);
		System.out.println(ch0);
		System.out.println(ch1);
		
		int l = strN.indexOf('l');
		int o = strN.indexOf('o');
		int v = strN.indexOf('v');
		int e = strN.indexOf('e');
		
		System.out.println(l+" " + o + " " + v+ " " + e);
		
		String sstr = "love you";
		System.out.println(sstr.startsWith("lo"));
		System.out.println(sstr.endsWith("ou"));
		
		String highstr = "haoxiangdejitanga";
		System.out.println(highstr.indexOf('a'));
		System.out.println(highstr.indexOf('a',1));
		System.out.println(highstr.indexOf('a',2));
		System.out.println(highstr.lastIndexOf('a'));
		System.out.println(highstr.lastIndexOf('a',5));
		System.out.println(highstr.lastIndexOf('a',4));
		
		//比较
		
		String strZW ="字符串直接量";
		boolean bb = strZW.contentEquals(new String("字符串直接量"));
		System.out.println(bb);
		
		bb = strZW.equals(new String("字符串直接量"));
		System.out.println(bb);
		
		String strYW = "字符串直接量";
		
		int re = strZW.compareTo(strYW);
		System.out.println(re);
		System.out.println('直'-'l');
		
		
		//复制字符串
		
		byte[] copyb = new byte[3];
		String copystr = "love";
		copystr.getBytes(0,3,copyb,0);
		System.out.println(Arrays.toString(copyb));
		
		char[] copyc = new char[4];
		copystr.getChars(0, 4, copyc, 0);
		System.out.println(Arrays.toString(copyc));
		
		String copyStr ="love you , love myself";
		String subS = copyStr.substring(0);
		
		
		//替换
		String oldStr = "love you, love myself";
		String newStr = oldStr.replace('l', 'f');
		System.out.println(newStr);
		newStr = oldStr.replace("love","like");
		System.out.println(newStr);
		
		//大小写转换
		String caseStr = "asd";
		System.out.println(caseStr.toUpperCase());
		System.out.println(caseStr.toLowerCase());
		
		//String用正则表达式
		String strR = "Java is easy ";
		boolean bR = strR.matches("\\w+\\s\\w+\\s\\w+");
		System.out.println(bR);
		strR = strR.replaceAll("\\w+", "笑哈哈");
		System.out.println(strR);
//		strR = strR.replaceFirst("\\W+", "笑眯眯");
//		System.out.println(strR);
		String[] strRR = strR.split("\\s");
		System.out.println(Arrays.toString(strRR));
		
		
		
		
		
	}
}
