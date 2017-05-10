package com.imooc.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.imooc.db.DBUtil;
import com.imooc.model.Goddess;
//import com.mysql.jdbc.PreparedStatement;

public class GoddessDao {
	//向数据库添加数据
	public void addGoddess(Goddess g) throws Exception{
		Connection conn = DBUtil.getConnection();//先拿到数据库的连接
		String sql="" +
				"insert into imooc_goddess" +
				"(user_name,sex,age,birthday,email,mobile," +
				"create_user,create_date,update_user,update_date,isdel)" +
				"values(" +
				"?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
		PreparedStatement ptmt=conn.prepareStatement(sql);//预加载
		//传参
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getCreate_user());
		ptmt.setString(8, g.getUpdate_user());
		ptmt.setInt(9, g.getIsdel());
		ptmt.execute();//执行
	}
	//更新
	public void updateGoddess(Goddess g) throws SQLException{
		Connection conn=DBUtil.getConnection();
		String sql="" +
				" update imooc_goddess " +
				" set user_name=?,sex=?,age=?,birthday=?,email=?,mobile=?, " +
				" update_user=?,update_date=current_date(),isdel=? " +
				" where id=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getUpdate_user());
		ptmt.setInt(8, g.getIsdel());
		ptmt.setInt(9, g.getId());
		ptmt.execute();
	}
	//删除
	public void delGoddess(Integer id) throws SQLException{
		Connection conn=DBUtil.getConnection();
		String sql="" +
				" delete from imooc_goddess " +
				" where id=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ptmt.execute();
	}
	//查询多个用户
	public List<Goddess> query() throws SQLException {
		Connection conn = DBUtil.getConnection();
		// 通过数据库的连接操作数据库，实现增删改查
			Statement stm = conn.createStatement();
			ResultSet rs = stm
					.executeQuery("select id,user_name,age from imooc_goddess");

			List<Goddess> gsGoddesses = new ArrayList<Goddess>();
			Goddess goddess = null;
			while (rs.next()) {
				goddess = new Goddess();
				goddess.setId(rs.getInt("id"));
				goddess.setUser_name(rs.getString("user_name"));//把数据库中查询到的用户名装入goddess对象
				goddess.setAge(rs.getInt("age"));//把数据库中查询到的年龄装入goddess对象
				
				gsGoddesses.add(goddess);//把goddess对象装入集合中
			}
		return gsGoddesses;
	}
	//通过姓名，手机号，邮箱地址查询
	public List<Goddess> query(String name,String mobile,String email) throws Exception{
		List<Goddess> result=new ArrayList<Goddess>();//结果集
		
		Connection conn=DBUtil.getConnection();
		StringBuilder sb=new StringBuilder();
		sb.append("select * from imooc_goddess  ");
		
		sb.append(" where user_name like ? and mobile like ? and email like ?");
		
		PreparedStatement ptmt=conn.prepareStatement(sb.toString());
		ptmt.setString(1, "%"+name+"%");//模糊查询
		ptmt.setString(2, "%"+mobile+"%");
		ptmt.setString(3, "%"+email+"%");
		System.out.println(sb.toString());//打印sql语句
		ResultSet rs=ptmt.executeQuery();
		
		Goddess g=null;
		while(rs.next()){//遍历输入到对象
			g=new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMobile(rs.getString("mobile"));
			g.setCreate_date(rs.getDate("create_date"));
			g.setCreate_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
			
			result.add(g);
		}
		return result;
	}
	//为了简便参数，用集合传进来
	public List<Goddess> query(List<Map<String, Object>> params) throws Exception{
		List<Goddess> result=new ArrayList<Goddess>();
		
		Connection conn=DBUtil.getConnection();
		StringBuilder sb=new StringBuilder();
		sb.append("select * from imooc_goddess where 1=1 ");//1=1true
		
		if(params!=null&&params.size()>0){
			for (int i = 0; i < params.size(); i++) {
				Map<String, Object> map=params.get(i);
				sb.append(" and  "+map.get("name")+" "+map.get("rela")+" "+map.get("value")+" ");
			}
		}
		
		PreparedStatement ptmt=conn.prepareStatement(sb.toString());
		
		System.out.println(sb.toString());
		ResultSet rs=ptmt.executeQuery();
		
		Goddess g=null;
		while(rs.next()){
			g=new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMobile(rs.getString("mobile"));
			g.setCreate_date(rs.getDate("create_date"));
			g.setCreate_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
			
			result.add(g);
		}
		return result;
	}
	
	//查询一个
	public Goddess get(Integer id) throws SQLException{
		Goddess g=null;
		Connection conn=DBUtil.getConnection();
		String sql="" +
				" select * from imooc_goddess " +
				" where id=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ResultSet rs=ptmt.executeQuery();//返回一个结果集
		while(rs.next()){//遍历
			g=new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMobile(rs.getString("mobile"));
			g.setCreate_date(rs.getDate("create_date"));
			g.setCreate_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
		}
		return g;
	}
}
