package blservice.bushallsalmanblservice;

import vo.bushallsalmanvo.ReceiveSendvo;

public class ReceiveSendService_Driver {

	public void drive(ReceiveSendService receiveSendService){
		ReceiveSendvo receiveInformation =ReceiveSendvo.getReceiveInformation();
		ReceiveSendvo sendInformation = ReceiveSendvo.getSendInformation();
		receiveSendService.inputreceive(receiveInformation);
		receiveSendService.inputsend(sendInformation);
	}
	
	public static void main(String[] args){
		ReceiveSendService_Driver driver = new ReceiveSendService_Driver();
		ReceiveSendService_Stub stub = new ReceiveSendService_Stub();
		driver.drive(stub);
	}
}
