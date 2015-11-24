package businesslogic.stockmanagermanbl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.stockmanagermanblservice.WarehouseManageService;
import data.warehousedata.Storing;
import dataservice.stockmanagermandataservice.StockManagermanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.OutStoringpo;
import po.stockmanagermanpo.Warningpo;
import vo.stocmanagermanvo.Instockvo;
import vo.stocmanagermanvo.Kuaidivo;
import vo.stocmanagermanvo.Outstockvo;
import vo.stocmanagermanvo.Outstockvo1;
import vo.stocmanagermanvo.WarehouseWarningvo;
import vo.stocmanagermanvo.Weizhivo;
import vo.stocmanagermanvo.Zhuangyunvo;

public class WarehouseManageImpl extends UnicastRemoteObject implements WarehouseManageService {

	public WarehouseManageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	public InStoringpo search(WarehouseWarningvo information) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean initialize() throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try{
		if(sms.initialize())
			return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
		
	}

	public boolean set(WarehouseWarningvo warning) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try {
			if(sms.set(new Warningpo(warning)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean in(Kuaidivo kd,Weizhivo wz) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try {
			if(sms.in(new InStoringpo(kd,wz)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean out(Outstockvo1 out1,Zhuangyunvo zy) throws RemoteException {
		// TODO Auto-generated method stub
		StockManagermanService sms = new Storing();
		try {
			if(sms.out(new OutStoringpo(out1,zy)))
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
