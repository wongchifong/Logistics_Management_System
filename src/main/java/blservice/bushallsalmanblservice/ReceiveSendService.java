package blservice.bushallsalmanblservice;

import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.SendOrderpo;
import vo.bushallsalmanvo.ReceiveSendvo;

public interface ReceiveSendService {

	public ReceiveOrderpo inputreceive(ReceiveSendvo information);
	
	public SendOrderpo inputsend(SendOrderpo information);
}
