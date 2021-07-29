package com.arvind.wipro;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandsOn3 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Emp emp=(Emp)req.getSession().getAttribute("employee");
		
		try {
			if(Db.insertData(emp)) {
				resp.getWriter().print("Emp added to database");
			}else {
				resp.getWriter().print("Error occured");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.getWriter().print("Error occured");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.getWriter().print("Error occured");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.getWriter().print("Error occured");
		}
	}
}
