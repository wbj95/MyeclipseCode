package com.imooc.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

public class GoddessAction {
	//���Ů��
	public void add(Goddess g) throws Exception{
		GoddessDao dao =new GoddessDao();
		dao.addGoddess(g);
	}
	//��ѯ����Ů��
	public Goddess get(Integer id) throws SQLException{
		GoddessDao dao=new GoddessDao();
		return dao.get(id);
	}
	//�༭Ů��
	public void edit(Goddess g) throws SQLException{
		GoddessDao dao =new GoddessDao();
		dao.updateGoddess(g);
	}
	//ɾ��Ů��
	public void del(Integer id) throws SQLException{
		GoddessDao dao =new GoddessDao();
		dao.delGoddess(id);
	}
	//��ѯ����Ů�񣬷���һ�������
	public List<Goddess>  qurey() throws SQLException{
		GoddessDao dao=new GoddessDao();
		return dao.query();
	}
	//��ѯŮ��
	public List<Goddess> query(List<Map<String, Object>> params) throws Exception{
		GoddessDao dao=new GoddessDao();
		return dao.query(params);
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	/*
	public static void main(String[] args) throws Exception {
		GoddessDao goddessDao=new GoddessDao();
		Goddess g1=new Goddess();
		g1.setUser_name("С��");
		g1.setAge(30);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("xiaoxia@163.com");
		g1.setMobile("15172361922");
		//g1.setCreate_user("wei");
		g1.setUpdate_user("wei");
		g1.setIsdel(1);
		g1.setId(4);
		
//		Goddess g2=goddessDao.get(4);
//		System.out.println(g2.toString());
List<Map<String, Object>> params=new ArrayList<Map<String,Object>>();
		
		Map<String, Object> map=new HashMap<String, Object>();
		
		map.put("name", "user_name");
		map.put("rela", "like");
		map.put("value", "'%С%'");
		
		params.add(map);
		List<Goddess> result=goddessDao.query(params);
		//goddessDao.delGoddess(5);//ɾ��IDΪ5������
		//goddessDao.updateGoddess(g1);����g1
		//goddessDao.addGoddess(g1);����g1
		/*List<Goddess> gsGoddesses=goddessDao.query();//��ѯ�������ݵ����ֺ�����
		for (Goddess goddess : gsGoddesses) {
			System.out.println(goddess.getUser_name()+","+goddess.getAge());
		}*/
		/*for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getId()+
					":"+result.get(i).getUser_name());
		}
	}*/
}
