package blservice.financialmanblservice;

import java.rmi.Remote;

import vo.financialmanvo.StatisticsListvo;

public interface StatisticsListService extends Remote {
	public StatisticsListvo date(String date1,String Date2);
	public boolean daochu();
}
