
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ospjsp", "root", "password@123");
			//Statement st = con.createStatement();
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			return null;
		}

	}

}

/*
 * package project;
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.SQLException;
 * 
 * public class ConnectionProvider {
 * 
 * private static Connection dbCon; private static String dbURL; private static
 * String dbDriver; private static String userName; private static String
 * passWord;
 * 
 * // --------------START------database initialization---------------
 *//**
	 *
	 * @author: Godwin
	 * @Date: 16.11.2023
	 * @version : 1.0
	 * @purpose :Initialize database connection values
	 * @param : Nothing
	 * @see : Nothing
	 * @return: Nothing
	 */
/*
 * 
 * private static void dbInit() { try { dbDriver = "com.mysql.cj.jdbc.Driver";
 * dbURL = "jdbc:mysql://localhost:3306/ospjsp"; userName = "root"; passWord =
 * "password@123"; } catch (Exception e) { e.printStackTrace(); } }
 * 
 * // -------------END---------database initialization--------------- //
 * --------------START----------database connection ------------
 *//**
	 *
	 * @author: Godwin
	 * @Date: 16.11.2023
	 * @version : 1.0
	 * @purpose : database connection
	 * @param : Nothing
	 * @throws : Exception in case of missing driver class
	 * @return:Nothing
	 */
/*
 * 
 * public static void connect() throws ClassNotFoundException, SQLException {
 * dbInit(); try { Class.forName(dbDriver);
 * 
 * dbCon = DriverManager.getConnection(dbURL, userName, passWord);
 * setDbCon(dbCon); } catch (ClassNotFoundException cnfe) {
 * cnfe.printStackTrace(); }
 * 
 * }
 * 
 * // --------------START----------get db connection ------------
 *//**
	 *
	 * @author : Godwin
	 * @date : 16.11.2023
	 * @version: 1.0
	 * @purpose: Get Connection
	 * @param : Nothing
	 * @return : Connection
	 */
/*
 * 
 * public static Connection getDbCon() { return dbCon; } //
 * ------------------END-------------get connection---------
 * 
 * // --------------START----------get db connection ------------
 *//**
	 *
	 * @author : bini
	 * @date : 03.14.2023
	 * @version: 1.0
	 * @purpose: Get Connection
	 * @param : Nothing
	 * @return : Connection
	 */
/*
 * 
 * public static Connection setDbCon(Connection con) { return dbCon; } //
 * ------------------END-------------get connection---------
 * 
 * // --------------START----------close connection ------------
 * 
 *//**
	 *
	 * @author : bini
	 * @date : 03.14.2023
	 * @version: 1.0
	 * @purpose: Close connection
	 * @param : Nothing
	 * @throws :Exception in case of closing connection
	 * @return : Nothing
	 *//*
		 * 
		 * public static void close() throws SQLException { dbCon.close(); } //
		 * ------------------END-------------closing connection--------- }
		 */
