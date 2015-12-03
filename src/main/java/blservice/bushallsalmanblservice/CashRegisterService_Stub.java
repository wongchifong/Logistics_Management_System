package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;

public class CashRegisterService_Stub implements CashRegisterService{

	public boolean inputcash(CashRegistervo information) {
		// TODO Auto-generated method stub
		System.out.println("生成收款单");
		return true;
	}

//	@Override
//	public CashRegistervo[] SearchByMes(String text, String text2, String text3, String text4) throws RemoteException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
}
