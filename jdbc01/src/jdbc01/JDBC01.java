package jdbc01;

import java.sql.DriverManager;

public class JDBC01 {

	public static void main(String[] args) {
		
		try {
			//ע��mysql��������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�
			String url = "jdbc:mysql://127.0.0.1:3306";
			//DriverManager.getConnection(url)
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
