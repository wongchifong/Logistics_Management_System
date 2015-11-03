package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.DriverMesManageService;
import po.bushallsalmanpo.DriverMespo;
import vo.bushallsalmanvo.DriverMesManagevo;

public class DriverMesManageImpl extends UnicastRemoteObject implements DriverMesManageService {

	public DriverMesManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public DriverMespo inputdriver(DriverMesManagevo information) {
		// TODO Auto-generated method stub
		return null;
	}

}
