
package com.erp.service;

import java.util.List;

import com.erp.bean.Ink;
import com.erp.dao.InkDao;


public class InkService {
	private InkDao inkDao;

	public InkDao getInkDao() {
		return inkDao;
	}

	public void setInkDao(InkDao inkDao) {
		this.inkDao = inkDao;
	}
	
	
	
	public List<Ink> inklist() {
		return inkDao.inklist();

	}

	
	

	/**
	 * 淇敼
	 * 
	 * @return
	 */

	public void updateInk(Ink ink) {
		inkDao.updateInk(ink);

	}
	
	public void saveInk(Ink ink) {
		inkDao.saveInk(ink);

	}


	/**
	 * 
	 * find
	 * 
	 * @return
	 */
	public Ink findByid(int id) {
		return inkDao.findById(id);

	};

	
	
	

	
	
	public List<Ink> findLike(String Internal_PN,String Layer_Name){
		return inkDao.findLike(Internal_PN,Layer_Name);
	}
	
	public List<Ink> findLike1(String Internal_PN,String Layer_Name){
		return inkDao.findLike1(Internal_PN,Layer_Name);
	}
	
	public List<Ink> findLike2(String Internal_PN){
		return inkDao.findLike2(Internal_PN);
	}
	
	
	

}
