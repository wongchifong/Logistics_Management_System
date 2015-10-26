package blservice.bushallsalmanblservice;

import po.bushallsalmanpo.CashReceiveOrderpo;
import vo.bushallsalmanvo.CashRegistervo;

public interface CashRegisterService {

	public CashReceiveOrderpo inputcash(CashRegistervo information);
}
