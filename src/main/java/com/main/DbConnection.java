package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection
{
public static  Connection sqlDatabase()  throws ClassNotFoundException,SQLException
	{
	Connection con=null;
		String dbDriver = "com.mysql.cj.jdbc.Driver";
	    
	   String  dburl="jdbc:mysql://5.189.146.57/bobble";
	   String 	username="root";
	   String 	password="genr@&y&123";
		
		Class.forName(dbDriver);
		 con=DriverManager.getConnection(dburl,username,password);
		System.out.println("Connection established.........");
		return con;
		
		
}

}
