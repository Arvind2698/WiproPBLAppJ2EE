package com.arvind.wipro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.arvind.wipro.bean.User;

public class Db {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName ("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		return con;
	}
	public static boolean addUser(User user) throws ClassNotFoundException, SQLException {
		
		Connection connection=getConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into users values(?,?)");
		
		preparedStatement.setString(1, user.getUsername());
		preparedStatement.setString(2, user.getPassword());
		
		int result=preparedStatement.executeUpdate();
		
		if(result==1) {
			return true;
		}
		
		return false;
		
	}
	public static boolean changePassword(User user) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("update users set password=? where username=?");
		
		preparedStatement.setString(1, user.getPassword());
		preparedStatement.setString(2, user.getUsername());
		
		int result=preparedStatement.executeUpdate();
		
		if(result==1) {
			return true;
		}
		
		return false;
	}
	public static boolean checkUser(User user) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("select password from users where username=?");
		
		preparedStatement.setString(1, user.getUsername());
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			if(resultSet.getString(1).equals(user.getPassword())) {
				return true;
			}
		}
		
		return false;
	}
}

