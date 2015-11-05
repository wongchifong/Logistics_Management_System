package vo.couriervo;

import java.io.Serializable;

public class OrderInputvo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2325826403399233813L;
	
	public Personvo sender;
	
	public Personvo consignee;
	
	public GoodsMesvo goods;
	
	public Othervo other;
	
	public OrderInputvo(Personvo s, Personvo c, GoodsMesvo g, Othervo o){
		sender = s;
		consignee = c;
		goods = g;
		other = o;
	}

	/**
	 * 
	 */

}
