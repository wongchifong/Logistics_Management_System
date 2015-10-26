package blservice.bushallsalmanblservice;

import vo.bushallsalmanvo.DriverMesManagevo;

public class DriverMesManageService_Driver {

	public void drive(DriverMesManageService driverMesManageService){
		DriverMesManagevo information =DriverMesManagevo.getInformation();
		driverMesManageService.inputdriver(information);
	}
	
	public static void main(String[] args){
		DriverMesManageService_Driver driver =new DriverMesManageService_Driver();
		DriverMesManageService_Stub stub=new DriverMesManageService_Stub();
		driver.drive(stub);
	}
}
