package Extends;

import java.io.Serializable;
import java.util.Collection;

public class Person implements Serializable{
	
	
	/**
	 * 人类
	 */
	private static final long serialVersionUID = -8749730862032840578L;
	protected int age;
	private String name;
	private boolean sex;
	
	
	protected Collection run(){
		System.out.println("人会跑步");
		return null;
	}
	
	public void talk(){
		System.out.println("人会说话");
	}
	
	
	public Person() {
		System.out.println("P无参构造器");
	}

	public Person(int age, String name, boolean sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
		System.out.println("有参构造器");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	
}
