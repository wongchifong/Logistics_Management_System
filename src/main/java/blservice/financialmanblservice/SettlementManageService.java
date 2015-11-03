package blservice.financialmanblservice;

import java.rmi.Remote;

import vo.financialmanvo.SettlementManagevo;

public interface SettlementManageService extends Remote{
	public SettlementManagevo shuRu(String da,String danw,String pers,String shou,int mon,String add);
	public void baocun();
}
