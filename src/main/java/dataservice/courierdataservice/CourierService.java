package dataservice.courierdataservice;

import data.orderdata.OrderIO;
import po.courierpo.CourierOrderpo;
import vo.couriervo.OrderInputvo;
import vo.couriervo.PriceAndTimevo;

public class CourierService {
	
	public static boolean writeData(OrderInputvo o, PriceAndTimevo p){
		try {
        	if(OrderIO.write(new CourierOrderpo(o , p)))
        		return true;
        } catch(Exception e){
        	e.printStackTrace();
        }
		return false;
	}

}
