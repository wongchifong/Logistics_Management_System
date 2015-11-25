package businesslogic.administratorbl;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import blservice.administratorblservice.UserAuthorityManagerService;
import data.safetydata.AddaccountIO;
import dataservice.administratordataservice.AdministratorService;
import po.administratorpo.UserMespo;
import vo.administratorvo.QueryMesvo;
import vo.administratorvo.QueryUservo;
import vo.administratorvo.UserAuthorityManagervo;
import vo.queryvo.QueryOrdervo;

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
				
            	if(cs.writeOrder(new UserMespo(o))){
            		System.out.println("getOrder");
            		return true;
            	}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return false;
	}
	
	public QueryUservo checkOrder(QueryMesvo qvo) {
        //To change body of generated methods, choose Tools | Templates.
	   AdministratorService es = new AddaccountIO();
	 
	   
       UserMespo co;
		try {
			co = es.search(qvo.getID());
			if(co == null) return null;
	        return new QueryUservo(co);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
   }
	

	


}
