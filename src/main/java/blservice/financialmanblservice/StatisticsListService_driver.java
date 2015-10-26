package blservice.financialmanblservice;

public class StatisticsListService_driver {
	public void driver(StatisticsListService stub){
		stub.date(null, null);
		stub.daochu();
		
		
		
		
	}
	public static void main(String[] args) {
		StatisticsListService_driver d=new StatisticsListService_driver();
		StatisticsListService stub=new StatisticsListService_Stub();
		d.driver(stub);
	}
}
