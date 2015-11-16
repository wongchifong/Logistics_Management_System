package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.Staffvo;

public interface OrderExamineService extends Remote {

	public OrderExaminevo showOrders() throws RemoteException;
	
	public void approve(String type,String identifier,Staffvo operator)
			 throws RemoteException;

	public void disapprove(String type,String identifier,Staffvo operator)
	        throws RemoteException;
}
