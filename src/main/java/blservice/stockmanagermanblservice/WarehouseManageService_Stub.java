package blservice.stockmanagermanblservice;

import po.stockmanagermanpo.Storingpo;
import vo.stocmanagermanvo.WarehouseManagevo;

public class WarehouseManageService_Stub implements WarehouseManageService{

	public Storingpo out() {
		// TODO Auto-generated method stub
		System.out.println("进行出库");
		return null;
	}

	public Storingpo in() {
		// TODO Auto-generated method stub
		System.out.println("进行入库");
		return null;
	}

	public Storingpo search(WarehouseManagevo information) {
		// TODO Auto-generated method stub
		System.out.println("库存查询");
		return null;
	}

	public int set() {
		// TODO Auto-generated method stub
		System.out.println("设置警戒比例");
		return 0;
	}

	public Storingpo initialize() {
		// TODO Auto-generated method stub
		System.out.println("库存初始化");
		return null;
	}

}
