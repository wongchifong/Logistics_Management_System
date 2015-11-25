package dataservice.administratordataservice;

import po.administratorpo.UserMespo;

public interface AdministratorService {

	public boolean writeOrder(UserMespo userMespo)throws Exception;
	 public UserMespo search(String ID) throws Exception ;

}
