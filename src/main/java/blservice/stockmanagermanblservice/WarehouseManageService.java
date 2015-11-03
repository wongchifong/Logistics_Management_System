package blservice.stockmanagermanblservice;

import java.rmi.Remote;

import po.stockmanagermanpo.Storingpo;
import vo.stocmanagermanvo.WarehouseManagevo;

public interface WarehouseManageService extends Remote {
    
	public Storingpo out();
	
	public Storingpo in();
	
	public Storingpo search(WarehouseManagevo information);
	
	public int set();
	
	public Storingpo initialize();
}
