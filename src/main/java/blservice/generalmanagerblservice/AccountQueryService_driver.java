package blservice.generalmanagerblservice;

public class AccountQueryService_driver {

	public void drive(AccountQueryService stub) {
		// TODO Auto-generated method stub	
		 stub.showAccount();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountQueryService_driver d = new AccountQueryService_driver();
		AccountQueryService  stub = new AccountQueryService_Stub();
		d.drive(stub);
	}

}
