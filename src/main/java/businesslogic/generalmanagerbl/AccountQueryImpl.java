package businesslogic.generalmanagerbl;

import dataservice.otherdataservice.FinanceService;
import vo.generalmanagervo.Accountvo;
import blservice.generalmanagerblservice.AccountQueryService;

public class AccountQueryImpl implements AccountQueryService {
      
	public Accountvo showAccount(){
		FinanceService fs = new FinanceService();
		System.out.println("显示银行账户信息");
		return null;
	}
} 
