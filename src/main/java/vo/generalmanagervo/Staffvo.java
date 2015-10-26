package vo.generalmanagervo;

import po.generalmanagepo.StaffRole;

public class Staffvo extends StaffInstitutionManagevo {
	 String id;
	  String name;
	  String worktime;                  //yyyy-mm-dd
	  int age;
	  StaffRole role;
	  
	 public Staffvo(String i,String n,String w,int a,StaffRole r){
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
  public StaffRole role(){
  	return role;
  }
}
