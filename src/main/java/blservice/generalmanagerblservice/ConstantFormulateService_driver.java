package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

public class ConstantFormulateService_driver {

	public void drive(ConstantFormulateService stub) throws RemoteException{
		stub.showConstancy();
	}
	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		ConstantFormulateService_driver d= new ConstantFormulateService_driver();
		ConstantFormulateService stub = new ConstantFormulateService_Stub();
		d.drive(stub);
	}

}
