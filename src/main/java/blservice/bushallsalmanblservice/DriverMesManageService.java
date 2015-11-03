package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.DriverMespo;
import vo.bushallsalmanvo.DriverMesManagevo;

public interface DriverMesManageService extends Remote {

	public DriverMespo inputdriver(DriverMesManagevo information)
			throws RemoteException;
}
