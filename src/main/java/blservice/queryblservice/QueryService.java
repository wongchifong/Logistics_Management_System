package blservice.queryblservice;

import java.rmi.Remote;

import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;

public interface QueryService extends Remote {
    
    public QueryOrdervo checkOrder(Queryvo qvo);
     
    public boolean isValid(String s);

}