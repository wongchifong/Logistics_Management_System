package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.ReceiveMesService;
import vo.couriervo.ReceiveMesvo;

public class ReceiveMesImpl extends UnicastRemoteObject implements ReceiveMesService {

	public ReceiveMesImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiveMesvo getReceive() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
