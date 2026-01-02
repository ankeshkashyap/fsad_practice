package com.klu;
import java.sql.*;

public class JDBCCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/fsad";
		String usr="root";
		String pwd="0709";
		try {
			Connection con=DriverManager.getConnection(url,usr,pwd);
			 System.out.println("Connection established");
			 String query="create table if not exists Student ("+ "id int primary key auto_increment," + "name varchar(20)"+")";			 Statement st=con.createStatement();
			 System.out.println("Table Created");
			 con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}

	}

}