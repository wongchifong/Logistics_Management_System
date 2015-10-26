package blservice.financialmanblservice;

import vo.financialmanvo.CostManagevo;

public class CostManageService_Stub implements CostManageService {

	public CostManagevo show(String date, int numOfBusHall) {
		System.out.println("查看收款单");
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo jisuan() {
		System.out.println("计算总成本");
		// TODO Auto-generated method stub
		return null;
	}

	public CostManagevo xinjian(int date, int money, String person, String address, String tiaomu) {
		// TODO Auto-generated method stub
		System.out.println("新建付款单");
		return null;
	}

	public boolean daochu() {
		System.out.println("是否导出");
		// TODO Auto-generated method stub
		return false;
	}

	public CostManagevo profit() {
		System.out.println("计算总收益");
		// TODO Auto-generated method stub
		return null;
	}

}
