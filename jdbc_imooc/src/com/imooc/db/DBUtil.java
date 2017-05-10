package com.imooc.db;
//用于获取数据库的连接
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc?useUnicode=true&amp;characterEncoding=utf-8";
	private static final String USER = "root";
	private static final String PASSWORD = "123456";
	private static Connection conn = null;

	static {
		try {
			// 1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			// 2.获得数据库的连接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}
	// public static void main(String[] args) {
	// // 1.加载驱动程序
	// try {
	// Class.forName("com.mysql.jdbc.Driver");
	// } catch (ClassNotFoundException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// // 2.获得数据库的连接
	// try {
	// conn = DriverManager.getConnection(URL, USER, PASSWORD);
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// // 通过数据库的连接操作数据库，实现增删改查
	// try {
	// Statement stm = conn.createStatement();
	// ResultSet rs = stm
	// .executeQuery("select user_name,age from imooc_goddess");
	// while (rs.next()) {
	// System.out.println(rs.getString("user_name") + ","
	// + rs.getString("age"));
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

}
