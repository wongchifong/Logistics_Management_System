package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.financialmanblservice.CostManageService;
import vo.financialmanvo.CostManagevo;

public class CostManageImpl extends UnicastRemoteObject implements CostManageService {

	public CostManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CostManagevo show(String date, int numOfBusHall) {
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo jisuan() {
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo xinjian(int date, int money, String person, String address, String tiaomu) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean daochu() {
		// TODO Auto-generated method stub
		return false;
	}

	public CostManagevo profit() {
		// TODO Auto-generated method stub
		return null;
	}

}
