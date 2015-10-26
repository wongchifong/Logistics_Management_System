package businesslogic.generalmanagerbl;

import vo.generalmanagervo.Accountvo;
import blservice.generalmanagerblservice.AccountQueryService;

public class AccountQueryImpl implements AccountQueryService {
      
	public Accountvo showAccount(){
		System.out.println("显示银行账户信息");
		return null;
	}
}
