package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Signal;
import com.erp.bean.SubMat;
import com.erp.service.SignalService;



public class SignalAction {
	
	private SignalService signalService;
	private List<Signal> Signallist;
	private Signal signal;
	private String Internal_PN;
	private int id;
	
	
	
	private String Layer_Name;
	private String Cu_Thick;
	private String Process_Mode;
	
	
	public String getLayer_Name() {
		return Layer_Name;
	}

	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}

	public String getCu_Thick() {
		return Cu_Thick;
	}

	public void setCu_Thick(String cu_Thick) {
		Cu_Thick = cu_Thick;
	}

	public String getProcess_Mode() {
		return Process_Mode;
	}

	public void setProcess_Mode(String process_Mode) {
		Process_Mode = process_Mode;
	}

	public SignalService getSignalService() {
		return signalService;
	}

	public void setSignalService(SignalService signalService) {
		this.signalService = signalService;
	}

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

	public String updateSignal() throws UnsupportedEncodingException {
		String internal_PN = new String(signal.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(signal.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		String cu_Thick = new String(signal.getCu_Thick().getBytes("iso8859-1"), "utf-8");
		String process_Mode = new String(signal.getProcess_Mode().getBytes("iso8859-1"), "utf-8");
		String film_Type = new String(signal.getFilm_Type().getBytes("iso8859-1"), "utf-8");
		String min_LW_Cus = new String(signal.getMin_LW_Cus().getBytes("iso8859-1"), "utf-8");
		String min_SP_Cus = new String(signal.getMin_SP_Cus().getBytes("iso8859-1"), "utf-8");
		String min_LW_Comp = new String(signal.getMin_LW_Comp().getBytes("iso8859-1"), "utf-8");
		String min_SP_Comp = new String(signal.getMin_SP_Comp().getBytes("iso8859-1"), "utf-8");
	
		String input_User = new String(signal.getInput_User().getBytes("iso8859-1"), "utf-8");
		String status = new String(signal.getStatus().getBytes("iso8859-1"), "utf-8");
		signal.setInternal_PN(internal_PN);
		signal.setLayer_Name(layer_Name);
		signal.setCu_Thick(cu_Thick);
		signal.setProcess_Mode(process_Mode);
		signal.setFilm_Type(film_Type);
		signal.setMin_LW_Cus(min_LW_Cus);
		signal.setMin_SP_Cus(min_SP_Cus);
		signal.setMin_LW_Comp(min_LW_Comp);
		signal.setMin_SP_Comp(min_SP_Comp);
		
		signal.setInput_User(input_User);
		signal.setStatus(status);

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Signal attribute =(Signal)session.getAttribute("signal");
	
		attribute.setStatus("0");
		signalService.saveSignal(signal);
		signalService.updateSignal(attribute);
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		signal = signalService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("signal", signal);
		return "find";

	}

	/**
	 * @return
	 */
	public String SignalList() {
		Signallist = signalService.signallist();
		return "list";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String signalFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Cu_Thick.getBytes("iso8859-1");
		byte[] bytes3 = Process_Mode.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Cu_Thick = new String(bytes2, "utf-8");
		String Process_Mode = new String(bytes3, "utf-8");
		Signallist = signalService.findLike(Internal_PN,Layer_Name,Cu_Thick,Process_Mode);

		Signal Signal2 = Signallist.get(0);
		return "findByLike";
	}
	public String signalFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Cu_Thick.getBytes("iso8859-1");
		byte[] bytes3 = Process_Mode.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Cu_Thick = new String(bytes2, "utf-8");
		String Process_Mode = new String(bytes3, "utf-8");
		Signallist = signalService.findLike1(Internal_PN,Layer_Name,Cu_Thick,Process_Mode);

		Signal Signal2 = Signallist.get(0);
		return "findByLike1";
	}
	
	public String signalFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");		
		String Internal_PN = new String(bytes, "utf-8");
		Signallist = signalService.findLike2(Internal_PN);

		Signal Signal2 = Signallist.get(0);
		return "findByLike2";
	}

}
