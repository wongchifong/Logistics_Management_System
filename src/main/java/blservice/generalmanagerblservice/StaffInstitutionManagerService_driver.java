package blservice.generalmanagerblservice;

public class StaffInstitutionManagerService_driver {
       String name = "";
       String leader = " ";
	public void drive (StaffInstitutionManagerService stub){
	stub.showInstitutions(this.name, this.leader);
	stub.addInstitution(name, leader);
	stub.deleteInstitution();
	stub.modifyInstitution(name, leader);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaffInstitutionManagerService_driver d = new StaffInstitutionManagerService_driver();
		StaffInstitutionManagerService stub = new StaffInstitutionManagerService_Stub();
		d.drive(stub);
	}

}
