package dataservice.bushallsalmandataservice;

import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.CarMespo;
import po.bushallsalmanpo.DriverMespo;

public interface BushallsalmanService {

	public boolean writeCarloading(CarLoadingpo clpo) throws Exception;
	
	public boolean writeCarMes(CarMespo cmpo)throws Exception;
	
	public boolean writeDriverMes(DriverMespo dmpo)throws Exception;
}
