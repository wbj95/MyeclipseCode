package jdbc01;

import java.sql.DriverManager;

public class JDBC01 {

	public static void main(String[] args) {
		
		try {
			//注册mysql驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			String url = "jdbc:mysql://127.0.0.1:3306";
			//DriverManager.getConnection(url)
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
