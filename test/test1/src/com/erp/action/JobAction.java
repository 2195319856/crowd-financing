package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Job;
import com.erp.bean.SubMat;
import com.erp.service.JobService;
import com.opensymphony.xwork2.ActionSupport;

public class JobAction extends ActionSupport {

	private JobService jobService;
	private List<Job> Joblist;
	private Job job;
	private int id;
	private String Internal_PN;
	
	private String Layer_Num;
    private String Stack_Up;
    
    
	
	
	

	public String getLayer_Num() {
		return Layer_Num;
	}

	public void setLayer_Num(String layer_Num) {
		Layer_Num = layer_Num;
	}

	public String getStack_Up() {
		return Stack_Up;
	}

	public void setStack_Up(String stack_Up) {
		Stack_Up = stack_Up;
	}

	public JobService getJobService() {
		return jobService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	public List<Job> getJoblist() {
		return Joblist;
	}

	public void setJoblist(List<Job> joblist) {
		Joblist = joblist;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInternal_PN() {
		return Internal_PN;
	}

	public void setInternal_PN(String internal_PN) {
		Internal_PN = internal_PN;
	}

	/**
	 * 
	 * 查询所有
	 * 
	 * @return
	 */
	public String JobList() {
		Joblist = jobService.joblist();
		return "list";

	}

	/**
	 * 修改
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String updateJob() throws UnsupportedEncodingException {
		String internal_PN = new String(job.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Num = new String(job.getLayer_Num().getBytes("iso8859-1"), "utf-8");
		String stack_Up = new String(job.getStack_Up().getBytes("iso8859-1"), "utf-8");
		String utilization = new String(job.getUtilization().getBytes("iso8859-1"), "utf-8");
		String sub_Size_X = new String(job.getSub_Size_X().getBytes("iso8859-1"), "utf-8");
		String sub_Size_Y = new String(job.getSub_Size_Y().getBytes("iso8859-1"), "utf-8");
		String sub_Up = new String(job.getSub_Up().getBytes("iso8859-1"), "utf-8");
		String pNL_Size_X = new String(job.getPNL_Size_X().getBytes("iso8859-1"), "utf-8");
		String pNL_Size_Y = new String(job.getPNL_Size_Y().getBytes("iso8859-1"), "utf-8");
		String pNL_Up = new String(job.getPNL_Up().getBytes("iso8859-1"), "utf-8");
		String date_Fmat = new String(job.getDate_Fmat().getBytes("iso8859-1"), "utf-8");
		String internal_Level = new String(job.getInternal_Level().getBytes("iso8859-1"), "utf-8");
		String eMI = new String(job.getEMI().getBytes("iso8859-1"), "utf-8");
		String hot_Bar = new String(job.getHot_Bar().getBytes("iso8859-1"), "utf-8");
		String zIF = new String(job.getZIF().getBytes("iso8859-1"), "utf-8");
		String wB = new String(job.getWB().getBytes("iso8859-1"), "utf-8");
		String honeycomb = new String(job.getHoneycomb().getBytes("iso8859-1"), "utf-8");
		String comp_0201 = new String(job.getComp_0201().getBytes("iso8859-1"), "utf-8");
		String comp_01005 = new String(job.getComp_01005().getBytes("iso8859-1"), "utf-8");
		String bGA_Pitch = new String(job.getBGA_Pitch().getBytes("iso8859-1"), "utf-8");
		String dCR = new String(job.getDCR().getBytes("iso8859-1"), "utf-8");
		String impedance = new String(job.getImpedance().getBytes("iso8859-1"), "utf-8");
		String loss = new String(job.getLoss().getBytes("iso8859-1"), "utf-8");
		String eT_Type = new String(job.getET_Type().getBytes("iso8859-1"), "utf-8");
		String sTIFF_ET = new String(job.getSTIFF_ET().getBytes("iso8859-1"), "utf-8");
		String nPI = new String(job.getNPI().getBytes("iso8859-1"), "utf-8");
		String mI_ENG = new String(job.getMI_ENG().getBytes("iso8859-1"), "utf-8");
		String cAM_ENG = new String(job.getCAM_ENG().getBytes("iso8859-1"), "utf-8");
		String mI_TEL = new String(job.getMI_TEL().getBytes("iso8859-1"), "utf-8");
		String cAM_TEL = new String(job.getCAM_TEL().getBytes("iso8859-1"), "utf-8");
		String input_User = new String(job.getInput_User().getBytes("iso8859-1"), "utf-8");
		String date_Time = new String(job.getDate_Time().getBytes("iso8859-1"), "utf-8");
		String status = new String(job.getStatus().getBytes("iso8859-1"), "utf-8");
		job.setInternal_PN(internal_PN);
		job.setLayer_Num(layer_Num);
		job.setStack_Up(stack_Up);
		job.setUtilization(utilization);
		job.setSub_Size_X(sub_Size_X);
		job.setSub_Size_Y(sub_Size_Y);
		job.setSub_Up(sub_Up);
		job.setPNL_Size_X(pNL_Size_X);
		job.setPNL_Size_Y(pNL_Size_Y);
		job.setPNL_Up(pNL_Up);
		job.setDate_Fmat(date_Fmat);
		job.setInternal_Level(internal_Level);
		job.setEMI(eMI);
		job.setHot_Bar(hot_Bar);
		job.setZIF(zIF);
		job.setWB(wB);
		job.setHoneycomb(honeycomb);
		job.setComp_0201(comp_0201);
		job.setComp_01005(comp_01005);
		job.setBGA_Pitch(bGA_Pitch);
		job.setDCR(dCR);
		job.setImpedance(impedance);
		job.setLoss(loss);
		job.setET_Type(eT_Type);
		job.setSTIFF_ET(sTIFF_ET);
		job.setNPI(nPI);
		job.setMI_TEL(mI_TEL);
		job.setCAM_TEL(cAM_TEL);
		job.setInput_User(input_User);
		job.setDate_Time(date_Time);
		job.setStatus(status);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
	Job attribute =(Job)session.getAttribute("job");
	
		attribute.setStatus("0");
		jobService.saveJob(job);
		jobService.updateJob(attribute);
		
		jobService.updateJob(job);

		return "update";
	}

	/*
	 * 
	 * 根据id查找
	 */
	public String find() {
		job = jobService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("job", job);
		return "find";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String jobFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Num.getBytes("iso8859-1");
		byte[] bytes2 = Stack_Up.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Num = new String(bytes1, "utf-8");
		String Stack_Up = new String(bytes2, "utf-8");
		Joblist = jobService.findLike(Internal_PN,Layer_Num,Stack_Up);
		Job Job2 = Joblist.get(0);
		return "findByLike";
	}
	
	public String jobFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Num.getBytes("iso8859-1");
		byte[] bytes2 = Stack_Up.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Num = new String(bytes1, "utf-8");
		String Stack_Up = new String(bytes2, "utf-8");
		Joblist = jobService.findLike1(Internal_PN,Layer_Num,Stack_Up);
		Job Job2 = Joblist.get(0);
		return "findByLike1";
	}


	public String jobFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		Joblist = jobService.findLike2(Internal_PN);
		Job Job2 = Joblist.get(0);
		return "findByLike2";
	}
	
	

}
