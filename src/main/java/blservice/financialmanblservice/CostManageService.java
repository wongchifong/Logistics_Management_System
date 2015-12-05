package blservice.financialmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.financialmanvo.CostManagevo;
import vo.financialmanvo.Moneyvo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;

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

	public RecieveListvo[] SearchByMes(String text, String text2, String text3, String text4)
			throws RemoteException;
	public RecieveListvo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
			String text6) throws RemoteException;

	public PaymentInputvo[] SearchPay(String text, String text2, String text3, String text4, String text5,
			String text6) throws RemoteException;
	
	
}

