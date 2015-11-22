package po.bushallsalmanpo;

import java.io.Serializable;

import vo.bushallsalmanvo.CarMesManagevo;

public class CarMespo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5430455624614750434L;
	
	public final String cardaihao;
	public final String chepaihao;
	public final String year;
	public final String month;
	public final String day;
	
	public CarMespo(CarMesManagevo cm) {
		// TODO Auto-generated constructor stub
		cardaihao=cm.cardaihao;
		chepaihao=cm.chepaihao;
		year=cm.year;
		month=cm.month;
		day=cm.day;
	}

	
}
