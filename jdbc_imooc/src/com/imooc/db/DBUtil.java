package com.imooc.db;
//���ڻ�ȡ���ݿ������
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
			// 1.������������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.������ݿ������
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
	// // 1.������������
	// try {
	// Class.forName("com.mysql.jdbc.Driver");
	// } catch (ClassNotFoundException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// // 2.������ݿ������
	// try {
	// conn = DriverManager.getConnection(URL, USER, PASSWORD);
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// // ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ�
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
