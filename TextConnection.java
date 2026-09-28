package com.jdbc;
import java.sql.Connection;
public class TextConnection {
	public static void main(String[] args) {
		try {
			Connection connection = DBconnection.getConnection();
			System.out.println("Database connected sucessfully");
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}