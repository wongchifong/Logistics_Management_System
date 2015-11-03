package RMI.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import blservice.administratorblservice.UserAuthorityManagerService;
import blservice.bushallsalmanblservice.CarLoadingService;
import blservice.bushallsalmanblservice.CarMesManageService;
import blservice.bushallsalmanblservice.CashRegisterService;
import blservice.bushallsalmanblservice.DriverMesManageService;
import blservice.bushallsalmanblservice.ReceiveSendService;



public class RMIClient {
	
	private static final String IP = "localhost"; //Can be read from config file

    private static boolean inited = false;
    
    private static UserAuthorityManagerService uams;
    
    private static CarLoadingService cls;
    
    private static CarMesManageService cmms;
    
    private static CashRegisterService crs;
    
    private static DriverMesManageService dmms;
    
    private static ReceiveSendService rss;
    
    private static Test t;
	
    public synchronized static void init() throws Exception {
        if (inited) {
            return;
        }

        try {
            initObjects();
            inited = true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    private static void initObjects() throws MalformedURLException, RemoteException, NotBoundException {
        String urlPrefix = "rmi://" + IP + "/";
        uams = (UserAuthorityManagerService)Naming.lookup(urlPrefix + 
        		"user-authority-manager-service");
        cls = (CarLoadingService)Naming.lookup(urlPrefix +
        		"car-loading-service");
        cmms = (CarMesManageService)Naming.lookup(urlPrefix +
        		"car-mes-manage-service");
        crs = (CashRegisterService)Naming.lookup(urlPrefix + 
        		"cash-register-service");
        dmms = (DriverMesManageService)Naming.lookup(urlPrefix + 
        		"driver-mes-manage-service");
        rss = (ReceiveSendService)Naming.lookup(urlPrefix + 
        		"receive-send-service");
        t = (Test)Naming.lookup(urlPrefix + "test");
    }
    
    public static UserAuthorityManagerService getUserAuthorityManagerService() {
    	return uams;
    }
    
    public static Test test(){
    	return t;
    }
    
    public static void main(String [] args) throws Exception{
    	RMIClient.init();
    	UserAuthorityManagerService service = 
    			RMIClient.getUserAuthorityManagerService();
    	service.findUser(2);
    	Test test = RMIClient.test();
    	System.out.println(test.print("abc"));
    }
}