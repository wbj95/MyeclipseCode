package com.dao;

import com.po.Users;

//�û�ҵ���߼���
public class UsersDao {
	public boolean userLogin(Users u){
		if("admin".equals(u.getUsername())&&"admin".equals(u.getPassword()))
		{
			return true;
		}
		else{
			return false;
		}
	}
}
