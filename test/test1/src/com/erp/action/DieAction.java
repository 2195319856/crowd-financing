package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Die;
import com.erp.bean.SubMat;
import com.erp.service.DieService;



public class DieAction {

	private DieService dieService;
	private List<Die> Dielist;
	private Die die;

	private String Internal_PN;

	private int id;

	private String Layer_Name;
	private String Tooling_PN;
	private String Tool_Type;
	
	
	
	
	public String getLayer_Name() {
		return Layer_Name;
	}

	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}

	public String getTooling_PN() {
		return Tooling_PN;
	}

	public void setTooling_PN(String tooling_PN) {
		Tooling_PN = tooling_PN;
	}

	public String getTool_Type() {
		return Tool_Type;
	}

	public void setTool_Type(String tool_Type) {
		Tool_Type = tool_Type;
	}

	public DieService getDieService() {
		return dieService;
	}

	public void setDieService(DieService dieService) {
		this.dieService = dieService;
	}

	public List<Die> getDielist() {
		return Dielist;
	}

	public void setDielist(List<Die> dielist) {
		Dielist = dielist;
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
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
	public String updateDie() throws UnsupportedEncodingException {
		String internal_PN = new String(die.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(die.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		String tooling_PN = new String(die.getTooling_PN().getBytes("iso8859-1"), "utf-8");
		String tool_Type = new String(die.getTool_Type().getBytes("iso8859-1"), "utf-8");
		String material_Width = new String(die.getMaterial_Width().getBytes("iso8859-1"), "utf-8");
		String material_Length = new String(die.getMaterial_Length().getBytes("iso8859-1"), "utf-8");
		String pIN_Count = new String(die.getPIN_Count().getBytes("iso8859-1"), "utf-8");
		String pIN_Size = new String(die.getPIN_Size().getBytes("iso8859-1"), "utf-8");
		String punch_Cycle = new String(die.getPunch_Cycle().getBytes("iso8859-1"), "utf-8");
		String scale_X = new String(die.getScale_X().getBytes("iso8859-1"), "utf-8");
		String scale_Y = new String(die.getScale_Y().getBytes("iso8859-1"), "utf-8");
		String line_Totle = new String(die.getLine_Totle().getBytes("iso8859-1"), "utf-8");
		String hole_Totle = new String(die.getHole_Totle().getBytes("iso8859-1"), "utf-8");
		String material_Thick = new String(die.getMaterial_Thick().getBytes("iso8859-1"), "utf-8");
		String material = new String(die.getMaterial().getBytes("iso8859-1"), "utf-8");
		String mirror = new String(die.getMirror().getBytes("iso8859-1"), "utf-8");
		String input_User = new String(die.getInput_User().getBytes("iso8859-1"), "utf-8");
		String status = new String(die.getStatus().getBytes("iso8859-1"), "utf-8");
		die.setInternal_PN(internal_PN);
		die.setLayer_Name(layer_Name);
		die.setTooling_PN(tooling_PN);
		die.setTool_Type(tool_Type);
		die.setMaterial_Width(material_Width);
		die.setMaterial_Length(material_Length);
		die.setPIN_Count(pIN_Count);
		die.setPIN_Size(pIN_Size);
		die.setPunch_Cycle(punch_Cycle);
		die.setScale_X(scale_X);
		die.setScale_Y(scale_Y);
		die.setLine_Totle(line_Totle);
		die.setHole_Totle(hole_Totle);
		die.setMaterial_Thick(material_Thick);
		die.setMaterial(material);
		die.setInput_User(input_User);
		die.setStatus(status);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
	Die attribute =(Die)session.getAttribute("die");
	
		attribute.setStatus("0");
	dieService.saveDie(die);
		dieService.updateDie(attribute);
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		die = dieService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("die", die);
		return "find";

	}

	/**
	 * @return
	 */
	public String DieList() {
		Dielist = dieService.dielist();
		return "list";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String dieFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Tooling_PN.getBytes("iso8859-1");
		byte[] bytes3 = Tool_Type.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Tooling_PN = new String(bytes2, "utf-8");
		String Tool_Type = new String(bytes3, "utf-8");
		Dielist = dieService.findLike(Internal_PN,Layer_Name,Tooling_PN,Tool_Type);

		Die die2 = Dielist.get(0);
		return "findByLike";
	}
	public String dieFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		byte[] bytes2 = Tooling_PN.getBytes("iso8859-1");
		byte[] bytes3 = Tool_Type.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		String Tooling_PN = new String(bytes2, "utf-8");
		String Tool_Type = new String(bytes3, "utf-8");
		Dielist = dieService.findLike1(Internal_PN,Layer_Name,Tooling_PN,Tool_Type);

		Die die2 = Dielist.get(0);
		return "findByLike1";
	}
	public String dieFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		Dielist = dieService.findLike2(Internal_PN);

		Die die2 = Dielist.get(0);
		return "findByLike2";
	}

	
}
