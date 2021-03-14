package com.capg.empapp.main;
import java.util.*;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.service.EmployeeServiceImpl;
import com.capg.empapp.service.IEmployeeService;
public class EmpMain {

	IEmployeeService empService=new EmployeeServiceImpl();
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		EmpMain webapp= new EmpMain();
		while(true) {
			System.out.println("==========Menu===========");
			System.out.println("1. Add employee ");
			System.out.println("2. Display All Employee ");
			System.out.println("3. Get Employee based on salary ");
			System.out.println("4. Get Employee based on salary Range ");
			System.out.println("5. Edit Salary by Employee ID ");
			System.out.println("6. Edit Exp by Employee ID  ");
			System.out.println("0. EXIT");
			System.out.println("Enter Option");
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
			
			case 1: 
				System.out.println("Enter Employee Id ");
				int empId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Salary ");
				int empSalary = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Exp ");
				int empExp = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Name ");
				String name = sc.nextLine();
				
				Employee e = new Employee(empId, name, empExp, empSalary);
				
				break;
				
			case 2:
				Employee[] arr = webapp.empService.getAllEmployees();
				
				for (Employee employee : arr) {
					System.out.println(employee);
					System.out.println(" ========================================================");
				}
				break;
				
			case 3:
				System.out.println("Enter Employee Salary ");
				int empSalary1 = Integer.parseInt(sc.nextLine());
				
				Employee[] salarys=webapp.empService.getEmployeeBySalary(empSalary1);
				if(salarys.length>0) {
				System.out.println("The Employees with salary of "+empSalary1);
				for (Employee salary:salarys) {
					System.out.println(salary);
					System.out.println(" ========================================================");
				}
				}
				else
					System.out.println("The Entered salary was not matched with any Employee's salary");
				break;
				
			case 4:
				System.out.println("Enter Employee Salary Min");
				int empSalarymin = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Employee Salary Max");
				int empSalarymax = Integer.parseInt(sc.nextLine());
				
				Employee[] salarysRange=webapp.empService.getEmployeeBySalaryRange(empSalarymin, empSalarymax);
				if(salarysRange.length>0) {
				System.out.println("The Employees with in  salary Range  of"+empSalarymin+" to "+empSalarymax);
				for (Employee salR:salarysRange) {
					System.out.println(salR);
					System.out.println(" ========================================================");
				}
				}
				else
					System.out.println("There is no salary in range ");
				break;
				
			case 5:
				System.out.println("Enter Employee Id ");
				int empIdToSearch = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Salary ");
				int empNewSalary = Integer.parseInt(sc.nextLine());
				
				
				
				try
				{
					boolean isChanged = webapp.empService.editSalaryByEmployeeId(empIdToSearch,empNewSalary);
					if(isChanged)
					{
						System.out.println(" Employee Details Updated !!!");
					}
					else
					{
						 throw new Exception("Cannot Find Employee ID...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				break;
				
			case 6:
				System.out.println("Enter Employee Id ");
				int empIdToSearchexp = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Exp ");
				int empNewExp = Integer.parseInt(sc.nextLine());
				
				
				
				try
				{
					boolean isChanged = webapp.empService.editExpByEmployeeId(empIdToSearchexp,empNewExp);
					if(isChanged)
					{
						System.out.println(" Employee Details Updated !!!");
					}
					else
					{
						 throw new Exception("Cannot Find Employee ID...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				break;
				
			case 0:
				System.exit(0);
			}
		}	
	}
}
