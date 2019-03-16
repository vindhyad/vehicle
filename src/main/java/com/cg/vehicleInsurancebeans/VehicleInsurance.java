package com.cg.vehicleInsurancebeans;

public class VehicleInsurance {
private int vehicleNo;
private int vehicleType;
private int insurancePeriod;
private String  aadharNo;
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
private String mobileNo;
public VehicleInsurance(int i, int j, String string, String string2) {
	
	this.vehicleType=i;
	this.insurancePeriod=j;
	this.aadharNo= string;
	this.mobileNo=string2;
}
public VehicleInsurance() {
	
}
public int getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(int vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public int getVehicleType() {
	return vehicleType;
}
public void setVehicleType(int vehicleType) {
	this.vehicleType = vehicleType;
}
public int getInsurancePeriod() {
	return insurancePeriod;
}
public void setInsurancePeriod(int insurancePeriod) {
	this.insurancePeriod = insurancePeriod;
}


public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

}
