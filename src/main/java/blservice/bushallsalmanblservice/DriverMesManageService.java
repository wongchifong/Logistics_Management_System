package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.DriverMespo;
import vo.bushallsalmanvo.DriverMesManagevo;
import vo.bushallsalmanvo.Othervo2;

public interface DriverMesManageService extends Remote {

	
			

	public boolean inputdriver(DriverMesManagevo drivermesmanage)throws RemoteException;
}
