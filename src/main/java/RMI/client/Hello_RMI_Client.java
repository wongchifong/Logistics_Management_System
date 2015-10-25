package RMI.client;

import java.rmi.Naming;
import java.util.Scanner;

import RMI.host.IHello;

public class Hello_RMI_Client {
    public static void main(String[] args) {
        try {
            IHello hello = (IHello) Naming.lookup("rmi://localhost:1099/hello");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            while(!s.equals("bye")){
            	System.out.println(hello.sayHello(s));
            	s = in.nextLine();
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}