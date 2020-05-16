/**
 * 
 */
package com.fee.report.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sv
 *
 */
public class DBConnection {
	static String URL = "jdbc:mysql://localhost:3306/fee_report";
	static String DBUSERNAME = "root";
	static String DBPASSWORD = "mysqladmin";
	static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static Connection connection = null;

	public static Connection openConnection() {
		if (connection != null)
			return connection;
		else {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, DBUSERNAME, DBPASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}

	}

}
