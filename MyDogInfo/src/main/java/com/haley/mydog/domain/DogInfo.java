package com.haley.mydog.domain;

// DTO Ŭ���� �Ǵ� VO Ŭ���� - �����͸� ǥ���ϱ� ���� Ŭ����
public class DogInfo {

	// 1. �÷� �̸��� ������ ���� ����
	private int code;
	private String dname;
	private int age;
	private String gender;

	// 2. ������ �޼ҵ� ����(getter, setter �Լ�)

	// code
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	// dname
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// gender
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// 3. toString() �Լ� ������ ��!
	@Override
	public String toString() {
		return "DogInfo [code=" + code + ", dname=" + dname + ", age=" + age + ", gender=" + gender + "]\n";
	}

}
