package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.PriceQueryService;
import vo.couriervo.Datevo;
import vo.couriervo.PriceAndTimevo;

public class PriceQueryImpl extends UnicastRemoteObject implements PriceQueryService {

	public PriceQueryImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriceAndTimevo getPriceAndTime(PriceAndTimevo p) throws RemoteException {
		// TODO Auto-generated method stub
            p.price = 100;
            p.date = new Datevo();
		return p;
	}

}
