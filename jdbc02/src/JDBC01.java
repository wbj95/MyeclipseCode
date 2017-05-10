import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC01 {
	public static void main(String[] args) {
		try {
			//注册我么的mysql的驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			String url="jdbc:mysql://127.0.0.1:3306/test";
			String user="root";
			String password="123456";
			
			Connection con=	DriverManager.getConnection(url,user,password);
			System.out.println(con);
			
			//创建statement工具
			//Statement工具能够将sql发送到数据库，并让数据执行
			Statement stat = con.createStatement();
			//写一个sql语句，让Statement工具传给数据库执行
			String sql="insert into student (student,id) values('qaa',3)";
			//让statement工具执行,executeUpdate更新操作，增删改
			stat.executeUpdate(sql);
			//关闭工具
			stat.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动加载失败");
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接数据库失败");
			e.printStackTrace();
		}
	}
}
