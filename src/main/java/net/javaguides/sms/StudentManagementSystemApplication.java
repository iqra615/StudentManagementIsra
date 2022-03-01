package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.apply.repository.ApplyRepository;
import net.javaguides.sms.course.repository.CourseRepository;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication

public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private ApplyRepository applyRepository; 
	


	@Override
	public void run(String... args) throws Exception {
		
	}

}
