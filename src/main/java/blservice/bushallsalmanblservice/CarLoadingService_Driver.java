package blservice.bushallsalmanblservice;

import vo.bushallsalmanvo.CarLoadingvo;

public class CarLoadingService_Driver {

	public void drive(CarLoadingService carLoadingService){
		CarLoadingvo information=CarLoadingvo.getInformation();
		carLoadingService.inputLoad(information);
	}
	
		public static void main(String[] args){
			CarLoadingService_Driver driver = new CarLoadingService_Driver();
			CarLoadingService_Stub stub = new CarLoadingService_Stub();
			driver.drive(stub);
		}
	}

