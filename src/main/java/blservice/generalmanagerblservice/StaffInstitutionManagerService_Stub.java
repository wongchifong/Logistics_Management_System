package blservice.generalmanagerblservice;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.Staffvo;

public class StaffInstitutionManagerService_Stub implements StaffInstitutionManagerService {

	public Staffvo showStaffRole(String i,String n,String w,int a,StaffRole r) {
		System.out.println("显示所有员工信息");
		// TODO Auto-generated method stub
		return new Staffvo(i,n,w,a,r) ;
	}

	public Institutionvo showInstitutions(String n,String l) {
		System.out.println("显示所有机构信息");
		// TODO Auto-generated method stub
		return new Institutionvo(n,l);
	}

	public Staffvo addStaff(String i,String n,String w,int a,StaffRole r) {
		System.out.println("增加了一条员工信息");
		// TODO Auto-generated method stub
		return new Staffvo(i,n,w,a,r);
	}

	public void deleteStaff() {
		System.out.println("删除了一条员工信息");
		// TODO Auto-generated method stub

	}

	public Staffvo modifyStaff(String i,String n,String w,int a,StaffRole r) {
	    System.out.println("修改了一条员工信息");
		// TODO Auto-generated method stub
		return new Staffvo(i,n,w,a,r);
	}

	public Institutionvo addInstitution(String n,String l) {
		System.out.println("增加了一条机构信息");
		// TODO Auto-generated method stub
		return new Institutionvo(n,l);
	}

	public void deleteInstitution() {
		System.out.println("删除了一条机构信息");
		// TODO Auto-generated method stub
	}

	public Institutionvo modifyInstitution(String n,String l) {
		System.out.println("修改了一条机构信息");
		// TODO Auto-generated method stub
		return new Institutionvo(n,l);
	}

}
