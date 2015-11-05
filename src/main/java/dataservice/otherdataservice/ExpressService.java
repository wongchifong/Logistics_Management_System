package dataservice.otherdataservice;

import data.orderdata.OrderIO;
import po.courierpo.CourierOrderpo;
import po.otherdatapo.Expresspo;

public class ExpressService {
    CourierOrderpo co;
    String number;
    public ExpressService(String s){
        number = s;
    }
    
    public CourierOrderpo Message() {
        try {
			co = OrderIO.search(number);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return co;
    }

}
