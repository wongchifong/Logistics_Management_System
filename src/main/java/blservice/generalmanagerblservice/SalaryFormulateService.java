package blservice.generalmanagerblservice;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.SalaryFormulatevo;

public interface SalaryFormulateService {
	
	public SalaryFormulatevo showSalary();
	
	public void modifyAmount(StaffRole role,int amount);
	
    public void modifystrategy(StaffRole role,String strategy);
    
}
