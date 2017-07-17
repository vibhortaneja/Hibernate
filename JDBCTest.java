package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
	public static String USER_NAME = "root";
	public static String PASSWORD = "root";

	public static void main(String args[]) {
		Connection con = null;
		try {
			con = getConnection();
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * finally{ if(con != null) { try{ con.close(); }catch (SQLException e){
	 * e.printStackTrace(); } } }
	 */

	/*
	 * try { Class.forName("DRIVER_CLASS"); Connection con =
	 * DriverManager.getConnection("DATABASE_URL");
	 * 
	 * Statement stmt = con.createStatement(); ResultSet rs =
	 * stmt.executeQuery("select * from emp"); while (rs.next())
	 * System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
	 * rs.getString(3)); con.close(); } catch (Exception e) {
	 * System.out.println(e); } }
	 */

	public static void insert(final Person person) {
		Connection con = null;
		Statement stmt = null;
		final String INSERT = "INSERT INTO PERSON VALUES(" + person.getName() + "\'," + person.getAge() + ",\'"
				+ person.getGender();
	}

	public static void update(final String name) {

	}

	public static Person getAllPerson() {
		Connection connection;
		return null;
	}

	public static void delete(final Person person) {

	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS);
		Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
		return connection;
	}

	public static Person get(final String personName) {
		final String GET_PERSON = "SELECT * FROM TEST WHERE NAME=" + personName;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			stmt = con.createStatement();

		} catch (Exception e) {
		}
		return null;
	}

	public static void close(final Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

	public static void printPersons(final ResultSet rs) {
		if (rs == null) {
			System.out.println("No record fetched. ");
			return;
		}
		System.out.println(rs);
	}

}