package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class CourseEvaluation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String course;
	String instructor;
	String coursecontent;
	String effective;
	String expectations;
	String material;
	String assignments;
	String challenging;
	String recommend;
	String discussion;
	String enhance;
	String comments;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getCoursecontent() {
		return coursecontent;
	}
	public void setCoursecontent(String coursecontent) {
		this.coursecontent = coursecontent;
	}
	public String getEffective() {
		return effective;
	}
	public void setEffective(String effective) {
		this.effective = effective;
	}
	public String getExpectations() {
		return expectations;
	}
	public void setExpectations(String expectations) {
		this.expectations = expectations;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getAssignments() {
		return assignments;
	}
	public void setAssignments(String assignments) {
		this.assignments = assignments;
	}
	public String getChallenging() {
		return challenging;
	}
	public void setChallenging(String challenging) {
		this.challenging = challenging;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getDiscussion() {
		return discussion;
	}
	public void setDiscussion(String discussion) {
		this.discussion = discussion;
	}
	public String getEnhance() {
		return enhance;
	}
	public void setEnhance(String enhance) {
		this.enhance = enhance;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "CourseEvaluation [id=" + id + ", name=" + name + ", course=" + course + ", instructor=" + instructor
				+ ", coursecontent=" + coursecontent + ", effective=" + effective + ", expectations=" + expectations
				+ ", material=" + material + ", assignments=" + assignments + ", challenging=" + challenging
				+ ", recommend=" + recommend + ", discussion=" + discussion + ", enhance=" + enhance + ", comments="
				+ comments + "]";
	}
	
	

}
