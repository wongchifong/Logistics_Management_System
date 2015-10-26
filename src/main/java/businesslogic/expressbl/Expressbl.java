package businesslogic.expressbl;

import blservice.queryblservice.QueryService;
import data.orderdata.CheckOrder;
import dataservice.otherdataservice.ExpressService;
import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;

public class Expressbl implements QueryService {

    public QueryOrdervo checkOrder(Queryvo qvo) {
         //To change body of generated methods, choose Tools | Templates.
        ExpressService es = new ExpressService(qvo.getID());
        CheckOrder co = es.Message();
        if(co == null) return null;
        return new QueryOrdervo(co);
    }

    public boolean isValid(String s) {
        //To change body of generated methods, choose Tools | Templates.
        return s.length() == 10;
    }

}