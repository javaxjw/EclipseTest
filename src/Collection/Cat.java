package Collection;

import java.io.Serializable;

public class Cat implements Serializable{
	
	private int age;
	private double height;
	
	public void run(){
		System.out.println("喵咪会跑哦！");
	}
	
	public void speak(){
		System.out.println("喵咪会叫哦！");
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
