package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Silk;



public class SilkDao extends  HibernateDaoSupport{

	 /**
	    * 
	    * 获取列表
	    * @return
	    */
		public  List<Silk> Silklist(){
			return (List<Silk>)this.getHibernateTemplate().find("from Silk");
			
		}
	
		/**
		 * 编辑
		 */
		    public void updateSilk(Silk silk){
		    	this.getHibernateTemplate().update(silk);
		    }
		    public void saveSilk(Silk silk){
		    	this.getHibernateTemplate().save(silk);
		    }
		
		    /**
		     * fin查询
		     */
		    public  Silk findById(int id){
				return this.getHibernateTemplate().get(Silk.class, id);
		    	
		    	
		    }
		    public List<Silk> findLike(String Internal_PN ,String Layer_Name){

				String sql="from Silk d where d.Internal_PN like ? and d.Layer_Name like ?";
				return  (List<Silk>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%", "%"+Layer_Name+"%");
			}
		    
		    public List<Silk> findLike1(String Internal_PN ,String Layer_Name){

				String sql="from Silk d where d.Internal_PN like ? and d.Layer_Name like ? and status='1'";
				return  (List<Silk>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%", "%"+Layer_Name+"%");
			}
		    public List<Silk> findLike2(String Internal_PN ){

				String sql="from Silk d where d.Internal_PN like ? and status='1'";
				return  (List<Silk>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
			}
	
	
}
