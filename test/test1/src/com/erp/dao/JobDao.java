package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.erp.bean.Job;



public class JobDao extends HibernateDaoSupport{
		
		
	   /**
	    * 
	    * 获取列表
	    * @return
	    */
		public  List<Job> Joblist(){
			return (List<Job>)this.getHibernateTemplate().find("from Job");
			
		}
		
		/**
		 * 编辑
		 */
		    public void updateJob(Job job){
		    	this.getHibernateTemplate().update(job);
		    }
		    public void saveJob(Job job){
		    	this.getHibernateTemplate().save(job);
		    }
		
		    /**
		     * fin查询
		     */
		    public  Job findById(int id){
				return this.getHibernateTemplate().get(Job.class, id);
		    	
		    	
		    }
		    //查询语句
		    public List<Job> findLike(String Internal_PN ,String Layer_Num,String Stack_Up){

				String sql="from Job d where d.Internal_PN like ?  and d.Layer_Num like ? and d.Stack_Up like ?";
				return  (List<Job>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%", "%"+Layer_Num+"%","%"+Stack_Up+"%");
			}
		  
		  //查询语句
		    public List<Job> findLike1(String Internal_PN,String Layer_Num,String Stack_Up){
		    	String sql="from Job d where d.Internal_PN like ?  and d.Layer_Num like ? and d.Stack_Up like ? and status='1'";
				
				return  (List<Job>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%", "%"+Layer_Num+"%","%"+Stack_Up+"%");
			}
		    
		    public List<Job> findLike2(String Internal_PN){
				String sql="from Job d where d.Internal_PN like ? and status='1'";
				return  (List<Job>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
			}
		    
		  
	}

