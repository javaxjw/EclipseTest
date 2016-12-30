package Standardapi;

import java.util.Scanner;

public class PrintErrorAndDebug {
	private static Scanner s;

	public static void main(String[] args){
		System.out.println("main方法开始运行了");
		System.err.println("手动输出错误");
		System.err.println("出错了");
		System.out.println("运行结束");
		
		s = new Scanner(System.in);
		while(s.hasNext()){
			System.err.println(s.nextLine());
		}
	}
}
