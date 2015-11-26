package businesslogic.generalmanagerbl;

import po.generalmanagepo.Institutionpo;
import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.StaffInstitutionManagevo;
import vo.generalmanagervo.Staffvo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import data.institutiondata.Institution;
import dataservice.generalmanagerdataservice.Institutionservice;
import blservice.generalmanagerblservice.StaffInstitutionManagerService;

public class StaffInstitutionManagerImpl extends UnicastRemoteObject implements StaffInstitutionManagerService {

	public StaffInstitutionManagerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	public Institutionvo showInstitutions(String id)  throws RemoteException{
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		Institutionpo ip = is.getInstitution(id);
		if(ip==null)  return null;
		return ip.getInstitution();
	}


	public Staffvo showStaffRole(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	public Staffvo addStaff(Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteStaff(Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	public void modifyStaff(Staffvo sv) throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	public Institutionvo addInstitution(Institutionvo iv)
			throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.writeInstitution(new Institutionpo(iv));
		return null;
	}


	public void deleteInstitution(Institutionvo iv) throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.deleteInstitution(new Institutionpo(iv));
	}


	public void modifyInstitution(Institutionvo oldiv,Institutionvo iv) throws RemoteException {
		// TODO Auto-generated method stub
		Institutionservice is = new Institution();
		is.modifyInstitution(new Institutionpo(oldiv),new Institutionpo(iv));
	}


	
}
