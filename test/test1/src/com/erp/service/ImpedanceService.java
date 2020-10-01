package com.erp.service;

import java.util.List;

import com.erp.bean.Impedance;


import com.erp.dao.ImpedanceDao;

public class ImpedanceService {
	
	private ImpedanceDao impedanceDao;
	
	
	public ImpedanceDao getImpedanceDao() {
		return impedanceDao;
	}




	public void setImpedanceDao(ImpedanceDao impedanceDao) {
		this.impedanceDao = impedanceDao;
	}




	/**
	 * cx
	 * 
	 * 
	 */
	public List<Impedance> impedancelist() {
		return impedanceDao.Impedancelist();
	}

	
	

	/**
	 * 淇敼
	 * 
	 * @return
	 */

	public void updateImpedance(Impedance impedance) {
		impedanceDao.updateImpedance(impedance);

	}
	public void saveImpedance(Impedance impedance) {
		impedanceDao.saveImpedance(impedance);

	}

	/**
	 * 
	 * find
	 * 
	 * @return
	 */
	public Impedance findByid(int id) {
		return impedanceDao.findById(id);

	};

	
	
	

	
	
	public List<Impedance> findLike(String Cus_FPC_PN,String Layer_Name,String Imp_Mode){
		return impedanceDao.findLike(Cus_FPC_PN,Layer_Name,Imp_Mode);
	}
	public List<Impedance> findLike1(String Cus_FPC_PN,String Layer_Name,String Imp_Mode){
		return impedanceDao.findLike1(Cus_FPC_PN,Layer_Name,Imp_Mode);
	}
	public List<Impedance> findLike2(String Cus_FPC_PN){
		return impedanceDao.findLike2(Cus_FPC_PN);
	}
	
}
