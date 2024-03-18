package com.dino.model;

// Employee 클래스 선언
public class Employee {
    // 인스턴스 변수 선언
    private String name;
    private String jobTitle;
    private int yearsOfExperience;
    private double salary;

    // Employee 클래스의 생성자
    public Employee(String name, String jobTitle, int yearsOfExperience, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void 일하기() {
        System.out.println(getName() + "가 일을 합니다.");
    }

    // Getter와 Setter 메소드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
