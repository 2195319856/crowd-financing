package com.erp.service;

import java.util.List;

import com.erp.bean.Platting;
import com.erp.dao.PlattingDao;


public class PlattingService {

	private PlattingDao plattingDao;
	
	public PlattingDao getPlattingDao() {
		return plattingDao;
	}
	public void setPlattingDao(PlattingDao plattingDao) {
		this.plattingDao = plattingDao;
	}
	/**
	 * cx
	 * 
	 * 
	 */
	public List<Platting> plattinglist() {
		return plattingDao.Plattinglist();

	}

	
	

	/**
	 * 淇敼
	 * 
	 * @return
	 */

	public void updatePlatting(Platting platting) {
		plattingDao.updatePlatting(platting);

	}
	public void savePlatting(Platting platting) {
		plattingDao.savePlatting(platting);

	}

	/**
	 * 
	 * find
	 * 
	 * @return
	 */
	public Platting findByid(int id) {
		return plattingDao.findById(id);

	};

	
	
	

	
	
	public List<Platting> findLike(String Internal_PN,String Layer_Name){
		return plattingDao.findLike(Internal_PN,Layer_Name);
	}
	
	public List<Platting> findLike1(String Internal_PN,String Layer_Name){
		return plattingDao.findLike1(Internal_PN,Layer_Name);
	}
	public List<Platting> findLike2(String Internal_PN){
		return plattingDao.findLike2(Internal_PN);
	}

}
