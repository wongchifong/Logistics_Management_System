package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

public class OrderExamineService_driver {
	public void drive(OrderExamineService stub) throws RemoteException{
		stub.showOrders();
	}

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		OrderExamineService_driver d = new OrderExamineService_driver();
		OrderExamineService stub = new OrderExamineService_Stub();
		d.drive(stub);
	}

}
