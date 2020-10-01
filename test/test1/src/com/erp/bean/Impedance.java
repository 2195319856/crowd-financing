package com.erp.bean;

public class Impedance {

	private Integer id;

	private String Cus_FPC_PN;

	private String Layer_Name;

	private String Imp_Mode;

	private String LW_Customer;

	private String SP_Customer;

	private String LW_Recommend;
	
	private String SP_Recommend;
	
	private String LW_Adjust;
	private String SP_Adjust;	
	private String Resistance;
	private String Ref_Layer;
	private String Ref_Hatch;	
	private String LW_Hatch;	
	private String SP_Hatch;	
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


	public String getCus_FPC_PN() {
		return Cus_FPC_PN;
	}


	public void setCus_FPC_PN(String cus_FPC_PN) {
		Cus_FPC_PN = cus_FPC_PN;
	}


	public String getLayer_Name() {
		return Layer_Name;
	}


	public void setLayer_Name(String layer_Name) {
		Layer_Name = layer_Name;
	}


	public String getImp_Mode() {
		return Imp_Mode;
	}


	public void setImp_Mode(String imp_Mode) {
		Imp_Mode = imp_Mode;
	}


	public String getLW_Customer() {
		return LW_Customer;
	}


	public void setLW_Customer(String lW_Customer) {
		LW_Customer = lW_Customer;
	}


	public String getSP_Customer() {
		return SP_Customer;
	}


	public void setSP_Customer(String sP_Customer) {
		SP_Customer = sP_Customer;
	}


	public String getLW_Recommend() {
		return LW_Recommend;
	}


	public void setLW_Recommend(String lW_Recommend) {
		LW_Recommend = lW_Recommend;
	}


	public String getSP_Recommend() {
		return SP_Recommend;
	}


	public void setSP_Recommend(String sP_Recommend) {
		SP_Recommend = sP_Recommend;
	}


	public String getLW_Adjust() {
		return LW_Adjust;
	}


	public void setLW_Adjust(String lW_Adjust) {
		LW_Adjust = lW_Adjust;
	}


	public String getSP_Adjust() {
		return SP_Adjust;
	}


	public void setSP_Adjust(String sP_Adjust) {
		SP_Adjust = sP_Adjust;
	}


	public String getResistance() {
		return Resistance;
	}


	public void setResistance(String resistance) {
		Resistance = resistance;
	}


	public String getRef_Layer() {
		return Ref_Layer;
	}


	public void setRef_Layer(String ref_Layer) {
		Ref_Layer = ref_Layer;
	}


	public String getRef_Hatch() {
		return Ref_Hatch;
	}


	public void setRef_Hatch(String ref_Hatch) {
		Ref_Hatch = ref_Hatch;
	}


	public String getLW_Hatch() {
		return LW_Hatch;
	}


	public void setLW_Hatch(String lW_Hatch) {
		LW_Hatch = lW_Hatch;
	}


	public String getSP_Hatch() {
		return SP_Hatch;
	}


	public void setSP_Hatch(String sP_Hatch) {
		SP_Hatch = sP_Hatch;
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
		return "Impedance [id=" + id + ", Cus_FPC_PN=" + Cus_FPC_PN + ", Layer_Name=" + Layer_Name + ", Imp_Mode="
				+ Imp_Mode + ", LW_Customer=" + LW_Customer + ", SP_Customer=" + SP_Customer + ", LW_Recommend="
				+ LW_Recommend + ", SP_Recommend=" + SP_Recommend + ", LW_Adjust=" + LW_Adjust + ", SP_Adjust="
				+ SP_Adjust + ", Resistance=" + Resistance + ", Ref_Layer=" + Ref_Layer + ", Ref_Hatch=" + Ref_Hatch
				+ ", LW_Hatch=" + LW_Hatch + ", SP_Hatch=" + SP_Hatch + ", Input_User=" + Input_User
				+ ", Input_User_CN=" + Input_User_CN + ", Date_Time=" + Date_Time + ", Status=" + Status + "]";
	}
	


	
	
}
