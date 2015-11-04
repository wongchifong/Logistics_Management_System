package businesslogic.generalmanagerbl;

import vo.generalmanagervo.Constancyvo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.generalmanagerblservice.ConstantFormulateService;

public class ConstantFormulateImpl extends UnicastRemoteObject implements ConstantFormulateService {

	public ConstantFormulateImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Constancyvo showConstancy(){
		System.out.println("显示常量信息");
		return null;
	}
	
	public void modifyConstancy(String constancy,double amount){
		
	}
	
}
