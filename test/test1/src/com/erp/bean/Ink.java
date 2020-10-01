package com.erp.bean;

public class Ink {
	private Integer id;

	private String Internal_PN;

	private String Layer_Name;

	private String Min_Brige_Width;

	private String SM_Colour;

	private String Input_User;

	private String Input_User_CN;

	private String Date_Time;
	
	private String Status;
	
	private String Job;
	
	
	
	

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}
////////////////////////
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

	public String getMin_Brige_Width() {
		return Min_Brige_Width;
	}

	public void setMin_Brige_Width(String min_Brige_Width) {
		Min_Brige_Width = min_Brige_Width;
	}

	public String getSM_Colour() {
		return SM_Colour;
	}

	public void setSM_Colour(String sM_Colour) {
		SM_Colour = sM_Colour;
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
		return "Ink [id=" + id + ", Internal_PN=" + Internal_PN + ", Layer_Name=" + Layer_Name + ", Min_Brige_Width="
				+ Min_Brige_Width + ", SM_Colour=" + SM_Colour + ", Input_User=" + Input_User + ", Input_User_CN="
				+ Input_User_CN + ", Date_Time=" + Date_Time + ", Status=" + Status + "]";
	}

	
	
	
}
