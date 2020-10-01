package com.erp.bean;

import java.util.HashSet;
import java.util.Set;

public class Job {

	private Integer id;
	private String Internal_PN;
	private String Layer_Num;
	private String Stack_Up;
	private String Utilization;
	private String Sub_Size_X;
	private String Sub_Size_Y;
	private String Sub_Up;
	private String PNL_Size_X;
	private String PNL_Size_Y;
	private String PNL_Up;
	private String Date_Fmat;
	private String Internal_Level;
	private String EMI;
	private String Hot_Bar;
	private String ZIF;
	private String WB;
	private String Honeycomb;
	private String Comp_0201;
	private String Comp_01005;
	private String BGA_Pitch;
	private String DCR;
	private String Impedance;
	private String Loss;
	private String ET_Type;
	private String STIFF_ET;
	private String NPI;
	private String MI_ENG;
	private String CAM_ENG;
	private String MI_TEL;
	private String CAM_TEL;
	private String Input_User;
	private String Input_User_CN;
	private String Date_Time;
	private String Status;

	/*
	 * 
	 * 一对多
	 */


	private Ink ink;
	
	

	////////////////////

	
	

	

	

	

	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
	}

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

	public String getLayer_Num() {
		return Layer_Num;
	}

	public void setLayer_Num(String layer_Num) {
		Layer_Num = layer_Num;
	}

	public String getStack_Up() {
		return Stack_Up;
	}

	public void setStack_Up(String stack_Up) {
		Stack_Up = stack_Up;
	}

	public String getUtilization() {
		return Utilization;
	}

	public void setUtilization(String utilization) {
		Utilization = utilization;
	}

	public String getSub_Size_X() {
		return Sub_Size_X;
	}

	public void setSub_Size_X(String sub_Size_X) {
		Sub_Size_X = sub_Size_X;
	}

	public String getSub_Size_Y() {
		return Sub_Size_Y;
	}

	public void setSub_Size_Y(String sub_Size_Y) {
		Sub_Size_Y = sub_Size_Y;
	}

	public String getSub_Up() {
		return Sub_Up;
	}

	public void setSub_Up(String sub_Up) {
		Sub_Up = sub_Up;
	}

	public String getPNL_Size_X() {
		return PNL_Size_X;
	}

	public void setPNL_Size_X(String pNL_Size_X) {
		PNL_Size_X = pNL_Size_X;
	}

	public String getPNL_Size_Y() {
		return PNL_Size_Y;
	}

	public void setPNL_Size_Y(String pNL_Size_Y) {
		PNL_Size_Y = pNL_Size_Y;
	}

	public String getPNL_Up() {
		return PNL_Up;
	}

	public void setPNL_Up(String pNL_Up) {
		PNL_Up = pNL_Up;
	}

	public String getDate_Fmat() {
		return Date_Fmat;
	}

	public void setDate_Fmat(String date_Fmat) {
		Date_Fmat = date_Fmat;
	}

	public String getInternal_Level() {
		return Internal_Level;
	}

	public void setInternal_Level(String internal_Level) {
		Internal_Level = internal_Level;
	}

	public String getEMI() {
		return EMI;
	}

	public void setEMI(String eMI) {
		EMI = eMI;
	}

	public String getHot_Bar() {
		return Hot_Bar;
	}

	public void setHot_Bar(String hot_Bar) {
		Hot_Bar = hot_Bar;
	}

	public String getZIF() {
		return ZIF;
	}

	public void setZIF(String zIF) {
		ZIF = zIF;
	}

	public String getWB() {
		return WB;
	}

	public void setWB(String wB) {
		WB = wB;
	}

	public String getHoneycomb() {
		return Honeycomb;
	}

	public void setHoneycomb(String honeycomb) {
		Honeycomb = honeycomb;
	}

	public String getComp_0201() {
		return Comp_0201;
	}

	public void setComp_0201(String comp_0201) {
		Comp_0201 = comp_0201;
	}

	public String getComp_01005() {
		return Comp_01005;
	}

	public void setComp_01005(String comp_01005) {
		Comp_01005 = comp_01005;
	}

	public String getBGA_Pitch() {
		return BGA_Pitch;
	}

	public void setBGA_Pitch(String bGA_Pitch) {
		BGA_Pitch = bGA_Pitch;
	}

	public String getDCR() {
		return DCR;
	}

	public void setDCR(String dCR) {
		DCR = dCR;
	}

	public String getImpedance() {
		return Impedance;
	}

	public void setImpedance(String impedance) {
		Impedance = impedance;
	}

	public String getLoss() {
		return Loss;
	}

	public void setLoss(String loss) {
		Loss = loss;
	}

	public String getET_Type() {
		return ET_Type;
	}

	public void setET_Type(String eT_Type) {
		ET_Type = eT_Type;
	}

	public String getSTIFF_ET() {
		return STIFF_ET;
	}

	public void setSTIFF_ET(String sTIFF_ET) {
		STIFF_ET = sTIFF_ET;
	}

	public String getNPI() {
		return NPI;
	}

	public void setNPI(String nPI) {
		NPI = nPI;
	}

	public String getMI_ENG() {
		return MI_ENG;
	}

	public void setMI_ENG(String mI_ENG) {
		MI_ENG = mI_ENG;
	}

	public String getCAM_ENG() {
		return CAM_ENG;
	}

	public void setCAM_ENG(String cAM_ENG) {
		CAM_ENG = cAM_ENG;
	}

	public String getMI_TEL() {
		return MI_TEL;
	}

	public void setMI_TEL(String mI_TEL) {
		MI_TEL = mI_TEL;
	}

	public String getCAM_TEL() {
		return CAM_TEL;
	}

	public void setCAM_TEL(String cAM_TEL) {
		CAM_TEL = cAM_TEL;
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
		return "Job [id=" + id + ", Internal_PN=" + Internal_PN + ", Layer_Num=" + Layer_Num + ", Stack_Up=" + Stack_Up
				+ ", Utilization=" + Utilization + ", Sub_Size_X=" + Sub_Size_X + ", Sub_Size_Y=" + Sub_Size_Y
				+ ", Sub_Up=" + Sub_Up + ", PNL_Size_X=" + PNL_Size_X + ", PNL_Size_Y=" + PNL_Size_Y + ", PNL_Up="
				+ PNL_Up + ", Date_Fmat=" + Date_Fmat + ", Internal_Level=" + Internal_Level + ", EMI=" + EMI
				+ ", Hot_Bar=" + Hot_Bar + ", ZIF=" + ZIF + ", WB=" + WB + ", Honeycomb=" + Honeycomb + ", Comp_0201="
				+ Comp_0201 + ", Comp_01005=" + Comp_01005 + ", BGA_Pitch=" + BGA_Pitch + ", DCR=" + DCR
				+ ", Impedance=" + Impedance + ", Loss=" + Loss + ", ET_Type=" + ET_Type + ", STIFF_ET=" + STIFF_ET
				+ ", NPI=" + NPI + ", MI_ENG=" + MI_ENG + ", CAM_ENG=" + CAM_ENG + ", MI_TEL=" + MI_TEL + ", CAM_TEL="
				+ CAM_TEL + ", Input_User=" + Input_User + ", Input_User_CN=" + Input_User_CN + ", Date_Time="
				+ Date_Time + ", Status=" + Status + "]";
	}

}
