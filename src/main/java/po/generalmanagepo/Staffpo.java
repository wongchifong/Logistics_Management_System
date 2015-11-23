package po.generalmanagepo;

public class Staffpo {
	 public String id;
	 public String name;
	 public String worktime;                  //yyyy-mm-dd
	 public int age;
	 public String role;
	 public String workunit;
	  
	 public Staffpo(String i,String n,String w,int a,String r,String work){
	    	id = i;
	    	name = n;
	    	worktime = w;
	    	age = a;
	    	role = r;
	    	workunit=work;
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
