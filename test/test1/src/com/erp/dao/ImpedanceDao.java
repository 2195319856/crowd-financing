package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Impedance;

;

public class ImpedanceDao extends HibernateDaoSupport{
	
	/**
	 * 
	 * 获取d列表
	 * 
	 * @return
	 */
	public List<Impedance> Impedancelist() {
		return (List<Impedance>) this.getHibernateTemplate().find("from Impedance");

	}

	
	/**
	 * 编辑
	 */
	public void updateImpedance(Impedance impedance) {
		this.getHibernateTemplate().update(impedance);
	}
	public void saveImpedance(Impedance impedance) {
		this.getHibernateTemplate().save(impedance);
	}

	/**
	 * find查询
	 */
	public Impedance findById(int id) {
		return this.getHibernateTemplate().get(Impedance.class, id);

	}
	public List<Impedance> findLike(String Cus_FPC_PN,String Layer_Name,String Imp_Mode){
		String sql="from Impedance d where d.Cus_FPC_PN like ? and d.Layer_Name like ? and d.Imp_Mode like ?";
		return  (List<Impedance>) this.getHibernateTemplate().find(sql, "%"+Cus_FPC_PN+"%","%"+Layer_Name+"%","%"+Imp_Mode+"%");
	}
	
	public List<Impedance> findLike1(String Cus_FPC_PN,String Layer_Name,String Imp_Mode){
		String sql="from Impedance d where d.Cus_FPC_PN like ? and d.Layer_Name like ? and d.Imp_Mode like ?";
		return  (List<Impedance>) this.getHibernateTemplate().find(sql, "%"+Cus_FPC_PN+"%","%"+Layer_Name+"%","%"+Imp_Mode+"%");
	}
	
	public List<Impedance> findLike2(String Cus_FPC_PN){
		String sql="from Impedance d where d.Cus_FPC_PN like ? and status='1'";
		return  (List<Impedance>) this.getHibernateTemplate().find(sql, "%"+Cus_FPC_PN+"%");
	}
	

}
