package com.erp.service;

import java.util.List;

import com.erp.bean.Signal;
import com.erp.dao.SignalDao;



public class SignalService {
	
	private SignalDao signalDao;
	
	
	
	public SignalDao getSignalDao() {
		return signalDao;
	}




	public void setSignalDao(SignalDao signalDao) {
		this.signalDao = signalDao;
	}




	/**
	 * cx
	 * 
	 * 
	 */
	public List<Signal> signallist() {
		return signalDao.Signallist();

	}

	
	

	/**
	 * 淇敼
	 * 
	 * @return
	 */

	public void updateSignal(Signal signal) {
		signalDao.updateSignal(signal);

	}
	public void saveSignal(Signal signal) {
		signalDao.saveSignal(signal);

	}


	/**
	 * 
	 * find
	 * 
	 * @return
	 */
	public Signal findByid(int id) {
		return signalDao.findById(id);

	};

	
	
	

	
	
	public List<Signal> findLike(String Internal_PN,String Layer_Name,String Cu_Thick,String Process_Mode){
		return signalDao.findLike(Internal_PN,Layer_Name,Cu_Thick,Process_Mode);
	}
	
	
	public List<Signal> findLike1(String Internal_PN,String Layer_Name,String Cu_Thick,String Process_Mode){
		return signalDao.findLike1(Internal_PN,Layer_Name,Cu_Thick,Process_Mode);
	}
	public List<Signal> findLike2(String Internal_PN){
		return signalDao.findLike2(Internal_PN);
	}
	


}
