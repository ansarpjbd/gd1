package com.gd.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MYSorting {
	public static void main(String[] args) {
		List<Employee> listEmployee = new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setId(1001);
		e1.setName("Ravinder");
		e1.setSalary(10000.0);
		
		listEmployee.add(e1);
		
		
		Employee e2=new Employee();
		e2.setId(1002);
		e2.setName("Avinder");
		e2.setSalary(10000.0);
		
		listEmployee.add(e2);
		

		Employee e3=new Employee();
		e3.setId(1002);
		e3.setName("Zee");
		e3.setSalary(10000.0);
		
		listEmployee.add(e3);
		
		
		Employee e4=new Employee();
		e4.setId(1002);
		e4.setName("Jojo");
		e4.setSalary(10000.0);
		
		listEmployee.add(e4);
		
		
		Employee e5=new Employee();
		e5.setId(1002);
		e5.setName("John");
		e5.setSalary(10000.0);
		
		listEmployee.add(e5);
		
		//sorting 
		//comparable--it is a interface i java
		               //it is override method compareTo
		//comparator
		//it is sorting based on the name 
		//becuase we have implemented the comparable inteface 
		 //we haver override the String to compara method
		Collections.sort(listEmployee,Collections.reverseOrder());
		
		//System.out.println(listEmployee);
		for(Employee e:listEmployee)
		{
			System.out.println(e);
		}
	}
}
