package com.erp.bean;

import java.util.List;

public class SubMat {
	private Integer id;

	private String Internal_PN;
	private String Layer_Name;
	private String Tooling_PN;
	private String Material_Thick;
	private String Process_Mode;
	private String Material;

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
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
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
		return "SubMat [id=" + id + ", Internal_PN=" + Internal_PN + ", Layer_Name=" + Layer_Name + ", Tooling_PN="
				+ Tooling_PN + ", Material_Thick=" + Material_Thick + ", Process_Mode=" + Process_Mode + ", Material="
				+ Material + ", Input_User=" + Input_User + ", Input_User_CN=" + Input_User_CN + ", Date_Time="
				+ Date_Time + ", Status=" + Status + "]";
	}

	
	
	
	
	

}
