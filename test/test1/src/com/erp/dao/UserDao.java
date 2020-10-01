package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.User;



public class UserDao extends HibernateDaoSupport{
	
	public User login(User user){
		List<User> list = this.getHibernateTemplate().findByExample(user);
		
		if (list.size()>0){
            //判断不为空则登录成功
            return list.get(0);
        }else {
            return null;
        }
		
	}
	
	/**
	 * 编辑
	 */
	    public void updateUser(User user){
	   
	    	
	    	this.getHibernateTemplate().update(user);
	    }
	  
	    


}
