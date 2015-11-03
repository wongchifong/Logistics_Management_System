package blservice.financialmanblservice;

import java.rmi.Remote;
import java.util.ArrayList;

import vo.financialmanvo.CostManagevo;

public interface CostManageService extends Remote {
	public CostManagevo show(String date,int numOfBusHall);
	public CostManagevo jisuan();
	public CostManagevo xinjian(int date,int money, String person,String address,String tiaomu);
	public boolean daochu();
	public CostManagevo profit();
}
