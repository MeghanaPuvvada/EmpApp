package com.capg.empapp.service;

import com.capg.empapp.dao.EmployeeDaoImpl;
import com.capg.empapp.dao.IEmpDao;
import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
//import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {

	IEmpDao dao=new EmployeeDaoImpl();
	
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.addEmployee(e);
	}

	public Employee[] getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}
	//========================================================================================================
	
	public boolean editSalaryByEmployeeId(int id,int empNewSalary) throws InvalidEmployeeIdException {
		if(!dao.editSalaryByEmployeeId(id,empNewSalary))
		{
			throw new InvalidEmployeeIdException();
		}
		else return dao.editSalaryByEmployeeId(id,empNewSalary);
	}

	public boolean editExpByEmployeeId(int id,int empNewExp) throws InvalidEmployeeIdException {
		if(!dao.editExpByEmployeeId(id,empNewExp))
		{
			throw new InvalidEmployeeIdException();
		}
		else return dao.editExpByEmployeeId(id,empNewExp);
	}

	public Employee[] getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return dao.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return dao.getEmployeeBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

	public Employee[] getEmployeeBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return null;
	}

}
