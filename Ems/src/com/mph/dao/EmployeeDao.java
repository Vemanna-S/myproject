package com.mph.dao;

import com.mph.model.Employee;

public interface EmployeeDao {
	
	public void createEmployee(Employee emp);
	public void viewEmployee();
	public void updateEmployee();
	public void deleteEmployee();

}