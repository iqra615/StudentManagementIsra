package net.javaguides.sms.course.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.course.entity.Course;
import net.javaguides.sms.course.repository.CourseRepository;
import net.javaguides.sms.course.service.CourseService;



@Service
public class CourseServiceImpl implements CourseService {

	
	private CourseRepository courseRepository;
	
	public CourseServiceImpl(CourseRepository studentRepository) {
		super();
		this.courseRepository = studentRepository;
	}
	
	//@Override
	//public List<Course> getAllCourse() {
		//return courseRepository.findAll();
	//}

	@Override
	public Course saveCourse(Course course) {
	
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Long id) {
	
		return courseRepository.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course) {
		
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);
		
	}

	

	@Override
	public List<Course> getAllCourse() {
	
		 return courseRepository.findAll();
	}

}




