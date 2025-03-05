package com.basic;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperation {

	public void displayDetails(List<Employee> emplist) {
		for (Employee employee : emplist) {
			System.out.println(employee);
		}
	}
	
	public static void main(String[] args) {
		EmployeeOperation operation=new EmployeeOperation();
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(1, "Sajjad Pathan", 23000));
		list.add(new Employee(2, "Ashwin Ambadare", 30000));
		list.add(new Employee(3, "Mahesh Jadhav", 240000));
		
		operation.displayDetails(list);
		

	}

}
