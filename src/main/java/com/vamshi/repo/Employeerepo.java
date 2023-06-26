package com.vamshi.repo;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.vamshi.model.Employee;

public interface Employeerepo extends CrudRepository<Employee, Integer> {

}
