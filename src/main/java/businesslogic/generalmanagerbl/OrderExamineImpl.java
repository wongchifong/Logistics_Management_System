package businesslogic.generalmanagerbl;

import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.Staffvo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.generalmanagerblservice.OrderExamineService;

public class OrderExamineImpl extends UnicastRemoteObject implements OrderExamineService {

	public OrderExamineImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderExaminevo showOrders(){
		System.out.println("显示订单");
		return null;
	}
	
	public void approve(String type,String identifier,Staffvo operator){
		System.out.println("增加一条订单");
	}


}
