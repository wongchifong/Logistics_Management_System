package blservice.generalmanagerblservice;

import vo.generalmanagervo.SalaryFormulatevo;

public class SalaryFormulateService_Stub implements SalaryFormulateService {

	public SalaryFormulatevo showSalary() {
		// TODO Auto-generated method stub
		System.out.println("显示所有薪水策略信息");
		return new SalaryFormulatevo();
	}

	public SalaryFormulatevo modifyAmount() {
		System.out.println("修改了数额");
		// TODO Auto-generated method stub
		return new SalaryFormulatevo();
	}

	public SalaryFormulatevo modifystrategy() {
		// TODO Auto-generated method stub
		System.out.println("修改了策略");
		return new SalaryFormulatevo();
	}

}
