package blservice.bushallsalmanblservice;

import vo.bushallsalmanvo.CashRegistervo;

public class CashRegisterService_Driver {

	public void drive(CashRegisterService cashRegisterService){
		CashRegistervo information = CashRegistervo.getInformation();
		cashRegisterService.inputcash(information);
	}
	
	public static void main(String[] args){
		CashRegisterService_Driver driver = new CashRegisterService_Driver();
		CashRegisterService_Stub stub =new CashRegisterService_Stub();
		driver.drive(stub);
	}
}
