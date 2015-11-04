package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.PriceQueryService;

public class PriceQueryImpl extends UnicastRemoteObject implements PriceQueryService {

	public PriceQueryImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriceQueryService getPrice() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
