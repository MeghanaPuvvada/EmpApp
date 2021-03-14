package com.capg.empapp.service;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;


public interface IEmployeeService {

	public boolean addEmployee(Employee e);
	public boolean editSalaryByEmployeeId(int id,int newSalary) throws InvalidEmployeeIdException;
	public boolean editExpByEmployeeId(int id,int newExp) throws InvalidEmployeeIdException;
	public Employee[] getAllEmployees();
	public Employee[] getEmployeeBySalary(int salary);
	public Employee[] getEmployeeBySalaryRange(int salaryRangeMin, int salaryRangeMax);
}
