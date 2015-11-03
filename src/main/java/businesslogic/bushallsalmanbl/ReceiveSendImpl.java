package businesslogic.bushallsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.bushallsalmanblservice.ReceiveSendService;
import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.ReceiveSendvo;

public class ReceiveSendImpl extends UnicastRemoteObject implements ReceiveSendService {

	public ReceiveSendImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiveOrderpo inputreceive(ReceiveSendvo receiveInformation) {
		// TODO Auto-generated method stub
		return null;
	}

	public SendOrderpo inputsend(ReceiveSendvo sendInformation) {
		// TODO Auto-generated method stub
		return null;
	}

}
