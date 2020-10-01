package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Die;



public class DieDao extends HibernateDaoSupport{
	
	 /**
	    * 
	    * 获取列表
	    * @return
	    */
		public  List<Die> Dielist(){
			return (List<Die>)this.getHibernateTemplate().find("from Die");
			
		}
	
		/**
		 * 编辑
		 */
		    public void updateDie(Die die){
		    	this.getHibernateTemplate().update(die);
		    }
		    public void saveDie(Die die) {
		    	this.getHibernateTemplate().save(die);
		    }
		
		    /**
		     * fin查询
		     */
		    public  Die findById(int id){
				return this.getHibernateTemplate().get(Die.class, id);
		    	
		    	
		    }
		    public List<Die> findLike(String Internal_PN,String Layer_Name,String Tooling_PN,String Tool_Type){

				String sql="from Die d where d.Internal_PN like ? and d.Layer_Name like ? and d.Tooling_PN like ? and d.Tool_Type like ?";
				return  (List<Die>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%","%"+Tooling_PN+"%","%"+Tool_Type+"%");
			}
		    public List<Die> findLike1(String Internal_PN,String Layer_Name,String Tooling_PN,String Tool_Type){

				String sql="from Die d where d.Internal_PN like ? and d.Layer_Name like ? and d.Tooling_PN like ? and d.Tool_Type like ? and status='1'";
				return  (List<Die>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%","%"+Tooling_PN+"%","%"+Tool_Type+"%");
			}
		    public List<Die> findLike2(String Internal_PN){

				String sql="from Die d where d.Internal_PN like  ? and status='1'";
				return  (List<Die>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
			}
		    
	}



