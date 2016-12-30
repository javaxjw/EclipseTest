package Standardapi;

import java.util.Scanner;

public class scanner {
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		while(s.hasNextLine())
		{
			System.out.println(s.next());
		}
	}
}
