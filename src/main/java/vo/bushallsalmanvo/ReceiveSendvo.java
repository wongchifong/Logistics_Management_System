package vo.bushallsalmanvo;

import java.io.Serializable;

public class ReceiveSendvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3880277280772014181L;

	public static ReceiveSendvo getReceiveInformation(){
		return new ReceiveSendvo();
	}
	
	public static ReceiveSendvo getSendInformation(){
		return new ReceiveSendvo();
	}
}
