package com.student.management.model;

import lombok.Data;

@Data
public class College{
    private int collegeId;
    private String collegeName;
    private String principleName;
    private String address;
    private String phoneNumber;
    private Student student;
}
