package dataservice.otherdataservice;

import data.orderdata.CheckOrder;
import po.otherdatapo.Expresspo;

public class ExpressService {
    CheckOrder co;
    String number;
    public ExpressService(String s){
        number = s;
    }
    
    public CheckOrder Message() {
        co = new CheckOrder(new Expresspo(number));
        if(co.findOrder() == false) return null;
        return co;
    }

}
