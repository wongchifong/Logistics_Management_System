package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.Staffvo;

public class OrderExamineService_Stub implements OrderExamineService {

	public OrderExaminevo showOrders() {
		System.out.println("显示订单");
		return new OrderExaminevo();
		// TODO Auto-generated method stub

	}

	public void approve(String type, String identifier,
			Staffvo operator) {
		// TODO Auto-generated method stub
	}

	public void disapprove(String type, String identifier, Staffvo operator)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	

}
