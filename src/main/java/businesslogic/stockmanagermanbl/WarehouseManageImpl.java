package businesslogic.stockmanagermanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.stockmanagermanblservice.WarehouseManageService;
import po.stockmanagermanpo.Storingpo;
import vo.stocmanagermanvo.WarehouseManagevo;

public class WarehouseManageImpl extends UnicastRemoteObject implements WarehouseManageService {

	public WarehouseManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Storingpo out() {
		// TODO Auto-generated method stub
		return null;
	}

	public Storingpo in() {
		// TODO Auto-generated method stub
		return null;
	}

	public Storingpo search(WarehouseManagevo information) {
		// TODO Auto-generated method stub
		return null;
	}

	public int set() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Storingpo initialize() {
		// TODO Auto-generated method stub
		return null;
	}

}
