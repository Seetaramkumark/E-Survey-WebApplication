package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmplyeeEngagement 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String name;
  String department;
  String role;
  String opportunity;
  String feedback;
  String worklife;
  String motivation;
  String satisfied;
  String recognized;
  String comfortable;
  String resourses;
  String overalljob;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getOpportunity() {
	return opportunity;
}
public void setOpportunity(String opportunity) {
	this.opportunity = opportunity;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
public String getWorklife() {
	return worklife;
}
public void setWorklife(String worklife) {
	this.worklife = worklife;
}
public String getMotivation() {
	return motivation;
}
public void setMotivation(String motivation) {
	this.motivation = motivation;
}
public String getSatisfied() {
	return satisfied;
}
public void setSatisfied(String satisfied) {
	this.satisfied = satisfied;
}
public String getRecognized() {
	return recognized;
}
public void setRecognized(String recognized) {
	this.recognized = recognized;
}
public String getComfortable() {
	return comfortable;
}
public void setComfortable(String comfortable) {
	this.comfortable = comfortable;
}
public String getResourses() {
	return resourses;
}
public void setResourses(String resourses) {
	this.resourses = resourses;
}
public String getOveralljob() {
	return overalljob;
}
public void setOveralljob(String overalljob) {
	this.overalljob = overalljob;
}
@Override
public String toString() {
	return "EmplyeeEngagement [id=" + id + ", name=" + name + ", department=" + department + ", role=" + role
			+ ", opportunity=" + opportunity + ", feedback=" + feedback + ", worklife=" + worklife + ", motivation="
			+ motivation + ", satisfied=" + satisfied + ", recognized=" + recognized + ", comfortable=" + comfortable
			+ ", resourses=" + resourses + ", overalljob=" + overalljob + "]";
}
  
  
  
  
}
