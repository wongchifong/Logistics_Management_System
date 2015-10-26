package blservice.financialmanblservice;

public class SettlementManageService_driver {
	public void driver(SettlementManageService stub){
		stub.shuRu(null, null, null, null, 0, null);
		stub.baocun();
		
		
		
	}
	public static void main(String[] args) {
		SettlementManageService_driver d=new SettlementManageService_driver();
		SettlementManageService stub=new SettlementManageService_Stub();
		d.driver(stub);
	}
}
