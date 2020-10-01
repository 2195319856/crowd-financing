package com.erp.service;

import java.util.List;

import com.erp.bean.Surface;
import com.erp.dao.SurfaceDao;

public class SurfaceService {
	 private SurfaceDao surfaceDao;

	public SurfaceDao getSurfaceDao() {
		return surfaceDao;
	}

	public void setSurfaceDao(SurfaceDao surfaceDao) {
		this.surfaceDao = surfaceDao;
	}
	 
	/**
	 * cx
	 * 
	 * 
	 */
	public List<Surface> surfacelist() {
		return surfaceDao.Surfacelist();

	}




	/**
	 * 淇敼
	 * 
	 * @return
	 */

	public void updateSurface(Surface surface) {
		surfaceDao.updateSurface(surface);

	}
	public void saveSurface(Surface surface) {
		surfaceDao.saveSurface(surface);

	}

	/**
	 * 
	 * find
	 * 
	 * @return
	 */
	public Surface findByid(int id) {
		return surfaceDao.findById(id);

	};







	public List<Surface> findLike(String Internal_PN,String Layer_Name){
		return surfaceDao.findLike(Internal_PN,Layer_Name);
	}

	public List<Surface> findLike1(String Internal_PN,String Layer_Name){
		return surfaceDao.findLike1(Internal_PN,Layer_Name);
	}
	
	public List<Surface> findLike2(String Internal_PN){
		return surfaceDao.findLike2(Internal_PN);
	}





	
}
