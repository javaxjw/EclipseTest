package Standardapi;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine())
		{
			System.out.println(s.next());
		}
	}
}
