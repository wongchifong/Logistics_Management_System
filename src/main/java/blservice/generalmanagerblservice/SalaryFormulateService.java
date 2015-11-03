package blservice.generalmanagerblservice;

import java.rmi.Remote;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.SalaryFormulatevo;

public interface SalaryFormulateService extends Remote {
	
	public SalaryFormulatevo showSalary();
	
	public void modifyAmount(StaffRole role,int amount);
	
    public void modifystrategy(StaffRole role,String strategy);
    
}
