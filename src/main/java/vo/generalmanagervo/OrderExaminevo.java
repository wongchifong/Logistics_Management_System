package vo.generalmanagervo;

import po.generalmanagepo.Staffpo;

public class OrderExaminevo {

	String id;
	Staffpo op;
	public OrderExaminevo(){
		id="deliverorder";
		op=null;
	}
	
	public OrderExaminevo(String identifier, Staffpo operator) {
		// TODO Auto-generated constructor stub
		id=identifier;
		op=operator;
	}

}
