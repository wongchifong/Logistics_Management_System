package blservice.generalmanagerblservice;

import vo.generalmanagervo.Constancyvo;

public class ConstantFormulateService_Stub implements ConstantFormulateService {

	public Constancyvo showConstancy() {
		System.out.println("显示员工分类信息");
		return new Constancyvo();
		// TODO Auto-generated method stub

	}

	public void modifyConstancy(String constancy, double amount) {
		// TODO Auto-generated method stub
		System.out.println("修改常量");

}}
