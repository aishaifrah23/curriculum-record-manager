package edu.crm.service;

import edu.crm.domain.Instructor;
import edu.crm.exception.InstructorNotFoundException;
import java.util.List;

public interface InstructorService {

    void addInstructor(Instructor inst);

    Instructor findInstructorById(int instId) throws InstructorNotFoundException;

    List<Instructor> getAllInstructors();
}
