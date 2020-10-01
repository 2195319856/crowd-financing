package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Platting;
import com.erp.bean.SubMat;
import com.erp.service.PlattingService;
import com.opensymphony.xwork2.ActionSupport;

public class PlattingAction extends ActionSupport {
	private PlattingService plattingService;
	private List<Platting> Plattinglist;
	private Platting platting;
	private String Internal_PN;
	private int id;

	private String Layer_Name;
	
	public String getLayer_Name() {
		return Layer_Name;
	}

	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}

	public PlattingService getPlattingService() {
		return plattingService;
	}

	public void setPlattingService(PlattingService plattingService) {
		this.plattingService = plattingService;
	}

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

	public String getInternal_PN() {
		return Internal_PN;
	}

	public void setInternal_PN(String internal_PN) {
		Internal_PN = internal_PN;
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
	public String updatePlatting() throws UnsupportedEncodingException {
		String internal_PN = new String(platting.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(platting.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		String plating_Area = new String(platting.getPlating_Area().getBytes("iso8859-1"), "utf-8");
		String plating_Type = new String(platting.getPlating_Type().getBytes("iso8859-1"), "utf-8");
		String plating_2ND = new String(platting.getPlating_2ND().getBytes("iso8859-1"), "utf-8");
		String input_User = new String(platting.getInput_User().getBytes("iso8859-1"), "utf-8");
		String status = new String(platting.getStatus().getBytes("iso8859-1"), "utf-8");
		platting.setInternal_PN(internal_PN);
		platting.setLayer_Name(layer_Name);
		platting.setPlating_Area(plating_Area);
		platting.setPlating_Type(plating_Type);
		platting.setPlating_2ND(plating_2ND);
		platting.setInput_User(input_User);
		platting.setStatus(status);

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Platting attribute =(Platting)session.getAttribute("platting");
	
		attribute.setStatus("0");
		plattingService.savePlatting(platting);
		plattingService.updatePlatting(attribute);
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		platting = plattingService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("platting", platting);
		return "find";

	}

	/**
	 * @return
	 */
	public String PlattingList() {
		Plattinglist = plattingService.plattinglist();
		return "list";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String plattingFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Plattinglist = plattingService.findLike(Internal_PN,Layer_Name);

		Platting Platting2 = Plattinglist.get(0);
		return "findByLike";
	}

	public String plattingFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Plattinglist = plattingService.findLike(Internal_PN,Layer_Name);

		Platting Platting2 = Plattinglist.get(0);
		return "findByLike1";
	}

	public String plattingFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
	
		String Internal_PN = new String(bytes, "utf-8");
		
		Plattinglist = plattingService.findLike2(Internal_PN);

		Platting Platting2 = Plattinglist.get(0);
		return "findByLike2";
	}

}


