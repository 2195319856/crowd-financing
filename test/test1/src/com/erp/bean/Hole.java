package com.erp.bean;

import java.util.Date;

public class Hole {

	private Integer id;

	private String Internal_PN;

	private String Layer_Name;

	private String Hole_Size;

	private String Hole_Count;

	private String Hole_Type;

	private String Via_Type;

	private String Cross_ADH;

	private String Hole_Depth;

	private String Aspect_Ratio;

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



	public String getHole_Size() {
		return Hole_Size;
	}

	public void setHole_Size(String hole_Size) {
		Hole_Size = hole_Size;
	}

	public String getHole_Count() {
		return Hole_Count;
	}

	public void setHole_Count(String hole_Count) {
		Hole_Count = hole_Count;
	}

	public String getHole_Type() {
		return Hole_Type;
	}

	public void setHole_Type(String hole_Type) {
		Hole_Type = hole_Type;
	}

	public String getVia_Type() {
		return Via_Type;
	}

	public void setVia_Type(String via_Type) {
		Via_Type = via_Type;
	}

	public String getCross_ADH() {
		return Cross_ADH;
	}

	public void setCross_ADH(String cross_ADH) {
		Cross_ADH = cross_ADH;
	}

	public String getHole_Depth() {
		return Hole_Depth;
	}

	public void setHole_Depth(String hole_Depth) {
		Hole_Depth = hole_Depth;
	}

	public String getAspect_Ratio() {
		return Aspect_Ratio;
	}

	public void setAspect_Ratio(String aspect_Ratio) {
		Aspect_Ratio = aspect_Ratio;
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
		return "Hole [id=" + id + ", Internal_PN=" + Internal_PN + ", Layer_Name=" + Layer_Name + ", Hole_Size="
				+ Hole_Size + ", Hole_Count=" + Hole_Count + ", Hole_Type=" + Hole_Type + ", Via_Type=" + Via_Type
				+ ", Cross_ADH=" + Cross_ADH + ", Hole_Depth=" + Hole_Depth + ", Aspect_Ratio=" + Aspect_Ratio
				+ ", Input_User=" + Input_User + ", Input_User_CN=" + Input_User_CN + ", Date_Time=" + Date_Time
				+ ", Status=" + Status + "]";
	}

	
	


}
