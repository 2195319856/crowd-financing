package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Surface;



public class SurfaceDao extends HibernateDaoSupport{
	
	 /**
	    * 
	    * 获取列表
	    * @return
	    */
		public  List<Surface> Surfacelist(){
			return (List<Surface>)this.getHibernateTemplate().find("from Surface");
			
		}
	
		/**
		 * 编辑
		 */
		    public void updateSurface(Surface surface){
		    	this.getHibernateTemplate().update(surface);
		    }
		    public void saveSurface(Surface surface){
		    	this.getHibernateTemplate().save(surface);
		    }
		
		    /**
		     * fin查询
		     */
		    public  Surface findById(int id){
				return this.getHibernateTemplate().get(Surface.class, id);
		    	
		    	
		    }
		    public List<Surface> findLike(String Internal_PN,String Layer_Name){

				String sql="from Surface d where d.Internal_PN like ? and d.Layer_Name like ?";
				return  (List<Surface>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
			}
		    
		    public List<Surface> findLike1(String Internal_PN,String Layer_Name){

				String sql="from Surface d where d.Internal_PN like ? and d.Layer_Name like ? and status='1'";
				return  (List<Surface>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%");
			}
		    public List<Surface> findLike2(String Internal_PN){
				String sql="from Surface d where d.Internal_PN like ?  and status='1'";
				return  (List<Surface>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
			}

}
