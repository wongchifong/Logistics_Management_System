package vo.financialmanvo;

public class StatisticsListvo {
	String date1;
	String date2;
	public StatisticsListvo(String d1,String d2){
		date1=d1;
		date2=d2;
	}
	public String getDate1(){
		return date1;
	}
	public String getDate2(){
		return date2;
	}
}
