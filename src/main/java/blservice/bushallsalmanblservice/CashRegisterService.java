package blservice.bushallsalmanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;

public interface CashRegisterService extends Remote {

	public boolean inputcash(CashRegistervo information)
			throws RemoteException;

//	public CashRegistervo[] SearchByMes(String text, String text2, String text3, String text4);

//	public CashRegistervo[] SearchByMes(String text, String text2, String text3, String text4)throws RemoteException;
}
