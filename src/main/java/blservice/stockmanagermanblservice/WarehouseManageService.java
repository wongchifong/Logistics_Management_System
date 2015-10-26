package blservice.stockmanagermanblservice;

import po.stockmanagermanpo.Storingpo;
import vo.stocmanagermanvo.WarehouseManagevo;

public interface WarehouseManageService {
    
	public Storingpo out();
	
	public Storingpo in();
	
	public Storingpo search(WarehouseManagevo information);
	
	public int set();
	
	public Storingpo initialize();
}
