package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.financialmanblservice.SettlementManageService;
import vo.financialmanvo.SettlementManagevo;

public class SettlementManageImpl extends UnicastRemoteObject implements SettlementManageService {

	public SettlementManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public SettlementManagevo shuRu(String da, String danw, String pers, String shou, int mon, String add) {
		// TODO Auto-generated method stub
		return null;
	}

	public void baocun() {
		// TODO Auto-generated method stub
		
	}

}
