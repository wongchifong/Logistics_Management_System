package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CarMesManageService;
import po.bushallsalmanpo.CarMespo;
import vo.bushallsalmanvo.CarMesManagevo;

public class CarMesManageImpl extends UnicastRemoteObject implements CarMesManageService {

	public CarMesManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarMespo inputVehicle(CarMesManagevo information) {
		// TODO Auto-generated method stub
		return null;
	}

}
