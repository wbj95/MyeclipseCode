import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC01 {
	public static void main(String[] args) {
		try {
			//ע����ô��mysql����������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�
			String url="jdbc:mysql://127.0.0.1:3306/test";
			String user="root";
			String password="123456";
			
			Connection con=	DriverManager.getConnection(url,user,password);
			System.out.println(con);
			
			//����statement����
			//Statement�����ܹ���sql���͵����ݿ⣬��������ִ��
			Statement stat = con.createStatement();
			//дһ��sql��䣬��Statement���ߴ������ݿ�ִ��
			String sql="insert into student (student,id) values('qaa',3)";
			//��statement����ִ��,executeUpdate���²�������ɾ��
			stat.executeUpdate(sql);
			//�رչ���
			stat.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�������ݿ�ʧ��");
			e.printStackTrace();
		}
	}
}
