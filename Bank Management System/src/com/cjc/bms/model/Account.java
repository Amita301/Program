package com.cjc.bms.model;

public class Account {
  private int accNo;
  private String name;
  private long mobNo;
  private long adharNo;
  private String gender;
  private int age;
  private static  double balance;
  private int choice;
public int getChoice() {
	return choice;
}
public void setChoice(int choice) {
	this.choice = choice;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public long getAdharNo() {
	return adharNo;
}
public void setAdharNo(long adharNo) {
	this.adharNo = adharNo;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
