package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	static Connection connection;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		if(connection==null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch11285","root","Password");
			
			return connection;
		}
		else {
			return connection;
		}
	}
}

