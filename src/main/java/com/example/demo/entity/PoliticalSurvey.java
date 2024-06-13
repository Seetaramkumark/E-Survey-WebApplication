package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PoliticalSurvey {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String age;
	String gender;
	String vote;
	String news;
	String party;
	String satisfied;
	String believe;
	String social;
	String info;
	String active;
	String changes;
	String suggestions;
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
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getSatisfied() {
		return satisfied;
	}
	public void setSatisfied(String satisfied) {
		this.satisfied = satisfied;
	}
	public String getBelieve() {
		return believe;
	}
	public void setBelieve(String believe) {
		this.believe = believe;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getChanges() {
		return changes;
	}
	public void setChanges(String changes) {
		this.changes = changes;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	@Override
	public String toString() {
		return "PoliticalSurvey [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", vote=" + vote
				+ ", news=" + news + ", party=" + party + ", satisfied=" + satisfied + ", believe=" + believe
				+ ", social=" + social + ", info=" + info + ", active=" + active + ", changes=" + changes
				+ ", suggestions=" + suggestions + "]";
	}
	
	

}
