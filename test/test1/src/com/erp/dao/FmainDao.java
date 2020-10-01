package com.erp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

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

public class FmainDao extends HibernateDaoSupport {

	/**
	 * 
	 * 料号列表
	 * 
	 * @return
	 */

	// 料号

	public List<Job> findLike1(String Internal_PN) {
		String sql = "from Job d where d.Internal_PN like ? and status='1'";
		return (List<Job>) this.getHibernateTemplate().find(sql, "%" + Internal_PN + "%");
	}

	// 孔层表
	public List<Hole> HoleList() {
		return (List<Hole>) this.getHibernateTemplate().find("from Hole");
	}

	public List<Hole> findLike2(String Internal_PN) {
		String sql = "from Hole d where d.Internal_PN like ?and status='1'";
		return (List<Hole>) this.getHibernateTemplate().find(sql, "%" + Internal_PN + "%");
	}

	// 鍍銅
	public List<Platting> Plattinglist() {
		return (List<Platting>) this.getHibernateTemplate().find("from Platting");
	}

	public List<Platting> findLike3(String Internal_PN) {
		String sql = "from Platting d where d.Internal_PN like ?  and status='1'";
		return (List<Platting>) this.getHibernateTemplate().find(sql, "%" + Internal_PN + "%");
	}

	// 阻抗
	public List<Impedance> Impedancelist() {
		return (List<Impedance>) this.getHibernateTemplate().find("from Impedance");
	}

	public List<Impedance> findLike4(String Cus_FPC_PN) {
		String sql = "from Impedance d where d.Cus_FPC_PN like ? and status='1'";
		return (List<Impedance>) this.getHibernateTemplate().find(sql, "%" + Cus_FPC_PN + "%");
	}

	// 线路
	public List<Signal> Signallist() {
		return (List<Signal>) this.getHibernateTemplate().find("from Signal");
	}

	public List<Signal> findLike5(String Internal_PN) {

		String sql = "from Signal d where d.Internal_PN like ? and status='1'";
		return (List<Signal>) this.getHibernateTemplate().find(sql, "%" + Internal_PN + "%");
	}

	// 模具
	public List<Die> Dielist() {
		return (List<Die>) this.getHibernateTemplate().find("from Die");
	}

	public List<Die> findLike6(String Internal_PN) {
		String sql = "from Die d where d.Internal_PN like  ? and status='1'";
		return (List<Die>) this.getHibernateTemplate().find(sql, "%" + Internal_PN + "%");
	}

	// 油墨
	public List<Ink> inklist() {
		return (List<Ink>) this.getHibernateTemplate().find("from UserInk");
	}

	public List<Ink> findLike7(String Internal_PN) {
		String sql = "from Ink d where d.Internal_PN like ? and status='1'";
		return (List<Ink>) this.getHibernateTemplate().find(sql, "%" + Internal_PN + "%");
	}

	// 文字
	public List<Silk> Silklist() {
		return (List<Silk>) this.getHibernateTemplate().find("from Silk");
	}
	 public List<Silk> findLike8(String Internal_PN ){

			String sql="from Silk d where d.Internal_PN like ? and status='1'";
			return  (List<Silk>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
		}
	// 表面处理
	public List<Surface> Surfacelist() {
		return (List<Surface>) this.getHibernateTemplate().find("from Surface");
	}
	  public List<Surface> findLike9(String Internal_PN){
			String sql="from Surface d where d.Internal_PN like ?  and status='1'";
			return  (List<Surface>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
		}
	// 辅料
	public List<SubMat> SubMatlist() {
		return (List<SubMat>) this.getHibernateTemplate().find("from SubMat");
	}
	 public List<SubMat> findLike10(String Internal_PN){
			String sql=" from SubMat d where d.Internal_PN  like ? and status='1'";
			return  (List<SubMat>) this.getHibernateTemplate().find(sql, "%"+Internal_PN+"%");
		}
}
