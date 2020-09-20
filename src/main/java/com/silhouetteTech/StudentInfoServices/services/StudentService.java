package com.silhouetteTech.StudentInfoServices.services;

import com.silhouetteTech.StudentInfoServices.entity.Student;
import com.silhouetteTech.StudentInfoServices.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> retrieveStudent(){
        List<Student> listOfStudent = (List<Student>)studentRepository.findAll();

        return listOfStudent;
    }
    public String showForm(Student stdnt) {
        Student student = new Student();
        stdnt.addAttribute("student", student);
        return "student_form";
    }
    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public Optional<Student> findById(Integer id){
        return studentRepository.findById(id);
    }

    public Student update(Student student, Integer id){
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
}
