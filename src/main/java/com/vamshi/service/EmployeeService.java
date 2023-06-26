package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.vamshi.model.Employee;
import com.vamshi.repo.Employeerepo;

@Service
public class EmployeeService {
	Employeerepo emprep;
@Autowired
	public EmployeeService(Employeerepo emprep) {
		this.emprep = emprep;
	}

	List <Employee> myemployee=new ArrayList<>();
public List<Employee> findallemployess(){
	 emprep.findAll().forEach(employee -> myemployee.add(employee));
return myemployee;
}
public Employee saveemployee( Employee id) {
	return emprep.save(id);
	
	}
public void deleteemployee(int id) {
	  emprep.deleteById(id);
}
public Employee saveandBatchupdate(Employee emp) {
	return  emprep.save(emp);
}
	

}
