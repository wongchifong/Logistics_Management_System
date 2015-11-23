package vo.generalmanagervo;

import java.io.Serializable;

import po.generalmanagepo.StaffRole;

public class Staffvo extends StaffInstitutionManagevo implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1342558994390365715L;
	String id;
	  String name;
	  String worktime;                  //yyyy-mm-dd
	  int age;
	  String role;
	  
	 public Staffvo(String i,String n,String w,int a,String r){
	    	id = i;
	    	name = n;
	    	worktime = w;
	    	age = a;
	    	role = r;
	    }
  public String getName(){
  	return name;
  }
  public String getID(){
  	return id;
  }
  public String getWorktime(){ 
  	return worktime;
  }
  public int getAge(){
  	return age;
  }
  public String role(){
  	return role;
  }
}
