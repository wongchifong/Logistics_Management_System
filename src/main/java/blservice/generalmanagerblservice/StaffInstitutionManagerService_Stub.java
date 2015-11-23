package blservice.generalmanagerblservice;

import java.rmi.RemoteException;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.StaffInstitutionManagevo;
import vo.generalmanagervo.Staffvo;

public class StaffInstitutionManagerService_Stub implements StaffInstitutionManagerService {

	public StaffInstitutionManagevo showStaffRole() {
		System.out.println("显示所有员工信息");
		// TODO Auto-generated method stub
		return new StaffInstitutionManagevo();
	}

	public StaffInstitutionManagevo showInstitutions() {
		System.out.println("显示所有机构信息");
		// TODO Auto-generated method stub
		return new StaffInstitutionManagevo();
	}

	public Staffvo addStaff(String i,String n,String w,int a,String r) {
		System.out.println("增加了一条员工信息");
		// TODO Auto-generated method stub
		return new Staffvo(i,n,w,a,r);
	}

	public void deleteStaff(String i,String n,String w,int a,StaffRole r) {
		System.out.println("删除了一条员工信息");
		// TODO Auto-generated method stub

	}

	public void modifyStaff(String i,String n,String w,int a,StaffRole r) {
	    System.out.println("修改了一条员工信息");
		// TODO Auto-generated method stub
	}

	public void deleteInstitution(String n,String l) {
		System.out.println("删除了一条机构信息");
		// TODO Auto-generated method stub
	}

	public void modifyInstitution(String n,String l) {
		System.out.println("修改了一条机构信息");
		// TODO Auto-generated method stub
	}

	public Staffvo addStaff(String i, String n, String w, int a, StaffRole r)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public Institutionvo addInstitution(String n, String l)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
