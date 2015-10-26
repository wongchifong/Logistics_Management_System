/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.orderdata;

import java.util.List;
import po.otherdatapo.Expresspo;

/**
 *
 * @author user
 */
public class CheckOrder {
    PersonMes sender , consignee;
    String number;
    GoodsMes gm;
    double price;
    PackingType pt;
    ExpressType et;
    List<String> history;
    
    public CheckOrder(Expresspo epo) {
        findOrder();
    }
    
    public boolean findOrder() {
        return false;
    }
    
    public PersonMes getSender() {
        return sender;
    }
    
    public PersonMes getConsignee() {
        return consignee;
    }
    
    public String getID() {
        return number;
    }
    
    public GoodsMes getGoodMes() {
        return gm;
    }
    
    public PackingType getPackingType() {
        return pt;
    }
    
    public ExpressType getExpressType() {
        return et;
    }
    
    public double getPrice() {
        return price;
    }
    
    public List<String> getHistory() {
        return history;
    }
    
}
