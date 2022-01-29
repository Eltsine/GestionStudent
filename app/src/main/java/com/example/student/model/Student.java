package com.example.student.model;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    String course;
    String mobile;
    int totalFee;
    int feePaid;

    public Student(int id, String name, String course, String mobile, int totalFee, int feePaid) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.mobile = mobile;
        this.totalFee = totalFee;
        this.feePaid = feePaid;
    }

    public Student(String name, String course, String mobile, int totalFee, int feePaid) {
        this.name = name;
        this.course = course;
        this.mobile = mobile;
        this.totalFee = totalFee;
        this.feePaid = feePaid;
    }

    /*
    GETTER AND SETTER
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(int feePaid) {
        this.feePaid = feePaid;
    }
}
