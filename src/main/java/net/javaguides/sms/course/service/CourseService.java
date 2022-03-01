package net.javaguides.sms.course.service;
import java.util.List;

import net.javaguides.sms.course.entity.Course;
import net.javaguides.sms.entity.Student;

public interface CourseService {

	
	
	
	Course saveCourse(Course course);
	
	Course getCourseById(Long id);
	Course updateCourse(Course course);
	
	// for delete service
	void deleteCourseById(Long id);


	List<Course> getAllCourse();

	List<Course> getAllCourses();

	


	

	


	

}
