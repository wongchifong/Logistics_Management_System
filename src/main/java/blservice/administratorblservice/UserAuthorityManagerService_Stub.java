package blservice.administratorblservice;

import vo.administratorvo.UserAuthorityManagervo;

public class UserAuthorityManagerService_Stub implements UserAuthorityManagerService {
	public UserAuthorityManagervo findUser(int id){
		System.out.println("查找用户");
		return new UserAuthorityManagervo();
	}
	public UserAuthorityManagervo changeRole(int id){
		System.out.println("改变权限");
		return new UserAuthorityManagervo();
	}
	
}
