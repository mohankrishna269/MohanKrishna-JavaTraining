package service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private Set<Employee> employee =new HashSet<Employee>();
	
	@Override
	public void add(Employee emp) {
		employee.add(emp);
		
		
	}
	
	@Override
	public Set<Employee> employees(){
		return employee;
	}

}
