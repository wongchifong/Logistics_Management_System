package blservice.generalmanagerblservice;

import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.Staffvo;

public interface OrderExamineService {

	public OrderExaminevo showOrders();
	
	public void approve(String type,String identifier,Staffvo operator);

}
