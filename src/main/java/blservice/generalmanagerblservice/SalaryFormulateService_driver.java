package blservice.generalmanagerblservice;

public class SalaryFormulateService_driver {
	
	public void drive(SalaryFormulateService stub){
		stub.showSalary();
	}
	public static void main(String[] args) {
		
		SalaryFormulateService_driver d = new SalaryFormulateService_driver();
		SalaryFormulateService stub = new SalaryFormulateService_Stub();
		d.drive(stub);
		// TODO Auto-generated method stub

	}

}
