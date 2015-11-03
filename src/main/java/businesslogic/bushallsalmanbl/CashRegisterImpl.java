package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.CashRegisterService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;

public class CashRegisterImpl extends UnicastRemoteObject implements CashRegisterService {

	public CashRegisterImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CashReceiveOrderpo inputcash(CashRegistervo information) {
		// TODO Auto-generated method stub
		return null;
	}

}
