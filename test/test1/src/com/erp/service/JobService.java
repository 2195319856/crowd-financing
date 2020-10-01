package com.erp.service;

import java.util.List;

import com.erp.bean.Job;

import com.erp.dao.JobDao;


public class JobService {

private JobDao jobDao;
	

	public JobDao getJobDao() {
	return jobDao;
}




public void setJobDao(JobDao jobDao) {
	this.jobDao = jobDao;
}




	/**
	 * 获取所有列表
	 * 
	 * 
	 */
	public List<Job> joblist(){
		return jobDao.Joblist();
		
	}

	
	
	
	/**
	 * 修改
	 * @return
	 */
	
	public void updateJob(Job job){
		jobDao.updateJob(job);
		
	}
	public void saveJob(Job job){
		jobDao.saveJob(job);
		
	}
	/**
	 * 
	 * find
	 * @return
	 */
	public Job findByid(int id){
		return  jobDao.findById(id);
		
	

	}


	
	public List<Job> findLike(String Internal_PN ,String Layer_Num,String Stack_Up){
		return jobDao.findLike(Internal_PN,Layer_Num,Stack_Up);
	}
	
	public List<Job> findLike1(String Internal_PN ,String Layer_Num,String Stack_Up){
		return jobDao.findLike1(Internal_PN,Layer_Num,Stack_Up);
	}

	public List<Job> findLike2(String Internal_PN){
		return jobDao.findLike2(Internal_PN);
	}
	
	
}
