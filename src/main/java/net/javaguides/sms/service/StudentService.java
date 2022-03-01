package net.javaguides.sms.service;
import net.javaguides.sms.service.StudentService;

import java.util.List;

import net.javaguides.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	// for delete service
	void deleteStudentById(Long id);

}
