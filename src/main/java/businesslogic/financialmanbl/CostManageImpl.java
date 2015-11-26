package businesslogic.financialmanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.financialmanblservice.CostManageService;
import data.reformdata.PaymentListIO;
import dataservice.financialmandataservice.FinancialmanService;
import po.financialmanpo.CostOrderpo;
import vo.financialmanvo.CostManagevo;
import vo.financialmanvo.Moneyvo;
import vo.financialmanvo.PaymentInputvo;

public class CostManageImpl extends UnicastRemoteObject implements CostManageService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 173093101905816120L;

	public CostManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean getOrder(PaymentInputvo o) {
		// TODO Auto-generated method stub
		System.out.println(o.beizhu.moneymouth+"sfeferegrttry");
		System.out.println("ssss");

            FinancialmanService cs = new PaymentListIO();
            try {
				System.out.println("sdweretr");
            	if(cs.writeOrder(new CostOrderpo(o)))
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}

	public CostManagevo show(String date, int numOfBusHall) {
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo jisuan() {
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo xinjian(int date, int money, String person, String address, String tiaomu) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean daochu() {
		// TODO Auto-generated method stub
		return false;
	}

	public CostManagevo profit() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasNegative(Moneyvo g) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
