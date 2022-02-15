package com.minal.studentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController{

    @Autowired
    private StudentService studentService;

    @PostMapping("/savestudentdetails")
    public Student saveStudentDetails(@RequestBody Student student){
        return studentService.saveStudentDetails(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentDetailsById(@PathVariable(value = "id") int studentId){
        return studentService.getStudentDetailsById(studentId);
    }

    @GetMapping("/allstudentdetails")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/updatestudentdetails")
    public Student updateStudentDetails(@RequestBody Student student){
        return studentService.updateStudentDetails(student);
    }

    @DeleteMapping("/deletestudent")
    public String deleteStudentById(@RequestParam int studentId){
        return studentService.deleteStudent(studentId);
    }
}
