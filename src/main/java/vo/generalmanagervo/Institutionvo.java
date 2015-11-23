package vo.generalmanagervo;

import java.io.Serializable;

public class Institutionvo extends StaffInstitutionManagevo implements Serializable {
       /**
	 * 
	 */
	private static final long serialVersionUID = 7696938678838677854L;
	public String name;
	public String ID;
    public String leader;
    public int transitamount;
    public String workunit;
       
       public Institutionvo(String n,String I,String l,int i,String work){
    	   name=n;
    	   ID=I;
    	   leader=l;
           transitamount = i;
           workunit = work;
       }
}

