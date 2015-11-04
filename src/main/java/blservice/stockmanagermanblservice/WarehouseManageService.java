package blservice.stockmanagermanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.stockmanagermanpo.Storingpo;
import vo.stocmanagermanvo.WarehouseManagevo;

public interface WarehouseManageService extends Remote {
    
	public Storingpo out() throws RemoteException;
	
	public Storingpo in() throws RemoteException;
	
	public Storingpo search(WarehouseManagevo information) throws RemoteException;
	
	public int set() throws RemoteException;
	
	public Storingpo initialize() throws RemoteException;
}
