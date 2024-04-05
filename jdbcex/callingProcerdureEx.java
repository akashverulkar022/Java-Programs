package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class callingProcerdureEx {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	CallableStatement cstmt;
	
	public callingProcerdureEx() throws ClassNotFoundException, SQLException {
		connection= MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	public void callingProcedure(int id, String name, String city, String phone_no) throws SQLException {
		cstmt = connection.prepareCall("{call insertCustomer(?,?,?,?)}");
		cstmt.setInt(1,id);
		cstmt.setString(2, name);
		cstmt.setString(3, city);
		cstmt.setString(4, phone_no);
		
		cstmt.execute();
		System.out.println("record is inserted");
	}
	public void close() throws SQLException {
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		callingProcerdureEx obj = new callingProcerdureEx();
		obj.callingProcedure(114, "Vijay", "Tokyo", "9875654532");
		obj.close();
	}
}

