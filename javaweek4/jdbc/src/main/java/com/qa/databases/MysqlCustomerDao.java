package com.qa.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.List;

public class MysqlCustomerDao implements Dao<Customer> {

//	private Connection connection= DriverManager.getConnection("jdbc:mysql://35.67.75.123:3306/IMS", "root", "root");

	private Connection connection;
	public MysqlCustomerDao() throws SQLException {
	this.connection=DriverManager.getConnection("jdbc:mysql://35.230.132.240:3306/IMS","root","root");
	}
	
	

//	C
	public void create(Customer customer) {
		

	}

//R
	public ArrayList<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customer");
			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String firstName = resultSet.getString("firstName");
				String surname = resultSet.getString("surname");
				customers.add(new Customer(id, firstName, surname));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return customers;
	
	}

//U
	public void update(Customer customer) {
	}

//D
	public void delete(int ID) {
	}





}
