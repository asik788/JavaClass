package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class PsRs {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"ABCabc123");
		PreparedStatement stmt = con.prepareStatement("insert into stu values(?,?,?)");
		stmt.setInt(1, 9);
		stmt.setString(2, "Acc");
		stmt.setInt(3, 92);
		int i = stmt.executeUpdate();
		System.out.println(i + " records inserted");
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:postgresql://localhost:5432/postgres");
		rowSet.setUsername("postgres");
		rowSet.setPassword("ABCabc123");

		rowSet.setCommand("select * from stu");
		rowSet.execute();

		while (rowSet.next()) {
			System.out.println("id: " + rowSet.getInt(1));
			System.out.println("name: " + rowSet.getString(2));
			System.out.println("Marks: " + rowSet.getInt(3));
			con.close();
		}
	}
}
