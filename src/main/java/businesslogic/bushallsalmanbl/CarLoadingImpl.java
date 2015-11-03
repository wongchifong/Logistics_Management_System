package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CarLoadingService;
import vo.bushallsalmanvo.CarLoadingvo;

public class CarLoadingImpl extends UnicastRemoteObject implements CarLoadingService {

	public CarLoadingImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void inputLoad(CarLoadingvo information) {
		// TODO Auto-generated method stub
		
	}

}
