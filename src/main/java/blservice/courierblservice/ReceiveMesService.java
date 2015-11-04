package blservice.courierblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.couriervo.ReceiveMesvo;

public interface ReceiveMesService extends Remote {
	
	public ReceiveMesvo getReceive() throws RemoteException;

}
