package blservice.generalmanagerblservice;

import po.generalmanagepo.Staffpo;
import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.deliverOrder;

public class OrderExamineService_Stub implements OrderExamineService {

	public OrderExaminevo showOrders() {
		System.out.println("显示订单分类");
		return new OrderExaminevo();
		// TODO Auto-generated method stub

	}

	public deliverOrder showDeliverOrder() {
		System.out.println("显示所有快递单");
		return new deliverOrder();
		// TODO Auto-generated method stub

	}

	public OrderExaminevo addOrder(String identifier,Staffpo operator) {
		// TODO Auto-generated method stub
		System.out.println("增加一条订单");
		return new OrderExaminevo(identifier,operator);
	}

	public boolean deleteOrder() {
		System.out.println("删除一条订单");
		// TODO Auto-generated method stub
		return false;
	}

	public OrderExaminevo modifyOrder(String identifier,Staffpo operator) {
		System.out.println("修改一条订单");
		// TODO Auto-generated method stub
		return new OrderExaminevo(identifier,operator);
	}

}
