package businesslogic.transitsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.transitsalmanblservice.TransitReceiveService;
import vo.transitmanvo.TransitReceivevo;

public class TransitReceiveImpl extends UnicastRemoteObject implements TransitReceiveService {

	public TransitReceiveImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransitReceivevo getReceive() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
