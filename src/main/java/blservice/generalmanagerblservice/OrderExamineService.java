package blservice.generalmanagerblservice;

import java.rmi.Remote;

import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.Staffvo;

public interface OrderExamineService extends Remote {

	public OrderExaminevo showOrders();
	
	public void approve(String type,String identifier,Staffvo operator);

}
