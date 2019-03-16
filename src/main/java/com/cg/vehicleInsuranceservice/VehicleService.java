package com.cg.vehicleInsuranceservice;

import com.cg.vehicleInsurancebeans.VehicleInsurance;
import com.cg.vehicleInsurancedao.VehicleDao;
import com.cg.vehicleInsurancedao.VehicleInterfaceDao;

public class VehicleService implements VehicleInterfaceService {

	

	VehicleInterfaceDao vehicleInterfaceDao=new VehicleDao();

	public String  vehicleInsuranceRegistration(VehicleInsurance vehicleInsurance) {
		String  i=vehicleInterfaceDao.vehicleInsuranceRegistration(vehicleInsurance);
		return i;
	}

	public void insuranceValidityCheck(int insurancePeriod) {
		// TODO Auto-generated method stub
		
	}

	

}
