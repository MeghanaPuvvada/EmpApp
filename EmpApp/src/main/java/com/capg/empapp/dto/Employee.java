package com.capg.empapp.dto;

public class Employee {

	private int empId;
	private String Name;
	private int salary;
	private int experience;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, int salary, int experience) {
		super();
		this.empId = empId;
		Name = name;
		this.salary = salary;
		this.experience = experience;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", salary=" + salary + ", experience=" + experience
				+ "]";
	}
	
	
}
