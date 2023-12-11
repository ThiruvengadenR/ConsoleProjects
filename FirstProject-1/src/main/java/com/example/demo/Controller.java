package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StudentRegister")
public class Controller {
	@Autowired
	StudentService ss;
	@RequestMapping("/addStudent")
	String addStudent(int rollno , String name ,int standard , int totalmarks ,int age )
	{
		System.out.println("ADD student in controller ");
		StudentDetails sd = new StudentDetails(rollno , name ,standard ,totalmarks ,age);
		return (ss.add_Student(sd))? "Student Details added successfully ": "Oops Problem in add Student details ";
	}
	
	@RequestMapping("/getStudent")
	ArrayList getStudentDetail(String password)
	{
		System.out.println("request mapping");
		if(password.equals("Teamwork"))
		{
			System.out.println("team work ");
			return ss.getStudentDetails();
		}
	
		else
			return null;
	}
}
