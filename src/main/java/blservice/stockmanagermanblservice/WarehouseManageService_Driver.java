package blservice.stockmanagermanblservice;

import vo.stocmanagermanvo.WarehouseManagevo;

public class WarehouseManageService_Driver {

	public void drive(WarehouseManageService warehouseManageService){
		WarehouseManagevo information = WarehouseManagevo.getInformation();
		warehouseManageService.in();
		warehouseManageService.out();
		warehouseManageService.search(information);
		warehouseManageService.set();
		warehouseManageService.initialize();
	}
	
	public static void main(String[] args){
		WarehouseManageService_Driver driver = new WarehouseManageService_Driver();
		WarehouseManageService_Stub stub = new WarehouseManageService_Stub();
		driver.drive(stub);
	}
}
