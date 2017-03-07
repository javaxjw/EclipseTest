package Standardapi;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		
		Double orderPayAmount = 105.5;
	    Double orderFee = 0.0;
	    BigDecimal pay = new BigDecimal(orderPayAmount);
	    BigDecimal fee  = new BigDecimal(orderFee);
	    Double realAoumt = pay.subtract(fee).doubleValue();
	    System.out.println(realAoumt);
	}
}
