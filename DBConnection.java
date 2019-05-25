package models;

import java.sql.connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection() {
		
		connection con = null;
		string url ="jdbc:mysql://localhost:;8002/SellnBuyDb";
		String username = "root";
		String password = "root";
		
		try {
			
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con = DriverManager.getconnection(url,username,password);
			System.out.println("printing connection object +conn");
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
}
