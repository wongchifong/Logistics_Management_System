package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.ReceiveSendvo;

public interface ReceiveSendService extends Remote {

	public ReceiveOrderpo inputreceive(ReceiveSendvo receiveInformation)
			throws RemoteException;
	
	public SendOrderpo inputsend(ReceiveSendvo sendInformation)
			throws RemoteException;
}
