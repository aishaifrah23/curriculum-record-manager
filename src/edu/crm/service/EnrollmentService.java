package edu.crm.service;

import edu.crm.domain.Grade;
import edu.crm.exception.CourseNotFoundException;
import edu.crm.exception.StudentNotFoundException;

public interface EnrollmentService {

    void enrollStudent(String reg, String course) throws StudentNotFoundException, CourseNotFoundException;

    void assignGrade(String reg, String course, Grade grade) throws StudentNotFoundException, CourseNotFoundException;

    void printTranscript(String reg) throws StudentNotFoundException;

    double calculateGPA(String reg) throws StudentNotFoundException;

    void unenrollStudent(String reg, String course) throws StudentNotFoundException, CourseNotFoundException;
}
