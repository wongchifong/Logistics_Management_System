package blservice.queryblservice;

import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;

public interface QueryService {
    
    public QueryOrdervo checkOrder(Queryvo qvo);
     
    public boolean isValid(String s);

}