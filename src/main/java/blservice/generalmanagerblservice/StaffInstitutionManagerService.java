package blservice.generalmanagerblservice;

import java.rmi.Remote;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.StaffInstitutionManagevo;
import vo.generalmanagervo.Staffvo;

public interface StaffInstitutionManagerService extends Remote {
	
       public StaffInstitutionManagevo showStaffRole();
       
       public StaffInstitutionManagevo showInstitutions();
       
       public Staffvo addStaff(String i,String n,String w,int a,StaffRole r);
       
       public void deleteStaff(String i,String n,String w,int a,StaffRole r);
       
       public void modifyStaff(String i,String n,String w,int a,StaffRole r);
       
       public Institutionvo addInstitution(String n,String l);
       
       public void deleteInstitution(String n,String l);
 
       public void modifyInstitution(String n,String l);
}
