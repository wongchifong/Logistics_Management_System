package dataservice.financialmandataservice;



import po.financialmanpo.CostOrderpo;

public interface FinancialmanService {
	 public CostOrderpo search(String ID) throws Exception ;
	 public boolean writeOrder(CostOrderpo cpo) throws Exception;
//	 public PriceAndTimepo query();
//	 public boolean writeProfitList(ReceiveOrderpo r);等写到收益表的时候写

}
