package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MarketResearch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String age;
	String gender;
	String q1;
	String q2;
	String q3;
	String q4;
	String q5;
	String q6;
	String q7;
	String q8;
	String q9;	
	String q10;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQ1() {
		return q1;
	}
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	public String getQ2() {
		return q2;
	}
	public void setQ2(String q2) {
		this.q2 = q2;
	}
	public String getQ3() {
		return q3;
	}
	public void setQ3(String q3) {
		this.q3 = q3;
	}
	public String getQ4() {
		return q4;
	}
	public void setQ4(String q4) {
		this.q4 = q4;
	}
	public String getQ5() {
		return q5;
	}
	public void setQ5(String q5) {
		this.q5 = q5;
	}
	public String getQ6() {
		return q6;
	}
	public void setQ6(String q6) {
		this.q6 = q6;
	}
	public String getQ7() {
		return q7;
	}
	public void setQ7(String q7) {
		this.q7 = q7;
	}
	public String getQ8() {
		return q8;
	}
	public void setQ8(String q8) {
		this.q8 = q8;
	}
	public String getQ9() {
		return q9;
	}
	public void setQ9(String q9) {
		this.q9 = q9;
	}
	public String getQ10() {
		return q10;
	}
	public void setQ10(String q10) {
		this.q10 = q10;
	}
	@Override
	public String toString() {
		return "MarketResearch [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", q1=" + q1
				+ ", q2=" + q2 + ", q3=" + q3 + ", q4=" + q4 + ", q5=" + q5 + ", q6=" + q6 + ", q7=" + q7 + ", q8=" + q8
				+ ", q9=" + q9 + ", q10=" + q10 + "]";
	}
	
	
	

}
