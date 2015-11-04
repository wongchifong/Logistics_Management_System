package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.OrderInputService;
import vo.couriervo.OrderInputvo;

public class OrderInputImpl extends UnicastRemoteObject implements OrderInputService {

	public OrderInputImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderInputvo getOrder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
