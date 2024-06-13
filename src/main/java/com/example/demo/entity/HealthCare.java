package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HealthCare {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String age;
	String gender;
	String experience;
	String respect;
	String provider;
	String clear;
	String satisfied;
	String difficulty;
	String recommend;
	String involved;
	String comments;
	String improve;
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
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getRespect() {
		return respect;
	}
	public void setRespect(String repect) {
		this.respect = repect;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getClear() {
		return clear;
	}
	public void setClear(String clear) {
		this.clear = clear;
	}
	public String getSatisfied() {
		return satisfied;
	}
	public void setSatisfied(String satisfied) {
		this.satisfied = satisfied;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getInvolved() {
		return involved;
	}
	public void setInvolved(String involved) {
		this.involved = involved;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getImprove() {
		return improve;
	}
	public void setImprove(String improve) {
		this.improve = improve;
	}
	
	
	
	
	@Override
	public String toString() {
		return "HealthCare [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", experience="
				+ experience + ", repect=" + respect + ", provider=" + provider +", clear=" + clear + ", satisfied=" + satisfied
				+ ", difficulty=" + difficulty + ", recommend=" + recommend + ", involved=" + involved + ", comments="
				+ comments + ", improve=" + improve + "]";
	}
	
	

}
