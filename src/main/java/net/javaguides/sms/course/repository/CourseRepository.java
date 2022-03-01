package net.javaguides.sms.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.course.entity.Course;




public interface CourseRepository extends JpaRepository<Course, Long> {

}
