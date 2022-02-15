package com.minal.studentDetails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudentDetails(Student student){

        return studentRepository.save(student);
    }

    public Student getStudentDetailsById(int id){
        return studentRepository.findById(id).orElseThrow(null);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student updateStudentDetails(Student student){
        Student student1 = studentRepository.findById(student.getStudentId()).orElseThrow(null);
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setFees(student.getFees());
        student1.setAddress(student.getAddress());
        student1.setRollNo(student.getRollNo());
        return studentRepository.save(student1);
    }

    public String deleteStudent(int studentId){
        studentRepository.deleteById(studentId);
        return "Student details deleted successfully!";
    }
}
