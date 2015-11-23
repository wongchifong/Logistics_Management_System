package blservice.stockmanagermanblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.stockmanagermanpo.InStoringpo;
import vo.stocmanagermanvo.Instockvo;
import vo.stocmanagermanvo.Kuaidivo;
import vo.stocmanagermanvo.WarehouseWarningvo;
import vo.stocmanagermanvo.Weizhivo;

public interface WarehouseManageService extends Remote {
    
	public InStoringpo out() throws RemoteException;
	
	public boolean in(Kuaidivo kd,Weizhivo wz) throws RemoteException;
	
	public InStoringpo search(WarehouseWarningvo information) throws RemoteException;
	
	public boolean set(WarehouseWarningvo warning) throws RemoteException;
	
	public InStoringpo initialize() throws RemoteException;
}
