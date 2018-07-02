import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "ABCabc123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from stu");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2)+"  " + rs.getInt(3));
		con.close();
	}
}
	