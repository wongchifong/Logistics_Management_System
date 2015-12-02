package businesslogic.transitsalmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.ReceiveMesService;
import blservice.transitsalmanblservice.TransitReceiveService;
import businesslogic.courierbl.ReceiveMesImpl;
import vo.queryvo.QueryOrdervo;
import vo.transitmanvo.TransitReceivevo;

public class TransitReceiveImpl extends UnicastRemoteObject implements TransitReceiveService {

	public TransitReceiveImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean getReceive(TransitReceivevo t) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkDate(TransitReceivevo t, QueryOrdervo qvo) throws RemoteException {
		// TODO Auto-generated method stub
		ReceiveMesService rms = new ReceiveMesImpl();
		
		return rms.checkDateE(t.date, qvo);
	}

}
