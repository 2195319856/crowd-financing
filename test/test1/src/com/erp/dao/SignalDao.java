
package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Signal;


public class SignalDao extends HibernateDaoSupport {

	
	   /**
	    * 
	    * 获取列表
	    * @return
	    */
		public  List<Signal> Signallist(){
			return (List<Signal>)this.getHibernateTemplate().find("from Signal");
			
		}
	
		/**
		 * 编辑
		 */
		    public void updateSignal(Signal signal){
		    	this.getHibernateTemplate().update(signal);
		    }
		    public void saveSignal(Signal signal){
		    	this.getHibernateTemplate().save(signal);
		    }
		
		    /**
		     * fin查询
		     */
		    public  Signal findById(int id){
				return this.getHibernateTemplate().get(Signal.class, id);
		    	
		    	
		    }
		    public List<Signal> findLike(String Internal_PN,String Layer_Name,String Cu_Thick,String Process_Mode){

				String sql="from Signal d where d.Internal_PN like ? and d.Layer_Name like ? and d.Cu_Thick like ? and d.Process_Mode like ?";
				return  (List<Signal>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%","%"+Cu_Thick+"%","%"+Process_Mode+"%");
			}
		    public List<Signal> findLike1(String Internal_PN,String Layer_Name,String Cu_Thick,String Process_Mode){

				String sql="from Signal d where d.Internal_PN like ? and d.Layer_Name like ? and d.Cu_Thick like ? and d.Process_Mode like ? and status='1'";
				return  (List<Signal>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%","%"+Layer_Name+"%","%"+Cu_Thick+"%","%"+Process_Mode+"%");
			}
		    
		    public List<Signal> findLike2(String Internal_PN){

				String sql="from Signal d where d.Internal_PN like ? and status='1'";
				return  (List<Signal>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
			}
	}
	

