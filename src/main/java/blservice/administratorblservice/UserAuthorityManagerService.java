package blservice.administratorblservice;

import vo.administratorvo.UserAuthorityManagervo;

public interface UserAuthorityManagerService {
	public UserAuthorityManagervo findUser(int id);
	public UserAuthorityManagervo changeRole(int id);
	
}
