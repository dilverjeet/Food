package com.start;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.main.DbConnection;

public class Starter extends HttpServlet
{
public static Connection connect=null;
public Starter() {
	super();
	// TODO Auto-generated constructor stub
}
public void init()  throws ServletException
{
	DbConnection db=new DbConnection();
	try {
		connect=db.sqlDatabase();
	} 
	catch (Exception e)
	{
		e.printStackTrace();
	} 
	System.out.println("connection established............");
}
}
