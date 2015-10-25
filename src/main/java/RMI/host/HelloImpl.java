package RMI.host;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
public class HelloImpl extends UnicastRemoteObject implements IHello {
    // ���ʵ�ֱ�����һ����ʽ�Ĺ��캯��������Ҫ�׳�һ��RemoteException�쳣  
    protected HelloImpl() throws RemoteException {
        super();
    }
    
    private static final long serialVersionUID = 4077329331699640331L;
    public String sayHello(String name) throws RemoteException {
        return "Hello " + name + " ^_^ ";
    }
    public static void main(String[] args) {
        try {
            IHello hello = new HelloImpl();
            LocateRegistry.createRegistry(1099); //���ϴ˳��򣬾Ϳ��Բ�Ҫ�ڿ���̨�Ͽ���RMI��ע�����1099��RMI������ӵ�Ĭ�϶˿�
            java.rmi.Naming.rebind("rmi://localhost:1099/hello", hello);
            System.out.print("Ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}