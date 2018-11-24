package javaStart;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBconnect {

	public static void main(String[] args)  {
	
		Connection connection = null ;
		Statement statement = null ;
		ResultSet resultSet = null ; 
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl" ; 
		String user = "scott" ;
		String password = "tiger" ;
		String str = "select * from member" ; 

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver") ;
			connection = DriverManager.getConnection(url, user, password) ;
			statement = connection.createStatement() ; 
		 	resultSet = statement.executeQuery(str) ;

		 	while (resultSet.next()) {
		 		String id = resultSet.getString("id") ;
		 		String pw = resultSet.getString("pw") ;
		 		String name = resultSet.getString("name") ;
		 		String phone = resultSet.getString("phone") ;
		 		
		 		print(id, pw, name, phone) ; 
			} 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) resultSet.close();
				if (statement != null) statement.close();
				if (connection != null) connection.close();
					
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	private static void print(String id, String pw, String name, String phone) {

		System.out.println(id + " " + pw + " " + name + " " + phone );
	}
	
	}