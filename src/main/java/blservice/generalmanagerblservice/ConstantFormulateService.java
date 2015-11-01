package blservice.generalmanagerblservice;

import vo.generalmanagervo.Constancyvo;

public interface ConstantFormulateService {

	public Constancyvo showConstancy();
	public void modifyConstancy(String constancy,double amount);
}
