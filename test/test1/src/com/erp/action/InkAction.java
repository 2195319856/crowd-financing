package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Ink;
import com.erp.service.InkService;
import com.opensymphony.xwork2.ActionSupport;

public class InkAction extends ActionSupport{
	
	private InkService inkService;
	private List<Ink> Inklist;
	private Ink ink;

	private String Internal_PN;

	private int id;
	private String Layer_Name;
	

	

	public InkService getInkService() {
		return inkService;
	}

	public void setInkService(InkService inkService) {
		this.inkService = inkService;
	}

	public List<Ink> getInklist() {
		return Inklist;
	}

	public void setInklist(List<Ink> inklist) {
		Inklist = inklist;
	}

	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
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

	public String getLayer_Name() {
		return Layer_Name;
	}

	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}

	/**
	 * update
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String updateInk() throws UnsupportedEncodingException {
		String internal_PN = new String(ink.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(ink.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		String min_Brige_Width = new String(ink.getMin_Brige_Width().getBytes("iso8859-1"), "utf-8");
		String sM_Colour = new String(ink.getSM_Colour().getBytes("iso8859-1"), "utf-8");
		String input_User = new String(ink.getInput_User().getBytes("iso8859-1"), "utf-8");
		String status = new String(ink.getStatus().getBytes("iso8859-1"), "utf-8");
		ink.setInternal_PN(internal_PN);
		ink.setLayer_Name(layer_Name);
		ink.setMin_Brige_Width(min_Brige_Width);
		ink.setSM_Colour(sM_Colour);
		ink.setInput_User(input_User);
		ink.setStatus(status);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Ink attribute = (Ink) session.getAttribute("ink");
		attribute.setStatus("0");
		inkService.updateInk(attribute);
		inkService.saveInk(ink);
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		ink = inkService.findByid(id);
		  HttpServletRequest request = ServletActionContext.getRequest();
		  request.getSession().setAttribute("ink", ink);
		return "find";

	}

	/**
	 * @return
	 */
	public String InkList() {
	Inklist=inkService.inklist();
		return "list";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String inkFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1= Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Inklist = inkService.findLike(Internal_PN,Layer_Name);
		Ink Ink2 = Inklist.get(0);
		return "findByLike";
	}
	
	public String inkFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1= Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Inklist = inkService.findLike1(Internal_PN,Layer_Name);
		Ink Ink2 = Inklist.get(0);
		return "findByLike1";
	}
	
	public String inkFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		Inklist = inkService.findLike2(Internal_PN);
		Ink Ink2 = Inklist.get(0);
		return "findByLike2";
	}

	




}
