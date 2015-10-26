package blservice.financialmanblservice;

import vo.financialmanvo.SettlementManagevo;

public interface SettlementManageService {
	public SettlementManagevo shuRu(String da,String danw,String pers,String shou,int mon,String add);
	public void baocun();
}
