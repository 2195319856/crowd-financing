package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Impedance;
import com.erp.service.ImpedanceService;
;

public class ImpedanceAction {

	private ImpedanceService impedanceService;
	private List<Impedance> Impedancelist;
	private Impedance impedance;

	private String Cus_FPC_PN;
	private int id;
	
	
	private String Layer_Name;
	private String Imp_Mode;
	
	public String getLayer_Name() {
		return Layer_Name;
	}

	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}

	public String getImp_Mode() {
		return Imp_Mode;
	}

	public void setImp_Mode(String imp_Mode) {
		Imp_Mode = imp_Mode;
	}

	public String getCus_FPC_PN() {
		return Cus_FPC_PN;
	}

	public void setCus_FPC_PN(String cus_FPC_PN) {
		Cus_FPC_PN = cus_FPC_PN;
	}

	public ImpedanceService getImpedanceService() {
		return impedanceService;
	}

	public void setImpedanceService(ImpedanceService impedanceService) {
		this.impedanceService = impedanceService;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * update
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String updateImpedance() throws UnsupportedEncodingException {
		    String cus_FPC_PN = new String(impedance.getCus_FPC_PN().getBytes("iso8859-1"), "utf-8");
		    String layer_Name = new String(impedance.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		    String imp_Mode = new String(impedance.getImp_Mode().getBytes("iso8859-1"), "utf-8");
		    String lW_Customer = new String(impedance.getLW_Customer().getBytes("iso8859-1"), "utf-8");
		    String sP_Customer = new String(impedance.getSP_Customer().getBytes("iso8859-1"), "utf-8");
		    String lW_Recommend = new String(impedance.getLW_Recommend().getBytes("iso8859-1"), "utf-8");
		    String sP_Recommend = new String(impedance.getSP_Recommend().getBytes("iso8859-1"), "utf-8");
		    String lW_Adjust = new String(impedance.getLW_Adjust().getBytes("iso8859-1"), "utf-8");
		    String sP_Adjust = new String(impedance.getSP_Adjust().getBytes("iso8859-1"), "utf-8");
		    String resistance = new String(impedance.getResistance().getBytes("iso8859-1"), "utf-8");
		    String ref_Layer = new String(impedance.getRef_Layer().getBytes("iso8859-1"), "utf-8");
		    String ref_Hatch = new String(impedance.getRef_Hatch().getBytes("iso8859-1"), "utf-8");
		    String lW_Hatch = new String(impedance.getLW_Hatch().getBytes("iso8859-1"), "utf-8");
		    String sP_Hatch = new String(impedance.getSP_Hatch().getBytes("iso8859-1"), "utf-8");
		    String input_User = new String(impedance.getInput_User().getBytes("iso8859-1"), "utf-8");
		    String date_Time = new String(impedance.getDate_Time().getBytes("iso8859-1"), "utf-8");
		    String status = new String(impedance.getStatus().getBytes("iso8859-1"), "utf-8");
		   impedance.setCus_FPC_PN(cus_FPC_PN);
		   impedance.setLayer_Name(layer_Name);
		   impedance.setImp_Mode(imp_Mode);
		   impedance.setLW_Customer(lW_Customer);
		   impedance.setSP_Customer(sP_Customer);
		   impedance.setLW_Recommend(lW_Recommend);
		   impedance.setSP_Recommend(sP_Recommend);
		   impedance.setLW_Adjust(lW_Adjust);
		   impedance.setSP_Adjust(sP_Adjust);
		   impedance.setResistance(resistance);
		   impedance.setRef_Layer(ref_Layer);
		   impedance.setRef_Hatch(ref_Hatch);
		   impedance.setInput_User(input_User);
		   impedance.setDate_Time(date_Time);
		   impedance.setStatus(status);

		   HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			Impedance attribute =(Impedance)session.getAttribute("impedance");
		
			attribute.setStatus("0");
			impedanceService.saveImpedance(impedance);
			impedanceService.updateImpedance(attribute);
		
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		impedance = impedanceService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("impedance", impedance);
		return "find";

	}

	/**
	 * @return
	 */
	public String ImpedanceList() {
		Impedancelist =impedanceService.impedancelist();
		return "list";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */

	
	public String impedanceFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Cus_FPC_PN.getBytes("iso8859-1");
		byte[] bytes1= Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Imp_Mode.getBytes("iso8859-1");
		String Cus_FPC_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Imp_Mode = new String(bytes2, "utf-8");
		Impedancelist = impedanceService.findLike(Cus_FPC_PN,Layer_Name,Imp_Mode);
		Impedance impedance2 = Impedancelist.get(0);
		return "findByLike";
	}
	
	public String impedanceFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Cus_FPC_PN.getBytes("iso8859-1");
		byte[] bytes1= Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Imp_Mode.getBytes("iso8859-1");
		String Cus_FPC_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Imp_Mode = new String(bytes2, "utf-8");
		Impedancelist = impedanceService.findLike1(Cus_FPC_PN,Layer_Name,Imp_Mode);
		Impedance impedance2 = Impedancelist.get(0);
		return "findByLike1";
	}
	public String impedanceFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Cus_FPC_PN.getBytes("iso8859-1");
		String Cus_FPC_PN = new String(bytes, "utf-8");
		Impedancelist = impedanceService.findLike2(Cus_FPC_PN);
		Impedance impedance2 = Impedancelist.get(0);
		return "findByLike2";
	}



}
