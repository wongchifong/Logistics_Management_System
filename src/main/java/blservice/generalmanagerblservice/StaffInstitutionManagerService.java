package blservice.generalmanagerblservice;

import po.generalmanagepo.StaffRole;
import vo.generalmanagervo.Institutionvo;
import vo.generalmanagervo.Staffvo;

public interface StaffInstitutionManagerService {
	
       public Staffvo showStaffRole(String i,String n,String w,int a,StaffRole r);
       
       public Institutionvo showInstitutions(String n,String l);
       
       public Staffvo addStaff(String i,String n,String w,int a,StaffRole r);
       
       public void deleteStaff();
       
       public Staffvo modifyStaff(String i,String n,String w,int a,StaffRole r);
       
       public Institutionvo addInstitution(String n,String l);
       
       public void deleteInstitution();
 
       public  Institutionvo modifyInstitution(String n,String l);
}
