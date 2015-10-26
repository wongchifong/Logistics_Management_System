package blservice.bushallsalmanblservice;

import vo.bushallsalmanvo.CarMesManagevo;

public class CarMesManageService_Driver {

	public void drive(CarMesManageService carMesManageService){
		CarMesManagevo information =CarMesManagevo.getInformation();
		carMesManageService.inputVehicle(information);
	}
	
	public static void main(String[] args){
		CarMesManageService_Driver driver =new CarMesManageService_Driver();
		CarMesManageService_Stub stub = new CarMesManageService_Stub();
		driver.drive(stub);
	}
}
