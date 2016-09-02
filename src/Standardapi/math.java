package Standardapi;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class math {
	public static void main(String[] args)
	{
		
		System.out.println((int)Math.ceil(2.6));//3
		System.out.println((int)Math.floor(91.5));//91
		System.out.println(Math.round(100.4));//100
		System.out.println(Math.round(98.5));//99
		System.out.println(11%2);//1
		System.out.println(11/2);//5
		System.out.println(Math.abs(-55));
		System.out.println(Math.random());
		
		Random rand = new Random();
		byte[] randB = new byte[20];
		System.out.println(rand.nextInt());//int范围随机数
		System.out.println(rand.nextInt(100));//0——100范围内的int
		System.out.println(rand.nextDouble());//0——1之间的Double
		System.out.println(rand.nextFloat());//0——1之间的Float
		System.out.println(rand.nextLong());
//		rand.setSeed(seed);
		System.out.println(rand.nextBoolean());
		for(int i=0 ; i < 20 ;i++)
		{
			rand.nextBytes(randB);
		}
		System.out.println(Arrays.toString(randB));
		
		ThreadLocalRandom tr = ThreadLocalRandom.current();
		System.out.println(tr.nextDouble(50,55));
		
		
	}
}
