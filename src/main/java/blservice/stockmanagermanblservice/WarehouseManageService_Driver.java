package blservice.stockmanagermanblservice;

import java.rmi.RemoteException;

import vo.stocmanagermanvo.WarehouseManagevo;

public class WarehouseManageService_Driver {

	public void drive(WarehouseManageService warehouseManageService) throws RemoteException{
		WarehouseManagevo information = WarehouseManagevo.getInformation();
		warehouseManageService.in();
		warehouseManageService.out();
		warehouseManageService.search(information);
		warehouseManageService.set();
		warehouseManageService.initialize();
	}
	
	public static void main(String[] args) throws RemoteException{
		WarehouseManageService_Driver driver = new WarehouseManageService_Driver();
		WarehouseManageService_Stub stub = new WarehouseManageService_Stub();
		driver.drive(stub);
	}
}
