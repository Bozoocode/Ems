package com.vamshi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employeelogins")
public class Employee {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String empname;

    @Column
    private int age;

    @Column
    private long phono;

    public Employee() {
        // Default constructor required by JPA
    }

    public Employee(String ename, int age, long phono) {
        this.empname = ename;
        this.age = age;
        this.phono = phono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getempname() {
        return empname;
    }

    public void setempname(String ename) {
        empname = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhono() {
        return phono;
    }

    public void setPhono(long phono) {
        this.phono = phono;
    }

   }
