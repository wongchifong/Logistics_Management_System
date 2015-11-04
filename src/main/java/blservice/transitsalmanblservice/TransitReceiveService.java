package blservice.transitsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.transitmanvo.TransitReceivevo;

public interface TransitReceiveService extends Remote {
	
	TransitReceivevo getReceive() throws RemoteException;

}
