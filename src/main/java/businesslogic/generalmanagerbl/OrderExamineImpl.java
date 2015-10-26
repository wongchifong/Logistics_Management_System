package businesslogic.generalmanagerbl;

import po.generalmanagepo.Staffpo;
import vo.generalmanagervo.OrderExaminevo;
import vo.generalmanagervo.deliverOrder;
import blservice.generalmanagerblservice.OrderExamineService;

public class OrderExamineImpl implements OrderExamineService {

	public OrderExaminevo showOrders(){
		System.out.println("显示订单分类");
		return null;
	}
	
	public deliverOrder showDeliverOrder(){
		System.out.println("显示所有快递单");
		return null;
	}

	public OrderExaminevo addOrder(String identifier,Staffpo operator){
		System.out.println("增加一条订单");
		return null;
	}
	
	public boolean deleteOrder(){
		System.out.println("删除一条订单");
	    return true;
	}
	
	public OrderExaminevo modifyOrder(String identifier,Staffpo operator){
		System.out.println("修改一条订单");
		return null;
	}

}
