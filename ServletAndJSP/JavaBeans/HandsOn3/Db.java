package com.arvind.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("");
		Connection connection=DriverManager.getConnection(null, null, null);
		
		if(connection!=null) {
			return connection;
		}
		
		return null;
	}
	
	public static boolean insertData(Emp emp) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		
		Statement stmStatement=connection.createStatement();
		int res=stmStatement.executeUpdate("insert into emp values("+emp.getName()+","+emp.getId()+","+emp.getDesignation()+")");
		
		if(res==0) {
			return true;
		}
		return false;
		
	}
}
