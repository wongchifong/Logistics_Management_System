package dataservice.stockmanagermandataservice;

import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.Warningpo;

public interface StockManagermanService {

	public boolean set(Warningpo wpo) throws Exception;
	
	public boolean in(InStoringpo wpo) throws Exception;
}
