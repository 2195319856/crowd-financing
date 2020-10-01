package com.erp.service;

import java.util.List;

import com.erp.bean.Die;
import com.erp.bean.Silk;
import com.erp.dao.SilkDao;

public class SilkService {
  private SilkDao silkDao;

public SilkDao getSilkDao() {
	return silkDao;
}

public void setSilkDao(SilkDao silkDao) {
	this.silkDao = silkDao;
}
  
/**
 * cx
 * 
 * 
 */
public List<Silk> silklist() {
	return silkDao.Silklist();

}




/**
 * 淇敼
 * 
 * @return
 */

public void updateSilk(Silk silk) {
	silkDao.updateSilk(silk);

}
public void saveSilk(Silk silk) {
	silkDao.saveSilk(silk);

}

/**
 * 
 * find
 * 
 * @return
 */
public Silk findByid(int id) {
	return silkDao.findById(id);

};







public List<Silk> findLike(String Internal_PN,String Layer_Name){
	return silkDao.findLike(Internal_PN,Layer_Name);
}

public List<Silk> findLike1(String Internal_PN,String Layer_Name){
	return silkDao.findLike1(Internal_PN,Layer_Name);
}

public List<Silk> findLike2(String Internal_PN){
	return silkDao.findLike2(Internal_PN);
}





	
}
