package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentmanagment {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	CallableStatement cstmt;
	PreparedStatement preparedstatement;

	public studentmanagment() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("connection get open");
	}

	public void insertStudent(int id, String name, String address, String phoneNumber, Float percent)
			throws SQLException {

		preparedstatement = connection.prepareStatement("insert into student values(?,?,?,?,?)");
		preparedstatement.setInt(1, id);
		preparedstatement.setString(2, name);
		preparedstatement.setString(3, address);
		preparedstatement.setString(4, phoneNumber);
		preparedstatement.setFloat(5, percent);

		int n = preparedstatement.executeUpdate();
		System.out.println(n + " record is inserted");

	}

	public void getStudent() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from student ");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phoneNumber") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.println();
		}
	}

	public void getStudentByCity(String address) throws SQLException {
		preparedstatement = connection.prepareStatement("select * from student where address = ? ");
		preparedstatement.setString(1, address);

		resultSet = preparedstatement.executeQuery();
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phoneNumber") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.println();
		}
	}

	public void UpadateStudentRollNo(int id, String name, String address, String phoneNumber, Float percent)
			throws SQLException {
		preparedstatement = connection
				.prepareStatement("update student set name=?, address=?, phoneNumber=?, percent=? where id =?");
		preparedstatement.setInt(1, id);
		preparedstatement.setString(2, name);
		preparedstatement.setString(3, address);
		preparedstatement.setString(4, phoneNumber);
		preparedstatement.setFloat(5, percent);

		int n = preparedstatement.executeUpdate();
		System.out.println(n + " record is updated");
	}

	public void deleteStudentByRollNo(int id) throws SQLException {
		preparedstatement = connection.prepareStatement("delete from student where id = ?");
		preparedstatement.setInt(1, id);

		int n = preparedstatement.executeUpdate();
		System.out.println(n + " Record is deleted");
	}

	public void SearchStudentByPercentage(float minPercent, float maxPercent) throws SQLException {
		preparedstatement = connection.prepareStatement("select * from student where percent between ? and ?");
		preparedstatement.setFloat(1, minPercent);
		preparedstatement.setFloat(2, maxPercent);
		resultSet = preparedstatement.executeQuery();
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phoneNumber") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.println();
		}
	}

	public void DetailsofFirstRank() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from  student order by percent desc limit 1  ");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phoneNumber") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.println();
		}
	}

	public void searchStudentByRollNo(int id) throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from student WHERE id = " + id);
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phoneNumber") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.println();
		}
	}

	public void SortStudentByPercent() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from student order by percent Asc");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phoneNumber") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.println();
		}
	}

	public void DisplaySameCity() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement
				.executeQuery("select * from student s1, student s2 where s1.address = s2.address and s1.id != s2.id");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phoneNumber") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.println();
		}
	}

	public void close() throws SQLException {
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		studentmanagment obj = new studentmanagment();
		// obj.insertStudent(113, "Vishal", "Wakad", "9875854565", (float) 89);
		// obj.getStudent();
		// obj.UpadateStudentRollNo(105, "Arti", "Shegeaon", "9875456575", (float)
		// 91);//error
		// obj.getStudentByCity("pimpri");
		// obj.deleteStudentByRollNo(113);
		// obj.SearchStudentByPercentage(85, 95);
		// obj.DetailsofFirstRank();
		// obj.searchStudentByRollNo(101);
		// obj.SortStudentByPercent();
		//obj.DisplaySameCity();
		obj.close();
	}
}
