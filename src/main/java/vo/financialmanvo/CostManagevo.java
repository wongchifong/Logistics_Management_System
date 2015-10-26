package vo.financialmanvo;

public class CostManagevo {//管理成本
	String date;
	int numOfBusHall;
	public CostManagevo(String d,int n){
		date=d;
		numOfBusHall=n;
	}
	public String getdate(){
		return date;
	}
	public int getnumOfbBusHall(){
		return numOfBusHall;
	}
	
}
