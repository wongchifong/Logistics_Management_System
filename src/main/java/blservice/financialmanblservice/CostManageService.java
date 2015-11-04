package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.financialmanvo.CostManagevo;

public interface CostManageService extends Remote {
	public CostManagevo show(String date,int numOfBusHall) throws RemoteException;
	
	public CostManagevo jisuan() throws RemoteException;
	
	public CostManagevo xinjian(int date,int money, 
			String person,String address,String tiaomu)
					 throws RemoteException;
	
	public boolean daochu() throws RemoteException;
	
	public CostManagevo profit() throws RemoteException;
}
