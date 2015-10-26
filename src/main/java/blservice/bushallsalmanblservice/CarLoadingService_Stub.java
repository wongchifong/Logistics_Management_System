package blservice.bushallsalmanblservice;

import vo.bushallsalmanvo.CarLoadingvo;

public class CarLoadingService_Stub implements CarLoadingService{

	CarLoadingvo information=CarLoadingvo.getInformation();

	public void inputLoad(CarLoadingvo information) {
		// TODO Auto-generated method stub
		System.out.println("进行车辆装车管理");
	}
}
