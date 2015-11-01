package businesslogic.generalmanagerbl;

import vo.generalmanagervo.Constancyvo;
import blservice.generalmanagerblservice.ConstantFormulateService;

public class ConstantFormulateImpl implements ConstantFormulateService {

	public Constancyvo showConstancy(){
		System.out.println("显示常量信息");
		return null;
	}
	
	public void modifyConstancy(String constancy,double amount){
		
	}
	
}
