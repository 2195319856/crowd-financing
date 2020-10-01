package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Die;
import com.erp.bean.SubMat;

public class SubMatDao extends HibernateDaoSupport{

	 /**
	    * 
	    * 获取列表
	    * @return
	    */
		public  List<SubMat> SubMatlist(){
			return (List<SubMat>)this.getHibernateTemplate().find("from SubMat");
			
		}
		
	
		/**
		 * 编辑
		 */
		    public void updateSubMat(SubMat subMat){
		    	this.getHibernateTemplate().update(subMat);
		    }
		    public void saveSubMat(SubMat subMat){
		    	this.getHibernateTemplate().save(subMat);
		    }
		
		    /**
		     * fin查询
		     */
		    public  SubMat findById(int id){
				return this.getHibernateTemplate().get(SubMat.class, id);
		    	
		    	
		    }
		    public List<SubMat> findLike(String Internal_PN ,String Layer_Name,String Tooling_PN ,String Material_Thick, String Process_Mode){

				String sql=" from SubMat d where d.Internal_PN like  ? and d.Layer_Name like ? and Tooling_PN like ?  and d.Material_Thick like ? and d.Process_Mode like ? ";
				return  (List<SubMat>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%", "%"+Layer_Name+"%","%"+Tooling_PN+"%","%"+Material_Thick+"%","%"+Process_Mode+"%");
			}
		    public List<SubMat> findLike1(String Internal_PN ,String Layer_Name,String Tooling_PN ,String Material_Thick, String Process_Mode){

				String sql=" from SubMat d where d.Internal_PN like  ? and d.Layer_Name like ? and Tooling_PN like ?  and d.Material_Thick like ? and d.Process_Mode like ? and status='1'";
				return  (List<SubMat>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%", "%"+Layer_Name+"%","%"+Tooling_PN+"%","%"+Material_Thick+"%","%"+Process_Mode+"%");
			}
		    
		    public List<SubMat> findLike2(String Internal_PN){
				String sql=" from SubMat d where d.Internal_PN  like ? and status='1'";
				return  (List<SubMat>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
			}

	
}
