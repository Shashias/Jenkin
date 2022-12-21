package com.form;

import java.sql.Date;

public class User {
private String name;
private String email;
private String password;
private String gender;
private String proffesion;
private String note;
private boolean married;
private Date birthdate;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getProffesion() {
	return proffesion;
}
public void setProffesion(String proffesion) {
	this.proffesion = proffesion;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public boolean isMarried() {
	return married;
}
public void setMarried(boolean married) {
	this.married = married;
}
public Date getBirthdate() {
	return birthdate;
}
public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + ", proffesion="
			+ proffesion + ", note=" + note + ", married=" + married + ", birthdate=" + birthdate + "]";
}


}
