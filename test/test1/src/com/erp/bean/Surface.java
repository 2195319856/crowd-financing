package com.erp.bean;


public class Surface {

	private Integer id;

	private String Internal_PN;
	private String Layer_Name;
	private String Soft_Gold_Area;
	private String Hold_Gold_Area;
	private String ENIG_Area;
	private String ENEPIG_Area;
	private String Tin_Area;
	private String Surface_Mode;
	private String OSP;
	
	
	private String Input_User;
	private String Input_User_CN;
	private String Date_Time;	
	private String Status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInternal_PN() {
		return Internal_PN;
	}
	public void setInternal_PN(String internal_PN) {
		Internal_PN = internal_PN;
	}
	public String getLayer_Name() {
		return Layer_Name;
	}
	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}
	public String getSoft_Gold_Area() {
		return Soft_Gold_Area;
	}
	public void setSoft_Gold_Area(String soft_Gold_Area) {
		Soft_Gold_Area = soft_Gold_Area;
	}
	public String getHold_Gold_Area() {
		return Hold_Gold_Area;
	}
	public void setHold_Gold_Area(String hold_Gold_Area) {
		Hold_Gold_Area = hold_Gold_Area;
	}
	public String getENIG_Area() {
		return ENIG_Area;
	}
	public void setENIG_Area(String eNIG_Area) {
		ENIG_Area = eNIG_Area;
	}
	public String getENEPIG_Area() {
		return ENEPIG_Area;
	}
	public void setENEPIG_Area(String eNEPIG_Area) {
		ENEPIG_Area = eNEPIG_Area;
	}
	public String getTin_Area() {
		return Tin_Area;
	}
	public void setTin_Area(String tin_Area) {
		Tin_Area = tin_Area;
	}
	public String getSurface_Mode() {
		return Surface_Mode;
	}
	public void setSurface_Mode(String surface_Mode) {
		Surface_Mode = surface_Mode;
	}
	public String getOSP() {
		return OSP;
	}
	public void setOSP(String oSP) {
		OSP = oSP;
	}
	public String getInput_User() {
		return Input_User;
	}
	public void setInput_User(String input_User) {
		Input_User = input_User;
	}
	public String getInput_User_CN() {
		return Input_User_CN;
	}
	public void setInput_User_CN(String input_User_CN) {
		Input_User_CN = input_User_CN;
	}
	public String getDate_Time() {
		return Date_Time;
	}
	public void setDate_Time(String date_Time) {
		Date_Time = date_Time;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Surface [id=" + id + ", Internal_PN=" + Internal_PN + ", Layer_Name=" + Layer_Name + ", Soft_Gold_Area="
				+ Soft_Gold_Area + ", Hold_Gold_Area=" + Hold_Gold_Area + ", ENIG_Area=" + ENIG_Area + ", ENEPIG_Area="
				+ ENEPIG_Area + ", Tin_Area=" + Tin_Area + ", Surface_Mode=" + Surface_Mode + ", OSP=" + OSP
				+ ", Input_User=" + Input_User + ", Input_User_CN=" + Input_User_CN + ", Date_Time=" + Date_Time
				+ ", Status=" + Status + "]";
	}
	
	
	
	
}
