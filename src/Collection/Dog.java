package Collection;

import java.io.Serializable;
/**
 * 狗
 * @author KayWen
 *
 */

public class Dog implements Serializable{
	private int age;
	private double height;
	
	public void run(){
		System.out.println("狗会跑了！");
	}
	
	public void loud(){
		System.out.println("狗会叫了！");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
