package RMI.host;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import businesslogic.administratorbl.UserAuthorityManagerImpl;
import businesslogic.bushallsalmanbl.CarLoadingImpl;
import businesslogic.bushallsalmanbl.CarMesManageImpl;
import businesslogic.bushallsalmanbl.CashRegisterImpl;
import businesslogic.bushallsalmanbl.DriverMesManageImpl;
import businesslogic.bushallsalmanbl.ReceiveSendImpl;

public class RMIHost {
	
	/**
	 * 
	 */

	private static Map<String, Class<? extends UnicastRemoteObject>> NAMING_MAP =
            new HashMap<String, Class<? extends UnicastRemoteObject>>();

    private static final int PORT = 1099;

    private static boolean inited = false;
	
	
    protected RMIHost() throws RemoteException {
        super();
    }
    
    static {
        NAMING_MAP.put("user-authority-manager-service", 
        		UserAuthorityManagerImpl.class);
        NAMING_MAP.put("test", 
        		TestImpl.class);
        NAMING_MAP.put("car-loading-service", 
        		CarLoadingImpl.class);
        NAMING_MAP.put("car-mes-manage-service", 
        		CarMesManageImpl.class);
        NAMING_MAP.put("cash-register-service", 
        		CashRegisterImpl.class);
        NAMING_MAP.put("driver-mes-manage-service", 
        		DriverMesManageImpl.class);
        NAMING_MAP.put("receive-send-service", 
        		ReceiveSendImpl.class);
    }
    
    public synchronized static void init() throws Exception {
        if (inited) {
            return;
        }
        try {
            LocateRegistry.createRegistry(PORT);
            for (Entry<String, Class<? extends UnicastRemoteObject>> entry : NAMING_MAP.entrySet()) {
                String name = entry.getKey();
                Class<? extends UnicastRemoteObject> clazz = entry.getValue();
                UnicastRemoteObject proxy = clazz.newInstance();
                Naming.rebind(name, proxy);
            }
            inited = true;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    public static void main(String[] args) {
    	try {
            RMIHost.init();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}