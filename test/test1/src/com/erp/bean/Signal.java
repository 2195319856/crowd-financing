package com.erp.bean;

public class Signal {
	
	private Integer id;

	private String Internal_PN;

	private String Layer_Name;

	private String Cu_Thick;

	private String Process_Mode;

	private String Film_Type;
	private String Min_LW_Cus;
	private String Min_SP_Cus;
	private String Min_LW_Comp;
	private String Min_SP_Comp;
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


	public String getFilm_Type() {
		return Film_Type;
	}


	public void setFilm_Type(String film_Type) {
		Film_Type = film_Type;
	}


	public String getMin_LW_Cus() {
		return Min_LW_Cus;
	}


	public void setMin_LW_Cus(String min_LW_Cus) {
		Min_LW_Cus = min_LW_Cus;
	}


	public String getMin_SP_Cus() {
		return Min_SP_Cus;
	}


	public void setMin_SP_Cus(String min_SP_Cus) {
		Min_SP_Cus = min_SP_Cus;
	}


	public String getMin_LW_Comp() {
		return Min_LW_Comp;
	}


	public void setMin_LW_Comp(String min_LW_Comp) {
		Min_LW_Comp = min_LW_Comp;
	}


	public String getMin_SP_Comp() {
		return Min_SP_Comp;
	}


	public void setMin_SP_Comp(String min_SP_Comp) {
		Min_SP_Comp = min_SP_Comp;
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
		return "Signal [id=" + id + ", Internal_PN=" + Internal_PN + ", Layer_Name=" + Layer_Name + ", Cu_Thick="
				+ Cu_Thick + ", Process_Mode=" + Process_Mode + ", Film_Type=" + Film_Type + ", Min_LW_Cus="
				+ Min_LW_Cus + ", Min_SP_Cus=" + Min_SP_Cus + ", Min_LW_Comp=" + Min_LW_Comp + ", Min_SP_Comp="
				+ Min_SP_Comp + ", Input_User=" + Input_User + ", Input_User_CN=" + Input_User_CN + ", Date_Time="
				+ Date_Time + ", Status=" + Status + "]";
	}

	
	
	

}
