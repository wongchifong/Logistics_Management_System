package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.financialmanvo.SettlementManagevo;

public interface SettlementManageService extends Remote{
	public SettlementManagevo shuRu(String da,String danw,
			String pers,String shou,int mon,String add)
					 throws RemoteException;
	
	public void baocun() throws RemoteException;
}
