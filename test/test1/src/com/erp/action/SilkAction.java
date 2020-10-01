package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Silk;
import com.erp.bean.SubMat;
import com.erp.service.SilkService;


public class SilkAction {
	private SilkService silkService;
	private List<Silk> Silklist;
	private Silk silk;
	private String Internal_PN;
	private int id;
	
	

	public SilkService getSilkService() {
		return silkService;
	}
	public void setSilkService(SilkService silkService) {
		this.silkService = silkService;
	}
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
	
	private String Layer_Name;
	
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
	public String updateSilk() throws UnsupportedEncodingException {
		String internal_PN = new String(silk.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(silk.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		String text_Min_Height = new String(silk.getText_Min_Height().getBytes("iso8859-1"), "utf-8");
		String text_MIN_Width = new String(silk.getText_MIN_Width().getBytes("iso8859-1"), "utf-8");
		String line_Min_Width = new String(silk.getLine_Min_Width().getBytes("iso8859-1"), "utf-8");
		String sM_Colour = new String(silk.getSM_Colour().getBytes("iso8859-1"), "utf-8");
		
		
		
		String input_User = new String(silk.getInput_User().getBytes("iso8859-1"), "utf-8");
		String status = new String(silk.getStatus().getBytes("iso8859-1"), "utf-8");
		silk.setInternal_PN(internal_PN);
		silk.setLayer_Name(layer_Name);
		silk.setText_Min_Height(text_Min_Height);
		silk.setText_MIN_Width(text_MIN_Width);
		silk.setLine_Min_Width(line_Min_Width);
		silk.setSM_Colour(sM_Colour);
		
		silk.setInput_User(input_User);
		silk.setStatus(status);

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Silk attribute =(Silk)session.getAttribute("silk");
	
		attribute.setStatus("0");
		silkService.saveSilk(silk);
		silkService.updateSilk(attribute);
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		silk = silkService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("silk", silk);
		return "find";

	}

	/**
	 * @return
	 */
	public String SilkList() {
		Silklist = silkService.silklist();
		return "list";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String silkFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Silklist = silkService.findLike(Internal_PN,Layer_Name);

		Silk Silk2 = Silklist.get(0);
		return "findByLike";
	}

	public String silkFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Silklist = silkService.findLike1(Internal_PN,Layer_Name);

		Silk Silk2 = Silklist.get(0);
		return "findByLike1";
	}

	public String silkFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");	
		Silklist = silkService.findLike2(Internal_PN);

		Silk Silk2 = Silklist.get(0);
		return "findByLike2";
	}

	
	
	
	
	
}
