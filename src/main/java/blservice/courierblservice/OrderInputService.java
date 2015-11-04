package blservice.courierblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.couriervo.GoodsMesvo;
import vo.couriervo.OrderInputvo;
import vo.couriervo.Personvo;

public interface OrderInputService extends Remote {

	public OrderInputvo getOrder() throws RemoteException;
	
	boolean hasNull(Personvo p) throws RemoteException;
	
	boolean hasNegative(GoodsMesvo g) throws RemoteException;
}