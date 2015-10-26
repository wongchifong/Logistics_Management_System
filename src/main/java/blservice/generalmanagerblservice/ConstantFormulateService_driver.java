package blservice.generalmanagerblservice;

public class ConstantFormulateService_driver {

	public void drive(ConstantFormulateService stub){
		stub.showConstancy();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstantFormulateService_driver d= new ConstantFormulateService_driver();
		ConstantFormulateService stub = new ConstantFormulateService_Stub();
		d.drive(stub);
	}

}
