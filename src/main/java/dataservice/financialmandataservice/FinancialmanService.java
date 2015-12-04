package dataservice.financialmandataservice;



import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;

public interface FinancialmanService {
	 public CostOrderpo search(String ID) throws Exception ;
	 public boolean writeOrder(CostOrderpo cpo) throws Exception;
//	 public PriceAndTimepo query();
//	 public boolean writeProfitList(ReceiveOrderpo r);等写到收益表的时候写
	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws Exception;
//	public boolean writeOrder2(IncomeInputpo incomeInputpo);
//	public boolean writeOrder2(IncomeInputpo incomeInputpo);
	public boolean addAccount(Accountpo accountpo)throws Exception;

}
