package com.cg.vehicleInsurancedao;

import com.cg.vehicleInsurancebeans.VehicleInsurance;

public interface VehicleInterfaceDao  {
	
	String vehicleInsuranceRegistration(VehicleInsurance vehicleInsurance);
	void insuranceValidityCheck(int insurancePeriod);
}
