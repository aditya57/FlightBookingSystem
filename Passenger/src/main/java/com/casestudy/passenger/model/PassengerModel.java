package com.casestudy.passenger.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="Passenger")
public class PassengerModel {
	@Id
	private String id;
	@Field
	private String user_id;
	@Field
	private String Name;
	@Field
	private String Email;
	@Field
	private String password;
	@Field
	private String Age;
	@Field
	private String Gender;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", user_id=" + user_id + ", Name=" + Name + ", Email=" + Email + ", password="
				+ password + ", Age=" + Age + ", Gender=" + Gender + "]";
	}
	

	

}
