package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.erp.bean.SubMat;
import com.erp.service.SubMatService;



;

public class SubMatAction {

	private SubMatService subMatService;
	private List<SubMat> SubMatlist;
     private  SubMat subMat;
	
     private String Internal_PN;
	private int id;
	public SubMatService getSubMatService() {
		return subMatService;
	}
	public void setSubMatService(SubMatService subMatService) {
		this.subMatService = subMatService;
	}
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
	private String Tooling_PN;
	private String Material_Thick;
	private String Process_Mode;

	
	
	public String getTooling_PN() {
		return Tooling_PN;
	}
	public void setTooling_PN(String tooling_PN) {
		Tooling_PN = tooling_PN;
	}
	public String getMaterial_Thick() {
		return Material_Thick;
	}
	public void setMaterial_Thick(String material_Thick) {
		Material_Thick = material_Thick;
	}
	public String getProcess_Mode() {
		return Process_Mode;
	}
	public void setProcess_Mode(String process_Mode) {
		Process_Mode = process_Mode;
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
	public String updateSubMat() throws UnsupportedEncodingException {
		String internal_PN = new String(subMat.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(subMat.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		String tooling_PN = new String(subMat.getTooling_PN().getBytes("iso8859-1"), "utf-8");
		String material_Thick = new String(subMat.getMaterial_Thick().getBytes("iso8859-1"), "utf-8");
		String process_Mode = new String(subMat.getProcess_Mode().getBytes("iso8859-1"), "utf-8");
		String material = new String(subMat.getMaterial().getBytes("iso8859-1"), "utf-8");

		String input_User = new String(subMat.getInput_User().getBytes("iso8859-1"), "utf-8");
		String status = new String(subMat.getStatus().getBytes("iso8859-1"), "utf-8");
		subMat.setInternal_PN(internal_PN);
		subMat.setLayer_Name(layer_Name);
		subMat.setTooling_PN(tooling_PN);
		subMat.setMaterial_Thick(material_Thick);
		subMat.setProcess_Mode(process_Mode);
		subMat.setMaterial(material);
		subMat.setInput_User(input_User);

		subMat.setStatus(status);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
	SubMat attribute =(SubMat)session.getAttribute("subMat");
	
		attribute.setStatus("0");
		subMatService.saveSubMat(subMat);
		subMatService.updateSubMat(attribute);
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		subMat = subMatService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("subMat", subMat);
		return "find";

	}

	/**
	 * @return
	 */
	public String SubMatList() {
		SubMatlist=subMatService.subMatlist();
		return "list";
	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String subMatFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Tooling_PN.getBytes("iso8859-1");
		byte[] bytes3 = Material_Thick.getBytes("iso8859-1");
		byte[] bytes4 = Process_Mode.getBytes("iso8859-1");

		
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Tooling_PN = new String(bytes2, "utf-8");
		String Material_Thick = new String(bytes3, "utf-8");
		String Process_Mode = new String(bytes4, "utf-8");
	
		
		SubMatlist = subMatService.findLike(Internal_PN,Layer_Name,Tooling_PN,Material_Thick,Process_Mode);

		SubMat SubMat2 = SubMatlist.get(0);
		return "findByLike";
	}
	public String subMatFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Tooling_PN.getBytes("iso8859-1");
		byte[] bytes3 = Material_Thick.getBytes("iso8859-1");
		byte[] bytes4 = Process_Mode.getBytes("iso8859-1");

		
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Tooling_PN = new String(bytes2, "utf-8");
		String Material_Thick = new String(bytes3, "utf-8");
		String Process_Mode = new String(bytes4, "utf-8");
	
		
		SubMatlist = subMatService.findLike1(Internal_PN,Layer_Name,Tooling_PN,Material_Thick,Process_Mode);

		SubMat SubMat2 = SubMatlist.get(0);
		return "findByLike1";
	}
	
	public String subMatFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");	
		String Internal_PN = new String(bytes, "utf-8");
		SubMatlist = subMatService.findLike2(Internal_PN);
		SubMat SubMat2 = SubMatlist.get(0);
		return "findByLike2";
	}

}
