package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.CashRegistervo;

public class CashReceiveOrderpo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 297620571692198281L;

	public final String year;
	public final String month;
	public final String day;
	public final String kuaidiyuan;
	public final String tiaoxingma;
	
	final CrExamineType cre;
	
	public CashReceiveOrderpo(CashRegistervo cr) {
		// TODO Auto-generated constructor stub
		year=cr.year;
		month=cr.month;
		day=cr.day;
		kuaidiyuan=cr.kuaidiyuan;
		tiaoxingma=cr.tiaoxingma;
		
		cre=CrExamineType.NOApproval;
		
	}
	
	public CrExamineType getExamineType() {
        return cre;
    }

}
