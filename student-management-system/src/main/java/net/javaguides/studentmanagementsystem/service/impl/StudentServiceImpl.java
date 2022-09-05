package net.javaguides.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.studentmanagementsystem.entity.Student;
import net.javaguides.studentmanagementsystem.repository.StudentRepository;
import net.javaguides.studentmanagementsystem.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public List<Student> getAllStudents() {
       
        return studentRepository.findAll();
    }



    @Override
    public Student saveStudent(Student student) {
        
        return studentRepository.save(student);
    }



    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }



    @Override
    public Student updatStudent(Student student) {
        return studentRepository.save(student);
    }



    @Override
    public void deleteStudentbyId(Long id) {
        
        studentRepository.deleteById(id);
    }
    


}
