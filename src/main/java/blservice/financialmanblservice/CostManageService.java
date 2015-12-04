package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.financialmanvo.CostManagevo;
import vo.financialmanvo.Moneyvo;
import vo.financialmanvo.PaymentInputvo;

public interface CostManageService extends Remote {
	public CostManagevo show(String date,int numOfBusHall) throws RemoteException;
	
	public CostManagevo jisuan() throws RemoteException;
	
	public CostManagevo xinjian(int date,int money, 
			String person,String address,String tiaomu)
					 throws RemoteException;
	
	public boolean daochu() throws RemoteException;
	public boolean getOrder(PaymentInputvo pivo) throws RemoteException;
	
	public CostManagevo profit() throws RemoteException;
	boolean hasNegative(Moneyvo g) throws RemoteException;
	
	
}

