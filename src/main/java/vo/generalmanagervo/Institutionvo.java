package vo.generalmanagervo;

import java.io.Serializable;

public class Institutionvo extends StaffInstitutionManagevo implements Serializable {
       /**
	 * 
	 */
	private static final long serialVersionUID = 7696938678838677854L;
	String name;
       String leader;
       
       public Institutionvo(String n,String l){
    	   name=n;
    	   leader=l;
       }
}

