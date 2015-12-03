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
	
	public String[] showexpressorder() throws RemoteException;
	public String[] showcarloadingorder() throws RemoteException;
	public String[] showyingyetingorder() throws RemoteException;
	public String[] showshoukuanorder() throws RemoteException;
	public String[] showzhongzhuanorder() throws RemoteException;
	public String[] showpaijianorder() throws RemoteException;
	public String[] showzhongzhuanzhongxinorder() throws RemoteException;
	public String[] showinstockorder() throws RemoteException;
	public String[] showoutstockorder() throws RemoteException;
	public String[] showpaymentorder() throws RemoteException;
}
