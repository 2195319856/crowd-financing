package com.erp.service;

import java.util.List;

import com.erp.bean.Die;
import com.erp.bean.Hole;
import com.erp.bean.Impedance;
import com.erp.bean.Job;
import com.erp.bean.Platting;
import com.erp.bean.Signal;
import com.erp.bean.Silk;
import com.erp.bean.SubMat;
import com.erp.bean.Surface;
import com.erp.bean.Ink;
import com.erp.dao.DieDao;
import com.erp.dao.FmainDao;

public class FmainService {
	private FmainDao fmainDao;
		public FmainDao getFmainDao() {
		return fmainDao;
	}
	public void setFmainDao(FmainDao fmainDao) {
		this.fmainDao = fmainDao;
	}

	//job
	public List<Job> findLike1(String Internal_PN){
		return fmainDao.findLike1(Internal_PN);
	}
	
	
//孔层
	public List<Hole> holeList(){
		return fmainDao.HoleList();
		
	}
	public List<Hole> findLike2(String Internal_PN){
		return fmainDao.findLike2(Internal_PN);
	}
	
	//镀铜
	public List<Platting> findLike3(String Internal_PN){
		return fmainDao.findLike3(Internal_PN);
	}
	
	// 阻抗
	public List<Impedance> findLike4(String Cus_FPC_PN){
		return fmainDao.findLike4(Cus_FPC_PN);
	}
	
	// 线路
	public List<Signal> findLike5(String Internal_PN){
		return fmainDao.findLike5(Internal_PN);
	}
	// 模具
	public List<Die> findLike6(String Internal_PN){
		return fmainDao.findLike6(Internal_PN);
	}
	// 油墨
	public List<Ink> findLike7(String Internal_PN){
		return fmainDao.findLike7(Internal_PN);
	}
	
	// 文字
	public List<Silk> findLike8(String Internal_PN){
		return fmainDao.findLike8(Internal_PN);
	}
	
	// 表面处理
	
	public List<Surface> findLike9(String Internal_PN){
		return fmainDao.findLike9(Internal_PN);
	}
	// 辅料
	

	public List<SubMat> findLike10(String Internal_PN){
		return fmainDao.findLike10(Internal_PN);
	}
	
	
	
	
		
}
