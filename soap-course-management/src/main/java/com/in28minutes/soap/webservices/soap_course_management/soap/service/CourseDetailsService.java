package com.in28minutes.soap.webservices.soap_course_management.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.soap.webservices.soap_course_management.soap.bean.Course;
@Component
public class CourseDetailsService {
	
	public enum Status{
		SUCCESS, FAILURE;
	}
	
	private static List<Course> courses = new ArrayList<>();
	
	static {
		
		Course course1 = new Course(1, "Spring", "10 Steps");
		courses.add(course1);
		
		Course course2 = new Course(2, "SpringBoot", "10 Examples");
		courses.add(course2);
		
		Course course3 = new Course(3, "SpringMVC", "6k Students");
		courses.add(course3);
		
		Course course4 = new Course(4, "Maven", "Most popular maven Course");
		courses.add(course4);
	}
	
	//course - 1
	public Course findById(int id) {
		for(Course course:courses) {
			if(course.getId()==id)
				return course;
		}
		return null;
	}
	
	//courses
	public List<Course> findAll(){
		return courses;
	}
	
	//deletecourse
	public Status deleteById(int id) {
		Iterator<Course> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Course course = iterator.next();
			if (course.getId() == id) {
				iterator.remove();
				return Status.SUCCESS;
			}
		}
		return Status.FAILURE;
	}
	
	//updating course & new course

}
