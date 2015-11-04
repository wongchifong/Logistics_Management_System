package blservice.courierblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.couriervo.OrderInputvo;

public interface OrderInputService extends Remote {

	public OrderInputvo getOrder() throws RemoteException;
}