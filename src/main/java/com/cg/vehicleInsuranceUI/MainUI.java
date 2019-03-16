package com.cg.vehicleInsuranceUI;

import java.util.Date;
import java.util.Scanner;

import com.cg.vehicleInsurancebeans.VehicleInsurance;
import com.cg.vehicleInsuranceservice.VehicleInterfaceService;
import com.cg.vehicleInsuranceservice.VehicleService;

public class MainUI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VehicleInsurance vehicleInsurance=new VehicleInsurance();
		VehicleInterfaceService vehicleInterfaceService=new VehicleService();
		System.out.println("========Menu to the customer======");
		System.out.println("1.Vehicle Insurance Registration");
		System.out.println("2.Insurance Validity Check");
		System.out.println("3.Exit");
		int option=sc.nextInt();
		switch(option) {
		case 1: System.out.println("enter the vehicle number");
			int vehicleNo=sc.nextInt();
			vehicleInsurance.setVehicleNo(vehicleNo);
			System.out.println("enter the vehicle type ");
			int vehicleType=sc.nextInt();
			vehicleInsurance.setVehicleType(vehicleType);
			
			System.out.println("enter the insurance period");
			int insurancePeriod=sc.nextInt();
			vehicleInsurance.setInsurancePeriod(insurancePeriod);
			
			System.out.println("enter the aadhar number");
			String aadharNo=sc.next();
			vehicleInsurance.setAadharNo(aadharNo);
			
			System.out.println("enter the mobile number");
			String mobileNo=sc.next();
			vehicleInsurance.setMobileNo(mobileNo);
			
			
			
			String  i =vehicleInterfaceService.vehicleInsuranceRegistration(vehicleInsurance);
			if(i!=null) {
				System.out.println("successfull registration with "+currentDate());
			}
		case 2:
			vehicleInterfaceService.insuranceValidityCheck(insurancePeriod);
			System.out.println("");
		}
	}

	private static String currentDate() {
		Date d=new Date();
		String s= "16/03/2109";
		return s;
	}



}
