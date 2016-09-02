package Standardapi;

import java.math.BigDecimal;

public class bigdecimal {
	public static void main(String[] args)
	{
		
		System.out.println(0.05+0.01);
		System.out.println(0.05-0.01);
		System.out.println(0.05 *0.01);
		System.out.println(0.05/0.01);
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		
		System.out.println(f1.add(f2));
		System.out.println(f1.subtract(f2));
		System.out.println(f1.multiply(f2));
		System.out.println(f1.divide(f2));
	}
}
