package com.example9;

public class Tamo {

	private String name;
	private int age;
	private String hobby;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return hobby;
	}

	public void setColor(String hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Tamo [name=" + name + ", age=" + age + ", hobby=" + hobby + ", gender=" + gender + "]";
	}

}
