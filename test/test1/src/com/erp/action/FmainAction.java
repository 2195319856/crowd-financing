package com.erp.action;

import java.io.UnsupportedEncodingException;
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

import com.erp.service.FmainService;

public class FmainAction {
	private String Internal_PN;

	public String getInternal_PN() {
		return Internal_PN;
	}

	public void setInternal_PN(String internal_PN) {
		Internal_PN = internal_PN;
	}

	private FmainService fmainService;

	public FmainService getFmainService() {
		return fmainService;
	}

	public void setFmainService(FmainService fmainService) {
		this.fmainService = fmainService;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 料號

	private List<Job> JobList;
	private Job job;

	public List<Job> getJobList() {
		return JobList;
	}

	public void setJobList(List<Job> jobList) {
		JobList = jobList;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	// 孔层

	private List<Hole> HoleList;
	private Hole hole;

	public List<Hole> getHoleList() {
		return HoleList;
	}

	public void setHoleList(List<Hole> holeList) {
		HoleList = holeList;
	}

	public Hole getHole() {
		return hole;
	}

	public void setHole(Hole hole) {
		this.hole = hole;
	}
	// 镀铜

	private List<Platting> Plattinglist;
	private Platting platting;

	public List<Platting> getPlattinglist() {
		return Plattinglist;
	}

	public void setPlattinglist(List<Platting> plattinglist) {
		Plattinglist = plattinglist;
	}

	public Platting getPlatting() {
		return platting;
	}

	public void setPlatting(Platting platting) {
		this.platting = platting;
	}
	// 阻抗

	private List<Impedance> Impedancelist;
	private Impedance impedance;

	public List<Impedance> getImpedancelist() {
		return Impedancelist;
	}

	public void setImpedancelist(List<Impedance> impedancelist) {
		Impedancelist = impedancelist;
	}

	public Impedance getImpedance() {
		return impedance;
	}

	public void setImpedance(Impedance impedance) {
		this.impedance = impedance;
	}
	// 线路

	private List<Signal> Signallist;
	private Signal signal;

	public List<Signal> getSignallist() {
		return Signallist;
	}

	public void setSignallist(List<Signal> signallist) {
		Signallist = signallist;
	}

	public Signal getSignal() {
		return signal;
	}

	public void setSignal(Signal signal) {
		this.signal = signal;
	}
	// 模具

	private List<Die> Dielist;
	private Die die;

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}

	public List<Die> getDielist() {
		return Dielist;
	}

	public void setDielist(List<Die> dielist) {
		Dielist = dielist;
	}
	// 油墨

	private List<Ink> Inklist;
	private Ink ink;

	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
	}

	public List<Ink> getInklist() {
		return Inklist;
	}

	public void setInklist(List<Ink> inklist) {
		Inklist = inklist;
	}

	// 文字

	private List<Silk> Silklist;
	private Silk silk;

	public List<Silk> getSilklist() {
		return Silklist;
	}

	public void setSilklist(List<Silk> silklist) {
		Silklist = silklist;
	}

	public Silk getSilk() {
		return silk;
	}

	public void setSilk(Silk silk) {
		this.silk = silk;
	}
	// 表面處理

	private List<Surface> Surfacelist;
	private Surface surface;

	public List<Surface> getSurfacelist() {
		return Surfacelist;
	}

	public void setSurfacelist(List<Surface> surfacelist) {
		Surfacelist = surfacelist;
	}

	public Surface getSurface() {
		return surface;
	}

	public void setSurface(Surface surface) {
		this.surface = surface;
	}
	// 輔料

	private List<SubMat> SubMatlist;
	private SubMat subMat;

	public List<SubMat> getSubMatlist() {
		return SubMatlist;
	}

	public void setSubMatlist(List<SubMat> subMatlist) {
		SubMatlist = subMatlist;
	}

	public SubMat getSubMat() {
		return subMat;
	}

	public void setSubMat(SubMat subMat) {
		this.subMat = subMat;
	}

	public String FmainList() {
		return "list";

	}

	public String fmainFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		JobList = fmainService.findLike1(Internal_PN);
		HoleList = fmainService.findLike2(Internal_PN);
		Plattinglist = fmainService.findLike3(Internal_PN);
		//Impedancelist =fmainService.findLike4(Cus_FPC_PN);
		Signallist = fmainService.findLike5(Internal_PN);
				Dielist = 	fmainService.findLike6(Internal_PN);
						Inklist = fmainService.findLike7(Internal_PN);
		Silklist = fmainService.findLike8(Internal_PN);
		Surfacelist = fmainService.findLike9(Internal_PN);
		SubMatlist = fmainService.findLike10(Internal_PN);
		
		if (JobList != null) {
			job = JobList.get(0);

		}
		

		

		return "findByLike2";
	}

}
