package vo.generalmanagervo;

import po.generalmanagepo.Staffpo;

public class deliverOrder extends OrderExaminevo {
	
	String id;
	Staffpo op;
	public deliverOrder(){
		id="deliverOrder";
		op=null;
	}
	
	public deliverOrder(String identifier, Staffpo operator) {
		super(identifier,operator);
		id=identifier;
		op=operator;
	}

}
