package blservice.courierblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PriceQueryService extends Remote {
	
	PriceQueryService getPrice() throws RemoteException;

}
