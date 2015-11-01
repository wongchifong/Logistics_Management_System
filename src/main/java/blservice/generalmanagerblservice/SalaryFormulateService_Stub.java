package blservice.generalmanagerblservice;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.SalaryFormulatevo;

public class SalaryFormulateService_Stub implements SalaryFormulateService {

	public SalaryFormulatevo showSalary() {
		// TODO Auto-generated method stub
		System.out.println("显示所有薪水策略信息");
		return new SalaryFormulatevo();
	}

	public void modifyAmount(StaffRole role,int amount) {
		System.out.println("修改了数额");
		// TODO Auto-generated method stub
	}

	public void modifystrategy(StaffRole role,String strategy) {
		// TODO Auto-generated method stub
		System.out.println("修改了策略");
	}

}
