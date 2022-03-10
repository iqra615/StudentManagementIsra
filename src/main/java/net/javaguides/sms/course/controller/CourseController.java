package net.javaguides.sms.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.sms.course.entity.Course;
import net.javaguides.sms.course.service.CourseService;



@Controller
public class CourseController {
	
	private CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	
	
	
	
	
	//handler method to handle list course and return mode and view
	@GetMapping("/course")
	public String listCourse(Model model) {
		model.addAttribute("course",courseService.getAllCourse());
		return "course";
		
	}
	
	
	
	@GetMapping("addcourse")
	public String createCourseForm(Model model) {
		Course course = new Course();
		model.addAttribute("course", course);
		return "addcourse";
			
	}
	

	
	@PostMapping("/Course/save")
	public String saveCourse(@ModelAttribute("course") Course course) {
		
		courseService.saveCourse(course);
		return "/course";
			
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@GetMapping("/course/edit/{id}")
	public String editCourseForm(@PathVariable Long id, Model model) {
		model.addAttribute("course",courseService.getCourseById(id));
		return "edit_course";
	}
	
	
	
	
	@PostMapping("/course/{id}")
	public String updateCourse(@PathVariable Long id, @ModelAttribute("course") Course course,
			Model model) {
		
		//get course from database id
		Course existingCourse =  courseService.getCourseById(id);
		existingCourse.setId(id);
		existingCourse.setCoursename(course.getCoursename());
		existingCourse.setDuration(course.getDuration());
	
		
		
		//save update course object
		courseService.updateCourse(existingCourse);
		return "redirect:/course";
		
	}
	
	
	
	
	
	// handler method to handle delete course request
	
	@GetMapping("/course/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseService.deleteCourseById(id);
		return "redirect:/course";
	}
	
	
	
	
	
	//extra
	
	@GetMapping("/Course/save")
	public String createStudentForm(Model model) {
		Course course = new Course();
		model.addAttribute("course", course);
		return "redirect:/course";
			
	}
	
	
	
	
	@RequestMapping("/covid")
	public String covid() {
		return "covid";
	}
	
	
	
	


	}

		


