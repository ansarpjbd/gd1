package com.gd.day8;

//In generic you will be passing the data type as parameters 
class Employee<A, B, C> {

	A id;
	B name;
	C salary;

	public Employee(A id, B name, C salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void print()
	{
		System.out.println("id is "+this.id);
		System.out.println("name is "+this.name);
		System.out.println("salary is "+this.salary);
	}

}

public class MyGenericClass {

	public static void main(String[] args) {

		Employee<String ,String,String> emp = new Employee<String,String,String>("1001", "Ajay", "1000.0");
         emp.print();
		Employee<Integer ,String,String> emp2 = new Employee<Integer,String,String>(1001, "Ajay", "1000.0");
		System.out.println("==================================");
		emp2.print();
		
	}
}
