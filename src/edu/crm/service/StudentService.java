package edu.crm.service;

import edu.crm.domain.Student;
import edu.crm.exception.StudentNotFoundException;
import java.util.List;

public interface StudentService {

    void addStudent(Student stu);

    Student findStudentByRegNo(String regNo) throws StudentNotFoundException;

    List<Student> getAllStudents();

    void updateStudent(String regNo, String newName, String newEmail) throws StudentNotFoundException;
}
