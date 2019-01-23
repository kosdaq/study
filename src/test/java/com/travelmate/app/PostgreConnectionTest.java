package com.travelmate.app;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class PostgreConnectionTest {

	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/Study";
	private static final String USER = "postgres";
	private static final String PASSWORD = "admin";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
			
			System.out.println(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
