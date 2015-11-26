package dataservice.stockmanagermandataservice;

import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.OutStoringpo;
import po.stockmanagermanpo.Warningpo;

public interface StockManagermanService {

	public boolean set(Warningpo wpo) throws Exception;
	
	public boolean in(InStoringpo ipo) throws Exception;
	
	public boolean out(OutStoringpo opo) throws Exception;
	
	public boolean initialize() throws Exception;
	
	public InStoringpo search() throws Exception;
}
