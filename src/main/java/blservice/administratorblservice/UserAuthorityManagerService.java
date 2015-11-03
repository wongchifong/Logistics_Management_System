package blservice.administratorblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.administratorvo.UserAuthorityManagervo;

public interface UserAuthorityManagerService extends Remote {
	public UserAuthorityManagervo findUser(int id)  throws RemoteException;
	public UserAuthorityManagervo changeRole(int id)  throws RemoteException;
	
}
