package blservice.bushallsalmanblservice;

import java.rmi.RemoteException;

import vo.bushallsalmanvo.ReceiveSendvo;

public class ReceiveSendService_Driver {

	public void drive(ReceiveSendService receiveSendService) throws RemoteException{
		ReceiveSendvo receiveInformation =ReceiveSendvo.getReceiveInformation();
		ReceiveSendvo sendInformation = ReceiveSendvo.getSendInformation();
		receiveSendService.inputreceive(receiveInformation);
		receiveSendService.inputsend(sendInformation);
	}
	
	public static void main(String[] args) throws RemoteException{
		ReceiveSendService_Driver driver = new ReceiveSendService_Driver();
		ReceiveSendService_Stub stub = new ReceiveSendService_Stub();
		driver.drive(stub);
	}
}
