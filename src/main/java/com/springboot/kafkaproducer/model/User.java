package com.springboot.kafkaproducer.model;

public class User {
    private String name;
    private String dept;
    private Long salary;

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Long getSalary() {
        return salary;
    }

    public User(String name, String dept, Long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}
