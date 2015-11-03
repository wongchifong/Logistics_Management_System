package businesslogic.administratorbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.administratorblservice.UserAuthorityManagerService;
import vo.administratorvo.UserAuthorityManagervo;

public class UserAuthorityManagerImpl extends UnicastRemoteObject implements UserAuthorityManagerService {

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


}
