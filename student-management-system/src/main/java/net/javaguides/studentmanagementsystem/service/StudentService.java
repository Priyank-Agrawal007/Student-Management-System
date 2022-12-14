package net.javaguides.studentmanagementsystem.service;

import java.util.List;

import net.javaguides.studentmanagementsystem.entity.Student;

public interface StudentService {
    

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updatStudent(Student student);

    void deleteStudentbyId(Long id);
}
