package com.imooc.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

public class TestAction {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		GoddessAction action =new GoddessAction();
		
		//新增
		Goddess g=new Goddess();
		
		g.setUser_name("小青22");
		g.setSex(1);
		g.setAge(25);
		g.setBirthday(new Date());
		g.setEmail("xiaoqing@163.com");
		g.setMobile("15688888888");
		g.setIsdel(0);
		g.setId(6);//更新才用到id
		//action.add(g);新增
		//action.edit(g);//更新
		//action.del(6);//删除
		
		//传参数查询
		List<Map<String, Object>> params=new ArrayList<Map<String,Object>>();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "user_name");
		map.put("rela", "=");
		map.put("value", "'小青'");
		
		params.add(map);
		
		List<Goddess> result=action.query(params);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getId()+
					":"+result.get(i).getUser_name());
		}
		/*//查询
				List<Goddess> result=action.qurey();
				for (int i = 0; i < result.size(); i++) {
					System.out.println(result.get(i).getId()+","+result.get(i).getUser_name());
				}*/
	}

}
