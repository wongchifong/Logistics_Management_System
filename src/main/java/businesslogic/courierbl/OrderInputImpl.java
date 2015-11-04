package businesslogic.courierbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.courierblservice.OrderInputService;
import vo.couriervo.GoodsMesvo;
import vo.couriervo.OrderInputvo;
import vo.couriervo.Personvo;

public class OrderInputImpl extends UnicastRemoteObject implements OrderInputService {

	public OrderInputImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderInputvo getOrder() throws RemoteException {
		// TODO Auto-generated method stub
            System.out.println("hhhhhh");
		return null;
	}

	public boolean hasNull(Personvo p) throws RemoteException {
		// TODO Auto-generated method stub
		if(p.address.equals("") || p.company.equals("") || p.name.equals("") ||
				p.phone.equals("") || p.telephone.equals(""))
			return true;
		return false;
	}

	public boolean hasNegative(GoodsMesvo g) throws RemoteException {
		// TODO Auto-generated method stub
		if(g.number_of_goods < 1 || g.volume <= 0 || g.weight <= 0)
			return true;
		return false;
	}

}
