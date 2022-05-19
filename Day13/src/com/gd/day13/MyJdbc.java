package com.gd.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

class Employee {

	int id;
	String name;
	double salary;

}
//CRUD
		//create
		//READ
		//Update
		//Delete
public class MyJdbc {
	// JDBC --java database connectivity
	// JDBC drivers--classes which will connect the program to database

	// SQL --
	// Database--it is software
	// it will manage the data in table form

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			// load the jdbc class
			Class.forName("com.mysql.jdbc.Driver");
			// get the connect
			String url = "jdbc:mysql://localhost:3306/emp?characterEncoding=latin1";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null) {
				System.out.println("connected !");
				// statement
				Statement st = con.createStatement();

				System.out.println("enter the id");
				// int id=sc.nextInt();

				System.out.println("enter the name");
				// String name=sc.next();

				System.out.println("enter the salary");
				// int salary=sc.nextInt();

				// String query="insert into employee values("+id+",'"+name+"',"+salary+")";
				// execute query
				// st.execute(query);
                  String table="employee";
				String selectQuery = "Select * From "+table;
				ResultSet rs = st.executeQuery(selectQuery);
				// rs.next() it i will return the true or false
				// true --if there is next record avaiable
				// false --if no record is there it will give me false

				System.out.println("id          name              salary");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "           " + rs.getString(2) + "          " + rs.getInt(3));

				}

				String updateQuery = "update employee set salary=4000 where id=3";

				String deleteQuery = "delete from employee where id=3;";

			} else {
				System.out.println("Not Connected !");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
