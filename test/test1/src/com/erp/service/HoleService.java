package com.erp.service;

import java.util.List;

import com.erp.bean.Hole;

import com.erp.dao.HoleDao;




public class HoleService {

	private HoleDao holeDao;
	
	
	public HoleDao getHoleDao() {
		return holeDao;
	}


	public void setHoleDao(HoleDao holeDao) {
		this.holeDao = holeDao;
	}


	/**
	 * 获取所有列表
	 * 
	 * 
	 */
	public List<Hole> holelist(){
		return holeDao.Holelist();
		
	}

	
	/**
	 * 修改
	 * @return
	 */
	
	public void updateHole(Hole hole){
		holeDao.updateHole(hole);
		
	}
	public void saveHole(Hole hole){
		holeDao.saveHole(hole);
		
	}
	/**
	 * 
	 * find
	 * @return
	 */
	public Hole findByid(int id){
		return holeDao.findById(id);

	}
	
	public List<Hole> findLike(String Internal_PN,String Layer_Name){
		return holeDao.findLike(Internal_PN,Layer_Name);
	}
	
	public List<Hole> findLike1(String Internal_PN,String Layer_Name ){
		return holeDao.findLike1(Internal_PN,Layer_Name);
	}

	public List<Hole> findLike2(String Internal_PN){
		return holeDao.findLike2(Internal_PN);
	}
}
