package blservice.financialmanblservice;

import java.util.ArrayList;

import vo.financialmanvo.AccountManagevo;

public interface AccountManageService {
	public AccountManagevo showAccount();
	public AccountManagevo addAcount(String name);
	public boolean deleteAccount();
	public AccountManagevo changeAccount(String  name);
	public AccountManagevo Initialize(String jigou,ArrayList<String> renyuan,ArrayList<String> cheliang,int kucun,String accountname,int money);
}
