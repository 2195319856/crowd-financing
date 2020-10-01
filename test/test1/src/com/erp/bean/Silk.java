package com.erp.bean;

public class Silk {
	private Integer id;

	private String Internal_PN;
	private String Layer_Name;
	private String Text_Min_Height;
	private String Text_MIN_Width;
	private String Line_Min_Width;
	private String SM_Colour;
	
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
	public String getText_Min_Height() {
		return Text_Min_Height;
	}
	public void setText_Min_Height(String text_Min_Height) {
		Text_Min_Height = text_Min_Height;
	}
	public String getText_MIN_Width() {
		return Text_MIN_Width;
	}
	public void setText_MIN_Width(String text_MIN_Width) {
		Text_MIN_Width = text_MIN_Width;
	}
	public String getLine_Min_Width() {
		return Line_Min_Width;
	}
	public void setLine_Min_Width(String line_Min_Width) {
		Line_Min_Width = line_Min_Width;
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
		return "Silk [id=" + id + ", Internal_PN=" + Internal_PN + ", Layer_Name=" + Layer_Name + ", Text_Min_Height="
				+ Text_Min_Height + ", Text_MIN_Width=" + Text_MIN_Width + ", Line_Min_Width=" + Line_Min_Width
				+ ", SM_Colour=" + SM_Colour + ", Input_User=" + Input_User + ", Input_User_CN=" + Input_User_CN
				+ ", Date_Time=" + Date_Time + ", Status=" + Status + "]";
	}
	
	
	

}
