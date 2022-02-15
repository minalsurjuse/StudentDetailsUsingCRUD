package com.minal.studentDetails;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Student_Data")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private long rollNo;
    private String firstName;
    private String lastName;
    private String address;
    private double fees;
}
