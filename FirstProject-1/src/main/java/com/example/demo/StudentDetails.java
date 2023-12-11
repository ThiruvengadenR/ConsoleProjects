package com.example.demo;

import java.util.ArrayList;
import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class StudentDetails {

	private int rollno;
	private String name;
	private int standard;
	private int totalmarks;
	private int age ;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudentDetails()
	{
		
	}
	public StudentDetails(int rollno, String name, int standard, int totalmarks, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.standard = standard;
		this.totalmarks = totalmarks;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [rollno=" + rollno + ", name=" + name + ", standard=" + standard + ", totalmarks="
				+ totalmarks + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDetails other = (StudentDetails) obj;
		return age == other.age && Objects.equals(name, other.name) && rollno == other.rollno
				&& standard == other.standard && totalmarks == other.totalmarks;
	}
	


}
