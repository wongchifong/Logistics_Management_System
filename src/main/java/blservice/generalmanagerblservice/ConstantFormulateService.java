package blservice.generalmanagerblservice;

import java.rmi.Remote;

import vo.generalmanagervo.Constancyvo;

public interface ConstantFormulateService extends Remote {

	public Constancyvo showConstancy();
	public void modifyConstancy(String constancy,double amount);
}
