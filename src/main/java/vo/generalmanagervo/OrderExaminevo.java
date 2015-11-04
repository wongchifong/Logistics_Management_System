package vo.generalmanagervo;

import java.io.Serializable;

import po.generalmanagepo.Staffpo;

public class OrderExaminevo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2849489705262039507L;
	String id;
	String type;
	Staffpo op;
	public OrderExaminevo(){
		id="deliverorder";
		op=null;
		type="deliverorder";
	}
	
	public OrderExaminevo(String t,String identifier, Staffpo operator) {
		// TODO Auto-generated constructor stub
		id=identifier;
		t=type;
		op=operator;
	}

}
