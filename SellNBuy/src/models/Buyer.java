package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Buyer {
	
	
		public String RegisterBuyer(String id,String name, String email,int age,String city)
		{
			Connection con = null;
			Statement statement = null;
			ResultSet resultSet = null;
			
			String idDB = "";
			String nameDB = "";
			String emailDB;
			int ageDB;
			String cityDB="";

			try
			{
				con = DBConnection.createConnection();
				statement = con.createStatement();
				resultSet = statement.executeQuery("select nameUsers, passUsers");
				
				while(resultSet.next())
				{
					idDB = resultSet.getString("ID");
					nameDB = resultSet.getString("Name");
					emailDB =resultSet.getString("email");
					ageDB =resultSet.getString("age");
					cityDB =resultSet.getString("City");
					if(ID.equals(idDB) && nameDB equals(name) )
					{
						return "SUCCESS";
					}

				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			return "invalid...";

		

	}

	}

}
