package businesslogic.generalmanagerbl;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.SalaryFormulatevo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.generalmanagerblservice.SalaryFormulateService;

public class SalaryFormulateImpl extends UnicastRemoteObject implements SalaryFormulateService {

	public SalaryFormulateImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryFormulatevo showSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	public void modifyAmount(StaffRole role,int amount) {
		// TODO Auto-generated method stub
	}

	public void modifystrategy(StaffRole role,String strategy) {
		// TODO Auto-generated method stub
	}
    
}
