package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Hole;
import com.erp.bean.SubMat;
import com.erp.service.HoleService;
import com.opensymphony.xwork2.ActionSupport;


public class HoleAction extends ActionSupport {

	private HoleService holeService;
	private List<Hole> Holelist;
	private Hole hole;
	private int id;
	private String Internal_PN;
	
	private String Layer_Name;


	public String getLayer_Name() {
		return Layer_Name;
	}

	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}

	

	//5sdsdksdjsjdsajdsadjlak
	public HoleService getHoleService() {
		return holeService;
	}

	public void setHoleService(HoleService holeService) {
		this.holeService = holeService;
	}

	public List<Hole> getHolelist() {
		return Holelist;
	}

	public void setHolelist(List<Hole> holelist) {
		Holelist = holelist;
	}

	public Hole getHole() {
		return hole;
	}

	public void setHole(Hole hole) {
		this.hole = hole;
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

	/*
	 * 
	 * 根据id查找
	 */
	public String find() {
		hole = holeService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("hole", hole);
		return "find";

	}
	/**
	 * 
	 * 查询所有商品
	 * 
	 * @return
	 */
	public String HoleList() {
		Holelist = holeService.holelist();
		return "list";

	}

	public String holeFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Holelist = holeService.findLike(Internal_PN,Layer_Name);
		Hole Hole2 = Holelist.get(0);
		return "findByLike";
	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String holeFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Holelist = holeService.findLike1(Internal_PN,Layer_Name);
		Hole Hole2 = Holelist.get(0);
		return "findByLike1";
	}

	public String holeFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		Holelist = holeService.findLike2(Internal_PN);
		Hole Hole2 = Holelist.get(0);
		return "findByLike2";
	}

	/**
	 * 修改
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String updateHole() throws UnsupportedEncodingException {
		String internal_PN = new String(hole.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(hole.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		
		String hole_Size = new String(hole.getHole_Size().getBytes("iso8859-1"), "utf-8");
		String hole_Count = new String(hole.getHole_Count().getBytes("iso8859-1"), "utf-8");
		String hole_Type = new String(hole.getHole_Type().getBytes("iso8859-1"), "utf-8");
		String via_Type = new String(hole.getVia_Type().getBytes("iso8859-1"), "utf-8");
		String cross_ADH = new String(hole.getCross_ADH().getBytes("iso8859-1"), "utf-8");
		String hole_Depth = new String(hole.getHole_Depth().getBytes("iso8859-1"), "utf-8");
		String aspect_Ratio = new String(hole.getAspect_Ratio().getBytes("iso8859-1"), "utf-8");
		String input_User = new String(hole.getInput_User().getBytes("iso8859-1"), "utf-8");
		String date_Time = new String(hole.getDate_Time().getBytes("iso8859-1"), "utf-8");
		String status = new String(hole.getStatus().getBytes("iso8859-1"), "utf-8");
		hole.setInternal_PN(internal_PN);
		hole.setLayer_Name(layer_Name);
		hole.setHole_Size(hole_Size);
		hole.setHole_Count(hole_Count);
		hole.setHole_Type(hole_Type);
		hole.setVia_Type(via_Type);
		hole.setCross_ADH(cross_ADH);
		hole.setHole_Depth(hole_Depth);
		hole.setAspect_Ratio(aspect_Ratio);
		hole.setInput_User(input_User);
		hole.setDate_Time(date_Time);
		hole.setStatus(status);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
	Hole attribute =(Hole)session.getAttribute("hole");
	
		attribute.setStatus("0");
		holeService.saveHole(hole);
		holeService.updateHole(attribute);
	

		return "update";
	}

	

	

}
