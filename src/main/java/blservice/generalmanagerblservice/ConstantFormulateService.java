package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.generalmanagervo.Constancyvo;

public interface ConstantFormulateService extends Remote {

	public Constancyvo showConstancy() throws RemoteException;
	
	public void modifyConstancy(String constancy,double amount)
			 throws RemoteException;
}
