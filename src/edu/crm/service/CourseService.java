package edu.crm.service;

import edu.crm.domain.Course;
import edu.crm.exception.CourseNotFoundException;
import edu.crm.exception.InstructorNotFoundException;

import java.util.List;

public interface CourseService 
{
 void addCourse(Course c);

 Course findCourseByCode(String cd) throws CourseNotFoundException;

 List<Course> getAllCourses();

 List<Course> findCoursesByDepartment(String dept);

 void assignInstructorToCourse(String cCode,int instId) throws CourseNotFoundException, InstructorNotFoundException;
}
