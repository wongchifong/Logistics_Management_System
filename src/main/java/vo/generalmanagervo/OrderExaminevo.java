package vo.generalmanagervo;

import po.generalmanagepo.Staffpo;

public class OrderExaminevo {

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
