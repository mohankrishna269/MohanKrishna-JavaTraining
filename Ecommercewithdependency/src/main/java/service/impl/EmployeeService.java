package service.impl;

import java.util.Set;

import model.Employee;

public interface EmployeeService {
	
	void add(Employee employee);
	
   Set<Employee> employees();

}
