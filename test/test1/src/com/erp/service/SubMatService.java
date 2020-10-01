package com.erp.service;

import java.util.List;

import com.erp.bean.Die;
import com.erp.bean.SubMat;
import com.erp.dao.DieDao;
import com.erp.dao.SubMatDao;



public class SubMatService {
	 private SubMatDao subMatDao;	
public SubMatDao getSubMatDao() {
		return subMatDao;
	}
public void setSubMatDao(SubMatDao subMatDao) {
		this.subMatDao = subMatDao;
	}




		/**
		 * cx
		 * 
		 * 
		 */
		public List<SubMat> subMatlist() {
			return subMatDao.SubMatlist();

		}



		/**
		 * 淇敼
		 * 
		 * @return
		 */

		public void updateSubMat(SubMat subMat) {
			subMatDao.updateSubMat(subMat);

		}
		public void saveSubMat(SubMat subMat) {
			subMatDao.saveSubMat(subMat);

		}

		/**
		 * 
		 * find
		 * 
		 * @return
		 */
		public SubMat findByid(int id) {
			return subMatDao.findById(id);

		};







		public List<SubMat> findLike(String Internal_PN ,String Layer_Name,String Tooling_PN ,String Material_Thick, String Process_Mode){
			return subMatDao.findLike(Internal_PN,Layer_Name,Tooling_PN,Material_Thick,Process_Mode);
		}

		public List<SubMat> findLike1(String Internal_PN ,String Layer_Name,String Tooling_PN ,String Material_Thick, String Process_Mode){
			return subMatDao.findLike1(Internal_PN,Layer_Name,Tooling_PN,Material_Thick,Process_Mode);
		}

		
		public List<SubMat> findLike2(String Internal_PN){
			return subMatDao.findLike2(Internal_PN);
		}


	
}
