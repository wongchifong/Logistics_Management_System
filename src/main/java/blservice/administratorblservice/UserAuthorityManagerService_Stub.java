package blservice.administratorblservice;

import java.rmi.RemoteException;

import vo.administratorvo.UserAuthorityManagervo;

public class UserAuthorityManagerService_Stub implements UserAuthorityManagerService {
	public UserAuthorityManagervo findUser(int id){
		System.out.println("查找用户");
		return new UserAuthorityManagervo(null, null, null, id);
	}
	public UserAuthorityManagervo changeRole(int id){
		System.out.println("改变权限");
		return new UserAuthorityManagervo(null, null, null, id);
	}
	public boolean getOrder(UserAuthorityManagervo u) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
