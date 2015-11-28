package dataservice.generalmanagerdataservice;

import po.otherdatapo.Staffpo;

public interface Staffservice {
		boolean writeStaff(Staffpo ip);
		Staffpo getStaff(String id);
		void deleteStaff(Staffpo ip);
		void modifyStaff(Staffpo oldip,Staffpo ip);
}
