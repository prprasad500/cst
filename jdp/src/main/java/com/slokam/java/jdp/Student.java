package com.slokam.java.jdp;

import org.springframework.web.bind.annotation.GetMapping;

public class Student {
	//this is studant
	private int id;
	private String Name;
	private int Marks;
	private long Phone;
	//student
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Marks=" + Marks + ", Phone=" + Phone + "]";
	}
	public Student(int id, String name, int marks, long phone) {
		super();
		this.id = id;
		Name = name;
		Marks = marks;
		Phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	

}
