package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.SalaryFormulatevo;

public interface SalaryFormulateService extends Remote {
	
	public SalaryFormulatevo showSalary() throws RemoteException;
	
	public void modifyAmount(StaffRole role,int amount)
			 throws RemoteException;
	
    public void modifystrategy(StaffRole role,String strategy)
    		 throws RemoteException;
    
}
