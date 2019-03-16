package com.cg.vehicleInsurancedao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.vehicleInsurancebeans.VehicleInsurance;



public class VehicleDao implements VehicleInterfaceDao{
	Map<Integer,VehicleInsurance> hashmapInsuranceEntry=new HashMap<Integer,VehicleInsurance>();
	public VehicleDao() {
hashmapInsuranceEntry.put(101,new VehicleInsurance(2,1,"678945367890","9876543210"));
	}
	public String  vehicleInsuranceRegistration(VehicleInsurance vehicleInsurance) {
		String i=null;
		for(Map.Entry<Integer,VehicleInsurance> m:hashmapInsuranceEntry.entrySet()) {
			if(m.getKey()!=(vehicleInsurance.getVehicleNo())) {
				i=vehicleInsurance.getInsurancePeriod() + " " +vehicleInsurance.getMobileNo() +" "+vehicleInsurance.getVehicleType();
			}
		}
		return i;
		
	}
	public void insuranceValidityCheck(int insurancePeriod) {
		
		
	}
	
}
