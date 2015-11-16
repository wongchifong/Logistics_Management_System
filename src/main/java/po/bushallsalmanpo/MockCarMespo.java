package po.bushallsalmanpo;

public class MockCarMespo extends CarMespo{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5430455624614750434L;
	public int daihao=025001001;
    public String  chepaihao="苏A00001";
    public int year=2015;
    public int month=10;
    public int day=1;
    
    public MockCarMespo(int d,String  c,int y,int m,int da){
    	daihao=d;
    	chepaihao=c;
    	year=y;
    	month=m;
    	day=da;
    }
    public int getdaihao(){
    	return daihao;
    }
    public String getchepaihao(){
    	return chepaihao;
    }
    public int getyear(){
    	return year;
    }
    public int getmonth(){
    	return month;
    }
    public int getday(){
    	return day;
    }
}
