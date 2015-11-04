/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.queryvo;

import data.orderdata.*;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author user
 */
public class QueryOrdervo implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -4031887692482029076L;
	private CheckOrder co;
    
    public QueryOrdervo(CheckOrder co) {
        this.co = co;
    }
    
    public String getSenderName() {
        return co.getSender().name;
    }
    
    public String getConsigneeName() {
        return co.getConsignee().name;
    }
    
    public String getID() {
        return co.getID();
    }
    
    public String getSenderAddress() {
        return co.getSender().address;
    }
    
    public String getConsigneeAddress() {
        return co.getConsignee().address;
    }
    
    public String getConsigneeTelephone() {
        return co.getConsignee().tele;
    }
    
    public String getSenderTelephone() {
        return co.getSender().tele;
    }
    
    public double getPrice() {
        return co.getPrice();
    }
    
    public int getNumberOfGoods() {
        return co.getGoodMes().num;
    }
    
    public String getGoodsName() {
        return co.getGoodMes().name;
    }
    
    public PackingType getPackingType() {
        return co.getPackingType();
    }
    
    public ExpressType getExpressType() {
        return co.getExpressType();
    }
    
    public List<String> getHistory() {
        return co.getHistory();
    }
    
}
