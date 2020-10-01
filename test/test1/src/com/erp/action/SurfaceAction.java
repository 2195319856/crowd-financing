package com.erp.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.Silk;
import com.erp.bean.SubMat;
import com.erp.bean.Surface;
import com.erp.service.SurfaceService;



public class SurfaceAction {
	
	private SurfaceService surfaceService;
	private List<Surface> Surfacelist;
	private Surface surface;

	private String Internal_PN;
	private int id;
	public SurfaceService getSurfaceService() {
		return surfaceService;
	}
	public void setSurfaceService(SurfaceService surfaceService) {
		this.surfaceService = surfaceService;
	}
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
	//
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
	public String updateSurface() throws UnsupportedEncodingException {
		String internal_PN = new String(surface.getInternal_PN().getBytes("iso8859-1"), "utf-8");
		String layer_Name = new String(surface.getLayer_Name().getBytes("iso8859-1"), "utf-8");
		String soft_Gold_Area = new String(surface.getSoft_Gold_Area().getBytes("iso8859-1"), "utf-8");
		String hold_Gold_Area = new String(surface.getHold_Gold_Area().getBytes("iso8859-1"), "utf-8");
		String eNIG_Area = new String(surface.getENIG_Area().getBytes("iso8859-1"), "utf-8");
		String eNEPIG_Area = new String(surface.getENEPIG_Area().getBytes("iso8859-1"), "utf-8");
		String tin_Area = new String(surface.getTin_Area().getBytes("iso8859-1"), "utf-8");
		String surface_Mode = new String(surface.getSurface_Mode().getBytes("iso8859-1"), "utf-8");
		String oSP = new String(surface.getOSP().getBytes("iso8859-1"), "utf-8");
		
		
		
		
		String input_User = new String(surface.getInput_User().getBytes("iso8859-1"), "utf-8");
		String status = new String(surface.getStatus().getBytes("iso8859-1"), "utf-8");
		surface.setInternal_PN(internal_PN);
		surface.setLayer_Name(layer_Name);
		surface.setSoft_Gold_Area(soft_Gold_Area);
		surface.setHold_Gold_Area(hold_Gold_Area);
		surface.setENIG_Area(eNIG_Area);
		surface.setENEPIG_Area(eNEPIG_Area);
		surface.setTin_Area(tin_Area);
		surface.setSurface_Mode(surface_Mode);
		surface.setOSP(oSP);
		
		surface.setInput_User(input_User);
		surface.setStatus(status);

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Surface attribute =(Surface)session.getAttribute("surface");
	
		attribute.setStatus("0");
		surfaceService.saveSurface(surface);
		surfaceService.updateSurface(attribute);
		return "update";
	}

	/**
	 * 查询
	 * 
	 *
	 */
	public String find() {
		surface = surfaceService.findByid(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("surface", surface);
		return "find";

	}

	/**
	 * @return
	 */
	public String SurfaceList() {
		Surfacelist = surfaceService.surfacelist();
		return "list";

	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String surfaceFindByLike() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Surfacelist = surfaceService.findLike(Internal_PN,Layer_Name);

		Surface Surface2 = Surfacelist.get(0);
		return "findByLike";
	}
	
	public String surfaceFindByLike1() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		byte[] bytes1 = Layer_Name.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		String Layer_Name = new String(bytes1, "utf-8");
		Surfacelist = surfaceService.findLike1(Internal_PN,Layer_Name);

		Surface Surface2 = Surfacelist.get(0);
		return "findByLike1";
	}
	
	public String surfaceFindByLike2() throws UnsupportedEncodingException {
		byte[] bytes = Internal_PN.getBytes("iso8859-1");
		String Internal_PN = new String(bytes, "utf-8");
		Surfacelist = surfaceService.findLike2(Internal_PN);

		Surface Surface2 = Surfacelist.get(0);
		return "findByLike2";
	}

}
