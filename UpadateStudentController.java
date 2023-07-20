package com.jspider.jdbc_simple_crud_operation.controller;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
    import java.util.Scanner;
	
    public class UpadateStudentController {
	     public static void main(String[] args) {
	    	 Connection connection=null;
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("Enter Student id to update email");
	    	 int id=sc.nextInt();
	    	 System.out.println("Enter Email you want to update");
	    	 String email = sc.next();
	    	 //Step-1 load /resister
	    	 
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Step-2 create connection
				String url = "jdbc:mysql://localhost:3306/jffsrd-m3";
				String user = "root";
				String pass = "tiger";
				
				Connection connection1=DriverManager.getConnection(url,user,pass);
				
				//Step-3 create Statement
				Statement statement=connection1.createStatement();
			
				//Step-4 Execute Query
				String updateStudentEmailQuery="update student set email='"+email+"'where id="+id;
				int a=statement.executeUpdate(updateStudentEmailQuery);
				if(a==1) {
					System.out.println("Data++++++++++Update+++++++");
				} else {
					System.out.println("Data not updated");
				}
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
