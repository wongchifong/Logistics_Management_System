package vo.financialmanvo;

import java.io.Serializable;

public class AccountManagevo implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -4431565731890262716L;

//管理账户
	
	String accountName;
	
	int money;
	
	public AccountManagevo(String a,int m){
		accountName=a;
		money=m;
	}
	
	public String getAccountName(){
		return accountName;
	}
	
	public int getMoney(){
		return money;
	}
	
}
