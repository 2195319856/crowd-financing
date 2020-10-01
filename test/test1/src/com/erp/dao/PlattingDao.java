package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Platting;



public class PlattingDao extends HibernateDaoSupport {

	/**
	 * 
	 * 获取Platting列表
	 * 
	 * @return
	 */
	public List<Platting> Plattinglist() {
		return (List<Platting>) this.getHibernateTemplate().find("from Platting");

	}

	
	/**
	 * 编辑
	 */
	public void updatePlatting(Platting platting) {
		this.getHibernateTemplate().update(platting);
	}
	public void savePlatting(Platting platting) {
		this.getHibernateTemplate().save(platting);
	}

	/**
	 * find查询
	 */
	public Platting findById(int id) {
		return this.getHibernateTemplate().get(Platting.class, id);

	}
	public List<Platting> findLike(String Internal_PN,String Layer_Name){
		String sql="from Platting d where d.Internal_PN like ? and d.Layer_Name like ?";
		return  (List<Platting>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
	}
	
	public List<Platting> findLike1(String Internal_PN,String Layer_Name){
		String sql="from Platting d where d.Internal_PN like ? and d.Layer_Name like ? and status='1'";
		return  (List<Platting>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
	}
	
	public List<Platting> findLike2(String Internal_PN){
		String sql="from Platting d where d.Internal_PN like ?  and status='1'";
		return  (List<Platting>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
	}
	
}
