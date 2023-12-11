package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRep sr ;
	
	static ArrayList al = new ArrayList();

	
	boolean add_Student( StudentDetails object )
	{
		System.out.println("add student work");
		Student s = new Student();
		s.setRollno(object.getRollno());
		s.setName(object.getName());
		s.setStandard(object.getStandard());
		s.setTotalmarks(object.getTotalmarks());
		s.setAge(object.getAge());
		sr.save(s);
	   return true;
	}
	
	ArrayList getStudentDetails()
	{
		System.out.println("getStudentDetails");
		System.out.println(al);
		return al;
	}
}
