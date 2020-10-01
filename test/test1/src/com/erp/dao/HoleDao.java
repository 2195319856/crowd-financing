package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Hole;



public class HoleDao extends HibernateDaoSupport{
	
	
   /**
    * 
    * 获取列表
    * @return
    */
	public  List<Hole> Holelist(){
		return (List<Hole>)this.getHibernateTemplate().find("from Hole");
		
	}
	
	/**
	 * 编辑
	 */
	    public void updateHole(Hole hole){
	    	this.getHibernateTemplate().update(hole);
	    }
	    public void saveHole(Hole hole){
	    	this.getHibernateTemplate().save(hole);
	    }
	    /**
	     * fin查询
	     */
	    public  Hole findById(int id){
			return this.getHibernateTemplate().get(Hole.class, id);
	    	
	    	
	    }
	  //查询语句
	    public List<Hole> findLike(String Internal_PN,String Layer_Name){

	    	
	    String sql="from Hole d where d.Internal_PN like ? and d.Layer_Name like ? ";
			return  (List<Hole>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
	    }
	    
	    public List<Hole> findLike1(String Internal_PN,String Layer_Name){
	    	String sql="from Hole d where d.Internal_PN like ? and d.Layer_Name like ? and status='1'";
			return  (List<Hole>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
	    }
	    public List<Hole> findLike2(String Internal_PN){    	
			String sql="from Hole d where d.Internal_PN like ?and status='1'";
			return  (List<Hole>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
	    }
		}

