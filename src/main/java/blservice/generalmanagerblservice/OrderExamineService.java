package blservice.generalmanagerblservice;

import po.generalmanagepo.Staffpo;
import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.deliverOrder;

public interface OrderExamineService {

	public OrderExaminevo showOrders();

	public deliverOrder showDeliverOrder();
	
	public OrderExaminevo addOrder(String identifier,Staffpo operator);
	
	public boolean deleteOrder();
	
	public OrderExaminevo modifyOrder(String identifier,Staffpo operator);
}
