package blservice.generalmanagerblservice;

public class OrderExamineService_driver {
	public void drive(OrderExamineService stub){
		stub.showOrders();
		stub.showDeliverOrder();
		stub.deleteOrder();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderExamineService_driver d = new OrderExamineService_driver();
		OrderExamineService stub = new OrderExamineService_Stub();
		d.drive(stub);
	}

}
