package _0D_JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

public class CRUDRowSet {
	static String path = "src/_0D_JDBC/";

	public static void main(String[] args) throws SQLException, IOException {
		Connection conn = getConnection();
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE,
				ResultSet.HOLD_CURSORS_OVER_COMMIT);

		String sql = "select * from publishers";
		ResultSet res = st.executeQuery(sql);
		showResultSet(res);

//		System.out.println("--UPDATE--");
//		res.moveToInsertRow();
//		res.updateString("publisher_id", "007");
//		res.updateString("name", "WP");
//		res.updateString("url", "www.wp.pl");
//		res.insertRow();
//		res.beforeFirst();
//
//		showResultSet(res);

		if (res.getConcurrency() == ResultSet.CONCUR_READ_ONLY) {
			System.out.println("ResultSet non-updatable.");
		} else {
			System.out.println("ResultSet updatable.");
		}

//		System.out.println("--DELETE--");
//		res.absolute(8);
//		showResultSet(res);
//		res.last();
//		System.out.println("Wiersz: " + res.getString("publisher_id") + res.getString("name") + res.getString("url"));
//		res.deleteRow();
//		System.out.println("delete row ....");
//		res.absolute(7);
//		showResultSet(res);
//
		System.out.println("--BATCH Insert--");
		sql = "INSERT INTO publishers(publisher_id, name, url) VALUES (?, ?, ?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		int[] affectedRecords;
		int i = 1;
//		ps.setString(1, "xyz"+i);
//		ps.setString(2, "Nazwa_"+i);
//		ps.setString(3, "www.internet.pl");
//		ps.addBatch();
//		i++;
//		ps.setString(1, "xyz"+i);
//		ps.setString(2, "Nazwa_"+i);
//		ps.setString(3, "www.internet.pl");
//		ps.addBatch();
//				
//		affectedRecords = ps.executeBatch();
//		System.out.println("Batch Insert result array:" + Arrays.toString(affectedRecords));
//		
//		showResultSet(res);
//		
//		System.out.println("--BATCH Delete--");
//		sql = "DELETE FROM publishers WHERE publisher_id = ?;";
//		ps = conn.prepareStatement(sql);
//		i = 1;
//		ps.setString(1, "xyz"+i);
//		ps.addBatch();
//		i++;
//		ps.setString(1, "xyz"+i);
//		ps.addBatch();
//		affectedRecords = ps.executeBatch();
//		System.out.println("Batch Delete result array:" + Arrays.toString(affectedRecords));
//		
		System.out.println("--Transakcje--");
		String trace = "-start- ";
		conn.setAutoCommit(false);
		sql = "UPDATE publishers SET name=name || ? WHERE publisher_id=?;";
		ps = conn.prepareStatement(sql);
		ps.setString(1, "_trx1");
		ps.setString(2, "test1");
		ps.executeUpdate();
		trace += "-1update- ";
		Savepoint svpt = conn.setSavepoint("step1");
		trace += "-savepoint- ";
		ps.setString(1, "_trx2");
		ps.setString(2, "test2");
		ps.executeUpdate();
		trace += "-2update- ";
		conn.rollback(svpt);
		trace += "-rollback- ";
		conn.commit();
		trace += "-commit- ";
		System.out.println(trace);
		
		res.close();
		st.close();
		conn.close();
	}

	public static void showResultSet(ResultSet res) throws SQLException {
		ResultSetMetaData rsmd = res.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (res.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				if (i > 1)
					System.out.print(",  ");
				String columnValue = res.getString(i);
				System.out.print(columnValue);
			}
			System.out.println("");
		}
	}

	public static Connection getConnection() throws SQLException, IOException {
		Properties props = new Properties();
		FileInputStream in = new FileInputStream(path + "database.properties");
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

}
