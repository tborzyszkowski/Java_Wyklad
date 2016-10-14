package _0D_JDBC;
import java.sql.*;
import java.io.*;
import java.util.*;

class TestDB {
	static String path = "src/_0D_JDBC/";
	public static void main(String args[]) throws ClassNotFoundException {
		try {
			runTest();
		} catch (SQLException ex) {
			while (ex != null) {
				ex.printStackTrace();
				ex = ex.getNextException();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void runTest() throws SQLException, IOException, ClassNotFoundException {
		Connection conn = getConnectionLite();
		try {
			Statement stat = conn.createStatement();

			stat.execute("CREATE TABLE Greetings (Message CHAR(20))");
			stat.execute("INSERT INTO Greetings VALUES ('Hello, World!')");

			ResultSet result = stat.executeQuery("SELECT * FROM Greetings");
			result.next();
			System.out.println(result.getString(1));
			stat.execute("DROP TABLE Greetings");
		} finally {
			conn.close();
		}
	}

/*
 * PostgreSQL connection
 */
	public static Connection getConnection() throws SQLException, IOException {
		Properties props = new Properties();
		FileInputStream in = new FileInputStream(path+"database.properties");
		props.load(in);
		in.close();

		String drivers = props.getProperty("jdbc.drivers");
		if (drivers != null)
			System.setProperty("jdbc.drivers", drivers);
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");

		return DriverManager.getConnection(url, username, password);
	}
/*
 *  SQLite connection
 */
		public static Connection getConnectionLite() 
				throws SQLException, IOException, ClassNotFoundException {
			Properties props = new Properties();
			FileInputStream in = new FileInputStream(path+"databaseLite.properties");
			props.load(in);
			in.close();

			String drivers = props.getProperty("jdbc.drivers");
			if (drivers != null)
				System.setProperty("jdbc.drivers", drivers);
			Class.forName(drivers);
			String url = props.getProperty("jdbc.url");

			return DriverManager.getConnection(url);
		}
}