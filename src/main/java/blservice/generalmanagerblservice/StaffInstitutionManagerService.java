package blservice.generalmanagerblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.StaffInstitutionManagevo;
import vo.generalmanagervo.Staffvo;

public interface StaffInstitutionManagerService extends Remote {
	
       public StaffInstitutionManagevo showStaffRole() throws RemoteException;
       
       public StaffInstitutionManagevo showInstitutions() throws RemoteException;
       
       public Staffvo addStaff(String i,String n,String w,int a,StaffRole r)
    		   throws RemoteException;
       
       public void deleteStaff(String i,String n,String w,int a,StaffRole r)
    		   throws RemoteException;
       
       public void modifyStaff(String i,String n,String w,int a,StaffRole r)
    		   throws RemoteException;
       
       public Institutionvo addInstitution(String n,String l)
    		   throws RemoteException;
       
       public void deleteInstitution(String n,String l) throws RemoteException;
 
       public void modifyInstitution(String n,String l) throws RemoteException;
}
