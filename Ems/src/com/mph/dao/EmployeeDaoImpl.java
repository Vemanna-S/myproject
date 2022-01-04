package com.mph.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mph.model.Employee;
import com.mph.util.MyDBConnection;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
 
	public void createEmployee(Employee emp) {
			
			try {
				con = MyDBConnection.getDBConnection();
			    ps	=con.prepareStatement("insert into emp210 values(?,?,?,?,?,?,?)");
				String ename =emp.getEname();
				 int basic = emp.getSalary().getBasic();
				 int da=emp.getSalary().getDa();
				 int hra=emp.getSalary().getHra();
				 int pf=emp.getSalary().getPf();
				 int gross=emp.getSalary().getGross();
				 int net=emp.getSalary().getNet();
				 
				 ps.setString(1, ename);
				 ps.setInt(2, basic);
				 ps.setInt(3,da );
				 ps.setInt(4, hra);
				 ps.setInt(5, pf);
				 ps.setInt(6,gross);
				 ps.setInt(7, net);
				int noofrows= ps.executeUpdate();
				System.out.println(noofrows + " inserted successfully !!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	@Override
	public void viewEmployee() {
	
		try {
			con = MyDBConnection.getDBConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp210");
			while(rs.next())
			{
				System.out.println("Ename : " + rs.getString(1));
				System.out.println("Basic :  "+rs.getInt(2));
				System.out.println("DA : "+rs.getInt(3));
				System.out.println("HRA :"+rs.getInt(4));
				System.out.println("PF :"+rs.getInt(5));
				System.out.println("Gross :"+rs.getInt(6));
				System.out.println("Net Salary :"+rs.getInt(7));				
				System.out.println("**********************");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee() {

		
	}

	@Override
	public void deleteEmployee() {
		
	}

}