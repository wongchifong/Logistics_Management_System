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

	@Override
	public String[] showexpressorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showcarloadingorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showyingyetingorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showshoukuanorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showzhongzhuanorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showpaijianorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showzhongzhuanzhongxinorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showinstockorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showoutstockorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] showpaymentorder() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	

}
