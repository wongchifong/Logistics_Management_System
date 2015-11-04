package vo.bushallsalmanvo;

import java.io.Serializable;

public class CarLoadingvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6871645204235068508L;

	//CarLoadingvo carLoadingvo = new CarLoadingvo();
	
	public static CarLoadingvo getInformation(){
		return new CarLoadingvo();
	}
}
