package com.mph.model;

import java.io.Serializable;

public class Employee implements Serializable {
	 private String ename;
	 private Salary salary;
	 
	 public Employee()
	 {		 
		 System.out.println("From Employee Constructor");
	 }
	 public void setEname(String ename)
	 {
		 this.ename=ename;
	 }
	 public String getEname()
	 {
		 return ename;
	 }	 
	 
	 
	 public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public String toString()
	 {
		 return "Employee  [ " + this.ename +"  " + this.salary+  "  ]";
	 }
	 

}