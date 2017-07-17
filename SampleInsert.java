package Database;

import java.sql.*;

public class SampleInsert {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			/*
			 * System.out.println("Creating table in given database..."); stmt =
			 * conn.createStatement();
			 * 
			 * String sql = "CREATE TABLE REGISTRATION " +
			 * "(id INTEGER not NULL, " + " first VARCHAR(255), " +
			 * " last VARCHAR(255), " + " age INTEGER, " +
			 * " PRIMARY KEY ( id ))";
			 * 
			 * stmt.executeUpdate(sql);
			 * System.out.println("Created table in given database...");
			 */

			/*
			 * System.out.println("Inserting records into the table..."); stmt =
			 * conn.createStatement();
			 * 
			 * String sql = "INSERT INTO Registration " +
			 * "VALUES (104, 'Zara', 'Ali', 18)"; stmt.executeUpdate(sql); sql =
			 * "INSERT INTO Registration " +
			 * "VALUES (105, 'Mahnaz', 'Fatma', 25)"; stmt.executeUpdate(sql);
			 * sql = "INSERT INTO Registration " +
			 * "VALUES (106, 'Zaid', 'Khan', 30)"; stmt.executeUpdate(sql); sql
			 * = "INSERT INTO Registration " +
			 * "VALUES(107, 'Sumit', 'Mittal', 28)"; stmt.executeUpdate(sql);
			 * System.out.println("Inserted records into the table...");
			 */
			
			System.out.println("Deleting statement...");
			stmt = conn.createStatement();
			String sql1 = "DELETE FROM Registration " + "WHERE id = 101";
			stmt.executeUpdate(sql1);

		} catch (SQLException se) {

			se.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}
}