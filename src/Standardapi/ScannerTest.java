package Standardapi;

import java.util.Scanner;

public class ScannerTest {
	
	public void printSystemin(){
		
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()){
			System.out.println(s.next());
		}
	}
}
