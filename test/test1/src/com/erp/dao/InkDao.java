package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Ink;



public class InkDao extends HibernateDaoSupport{
           
	/**
	 * 
	 * 获取列表
	 * 
	 * @return
	 */
	public List<Ink> inklist() {
		return (List<Ink>) this.getHibernateTemplate().find("from Ink");

	}

	
	/**
	 * 编辑
	 */
	public void updateInk(Ink ink) {
		this.getHibernateTemplate().update(ink);
	}
	public void saveInk(Ink ink) {
		this.getHibernateTemplate().save(ink);
	}

	/**
	 * find查询
	 */
	public Ink findById(int id) {
		return this.getHibernateTemplate().get(Ink.class, id);

	}
	public List<Ink> findLike(String Internal_PN,String Layer_Name){
		String sql="from Ink d where d.Internal_PN like ? and d.Layer_Name like ?";
		return  (List<Ink>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
	}
	
	public List<Ink> findLike1(String Internal_PN,String Layer_Name){
		String sql="from Ink d where d.Internal_PN like ? and d.Layer_Name like ? and status='1'";
		return  (List<Ink>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
	}
	
	public List<Ink> findLike2(String Internal_PN){
		String sql="from Ink d where d.Internal_PN like ? and status='1'";
		return  (List<Ink>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
	}
	
	
}
