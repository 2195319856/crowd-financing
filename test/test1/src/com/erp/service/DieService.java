package com.erp.service;

import java.util.List;

import com.erp.bean.Die;

import com.erp.dao.DieDao;

public class DieService {
	private DieDao dieDao;
	public DieDao getDieDao() {
		return dieDao;
	}
	public void setDieDao(DieDao dieDao) {
		this.dieDao = dieDao;
	}




	/**
	 * cx
	 * 
	 * 
	 */
	public List<Die> dielist() {
		return dieDao.Dielist();

	}

	
	

	/**
	 * 淇敼
	 * 
	 * @return
	 */

	public void updateDie(Die die) {
		dieDao.updateDie(die);

	}
 public void saveDie(Die die) {
	 dieDao.saveDie(die);
 }
	/**
	 * 
	 * find
	 * 
	 * @return
	 */
	public Die findByid(int id) {
		return dieDao.findById(id);

	};

	
	
	

	
	
	public List<Die> findLike(String Internal_PN,String Layer_Name,String Tooling_PN,String Tool_Type){
		return dieDao.findLike(Internal_PN,Layer_Name,Tooling_PN,Tool_Type);
	}
	public List<Die> findLike1(String Internal_PN,String Layer_Name,String Tooling_PN,String Tool_Type){
		return dieDao.findLike1(Internal_PN,Layer_Name,Tooling_PN,Tool_Type);
	}
	public List<Die> findLike2(String Internal_PN){
		return dieDao.findLike2(Internal_PN);
	}
	
	
	
	

}
