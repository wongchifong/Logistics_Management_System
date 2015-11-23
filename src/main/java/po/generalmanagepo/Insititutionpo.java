package po.generalmanagepo;

import java.io.Serializable;

import vo.generalmanagervo.Institutionvo;

public class Insititutionpo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1574341290974004989L;

	String name;
	String ID;
	String leader;
	 int transitamount;
	 
	 public Insititutionpo(Institutionvo iv){
		 name =iv.name;
		 ID=iv.ID;
		 leader=iv.leader;
		 transitamount = iv.transitamount;
	 }
	 
}
