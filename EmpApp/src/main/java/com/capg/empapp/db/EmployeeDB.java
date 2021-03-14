package com.capg.empapp.db;

import com.capg.empapp.dto.Employee;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDB {

	public static Employee employees[]= new Employee[100];
	public static Employee sal[]=new Employee[100];
	public static Employee salaryRange[]=new Employee[100];
	public static int count=0;
	static {
		employees[0]= new Employee(101,"Meghana",7000,6);
		employees[1]= new Employee(102,"Bhavana",9000,5);
		employees[2]= new Employee(103,"Sahana",15000,9);
		employees[3]= new Employee(104,"Megha",12000,8);
		count=4;
	}
	
	public static boolean addEmployee(Employee e) {
		employees[count++]=e;
		return true;
	}
	
	public static boolean editExpByEmployeeId(int id,int empNewExp) {
		for(Employee employee : employees) {
			if(employee.getEmpId()==id) {
				employee.setExperience(empNewExp);
				return true;
			}
		}
		return false;
	}
	
	public static boolean editSalaryByEmployeeID(int id,int empNewSalary) {
		for(Employee employee : employees) {
			if(employee.getEmpId()==id) {
				employee.setSalary(empNewSalary);
				return true;
			}
		}
		return false;
	}
	
	public static Employee[] getEmployeeBySalary(int salary) {
		
		for (Employee employee : employees) {
			if(employee.getSalary()==salary) {
				sal.add(employee);
			}

		}
			return sal;
	}
	
	public static Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		salaryRange.clear();
		for (Employee employee : employees) {
			if(employee.getSalary()>=salaryRangeMin && employee.getSalary()<=salaryRangeMax) {
				salaryRange.add(employee);	
			}

		}
		
		return salaryRange;
	}
	
	
}
