package com.silhouetteTech.StudentInfoServices.controller;
import com.silhouetteTech.StudentInfoServices.entity.Student;
import com.silhouetteTech.StudentInfoServices.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class StudentController {
    public StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService){

        this.studentService = studentService;
    }

    @GetMapping(value = "/get-profile", headers = "Accept=application/json")
    public List<Student> getProfile(){

        return studentService.retrieveStudent();
    }

    @GetMapping(value = "/get-profile/{id}", headers = "Accept=application/json")
    public Optional<Student> getSingleProfile(@PathVariable Integer id){

        return studentService.findById(id);
    }

    @PostMapping(value = "/post-profile2", headers = "Accept=application/json")
    public ResponseEntity<Void> createProfile(@RequestBody Student student, UriComponentsBuilder uriComponentsBuilder){
        studentService.createStudent(student);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponentsBuilder.path("/api/{id}").buildAndExpand(student.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @PostMapping("/student_form/")
    public String submitForm(@ModelAttribute("student") Student student) {
        studentService.showForm(student);
        studentService.createStudent(student);
        System.out.println(student);
        return "student_success";
    }

    @PutMapping(value = "/update-profile", headers = "Accept=application/json")
    public ResponseEntity<String> updateProfile(@RequestBody Student currentStudent){
        Optional<Student> updatedStudent = studentService.findById(currentStudent.getId());
        if(updatedStudent==null){
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        studentService.update(currentStudent,currentStudent.getId());
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @DeleteMapping(value = "/delete-profile/{id}", headers = "Accept=application/json")
    public ResponseEntity<String> deleteProfile(@PathVariable Integer id){
        Optional<Student> student = studentService.findById(id);
        if(student==null){
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        studentService.deleteStudent(id);
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);

    }
}
