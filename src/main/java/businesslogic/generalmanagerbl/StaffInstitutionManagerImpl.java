package businesslogic.generalmanagerbl;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.StaffInstitutionManagevo;
import vo.generalmanagervo.Staffvo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import blservice.generalmanagerblservice.StaffInstitutionManagerService;

public class StaffInstitutionManagerImpl extends UnicastRemoteObject implements StaffInstitutionManagerService {

	public StaffInstitutionManagerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaffInstitutionManagevo showStaffRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public StaffInstitutionManagevo showInstitutions() {
		// TODO Auto-generated method stub
		return null;
	}

	public Staffvo addStaff(String i,String n,String w,int a,StaffRole r) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteStaff(String i,String n,String w,int a,StaffRole r) {
		// TODO Auto-generated method stub
		
	}

	public void modifyStaff(String i,String n,String w,int a,StaffRole r) {
		// TODO Auto-generated method stub
	}

	public Institutionvo addInstitution(String n,String l) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteInstitution(String n,String l) {
		// TODO Auto-generated method stub
	}

	public void modifyInstitution(String n,String l) {
		// TODO Auto-generated method stub
	}

	
}
