package com.haley.mydog.domain;

// DTO 클래스 또는 VO 클래스 - 데이터를 표현하기 위한 클래스
public class DogInfo {

	// 1. 컬럼 이름과 동일한 변수 선언
	private int code;
	private String dname;
	private int age;
	private String gender;

	// 2. 접근자 메소드 생성(getter, setter 함수)

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

	// 3. toString() 함수 재정의 꼭!
	@Override
	public String toString() {
		return "DogInfo [code=" + code + ", dname=" + dname + ", age=" + age + ", gender=" + gender + "]\n";
	}

}
