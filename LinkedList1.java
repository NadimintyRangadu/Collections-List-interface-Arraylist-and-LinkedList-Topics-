package com.cashapona.collections.list.linkedlist.june9;

import java.util.LinkedList;
import java.util.List;

class Company {
	// create a fields:
	private String companyName;
	private String empName;
	private int empId;
	private double salary;
	private int workingDays;

	/* using the toString method */
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", empName=" + empName + ", empId=" + empId + ", salary="
				+ salary + ", workingDays=" + workingDays + "]";
	}

	/*
	 * we can using setters and getters: get means get value, set means set the
	 * value.
	 */
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	// create a constructor
	public Company(String companyName, String empName, int empId, double salary, int workingDays) {
		/*
		 * using this keyword: this keyword reference to the current object with in the
		 * method or constructors, current object means the object which has called as
		 * method or constructors.
		 */
		this.companyName = companyName;
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.workingDays = workingDays;
	}
}

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create list of cashapona:
		List<Company> details = new LinkedList<Company>();

		// creating the cashapona company details:
		// creating the for cashapona class:
		Company cp1 = new Company("Cashapona", "Rangadu", 101, 20000.00, 365);
		Company cp2 = new Company("Tcs", "Raju", 104, 30000.00, 365);
		Company cp3 = new Company("infosys", "Bharath", 1005, 40000.00, 365);

		// Company details adding to the list (linked list):
		// we can using the add() method to add the company details:

		details.add(cp1);
		details.add(cp2);
		details.add(cp3);
		// print the company details:
		// System.out.println("Print the company details:" + details);

		// Iterator:
		/*
		 * Iterator<Company> it = details.iterator(); // using while loop: while
		 * (it.hasNext()) {
		 * 
		 * System.out.println("print the elements for company:" + it.next()); }
		 */
		// for loop:
		for (Company cp : details) {
			System.out.println("Print the elements for Company:" + cp);
		}

	}

}
