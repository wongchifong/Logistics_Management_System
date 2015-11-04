package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import blservice.financialmanblservice.AccountManageService;
import vo.financialmanvo.AccountManagevo;

public class AccountManageImpl extends UnicastRemoteObject implements AccountManageService {

	public AccountManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountManagevo showAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountManagevo addAcount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	public AccountManagevo changeAccount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountManagevo Initialize(String jigou, ArrayList<String> renyuan, ArrayList<String> cheliang, int kucun,
			String accountname, int money) {
		// TODO Auto-generated method stub
		return null;
	}

}
