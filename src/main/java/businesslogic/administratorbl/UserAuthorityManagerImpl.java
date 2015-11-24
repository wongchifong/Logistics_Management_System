package businesslogic.administratorbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.administratorblservice.UserAuthorityManagerService;
import data.safetydata.AddaccountIO;
import dataservice.administratordataservice.AdministratorService;
import po.administratorpo.UserMespo;
import vo.administratorvo.UserAuthorityManagervo;
import vo.financialmanvo.PaymentInputvo;

public class UserAuthorityManagerImpl extends UnicastRemoteObject implements UserAuthorityManagerService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 559751419304538499L;
	/**
	 * 
	 */

	public UserAuthorityManagerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAuthorityManagervo findUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserAuthorityManagervo changeRole(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean getOrder(UserAuthorityManagervo o) {
		// TODO Auto-generated method stub
//		System.out.println(o.beizhu.moneymouth+"sfeferegrttry");
//		System.out.println("ssss");

//            FinancialmanService cs = new PaymentListIO();
		///////////////////////////////////////////////////////////////////
		AdministratorService cs=new AddaccountIO();
		
            try {
				System.out.println("sdweretr");
            	if(cs.writeOrder(new UserMespo(o)))
					return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}

	


}
