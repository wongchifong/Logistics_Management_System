package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;

public interface CashRegisterService extends Remote {

	public CashReceiveOrderpo inputcash(CashRegistervo information)
			throws RemoteException;
}
