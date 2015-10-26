package vo.financialmanvo;

public class AccountManagevo {//管理账户
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
