package data.warehousedata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.stockmanagermandataservice.StockManagermanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.courierpo.CourierOrderpo;
import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.OutStoringpo;
import po.stockmanagermanpo.Warningpo;

public class Storing implements StockManagermanService {
	
	public static boolean write1() throws Exception{
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/warning.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
		
	}
	
	public static boolean write2() throws Exception{
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
		
	}
	
	public static boolean write3() throws Exception{
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/outstock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
		
	}

	public boolean set(Warningpo wpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/warning.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Warningpo> list = (List<Warningpo>) ois.readObject();
		ois.close();
		list.add(wpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/warning.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		write1();
		write2();
		write3();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/warning.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Warningpo> list = (List<Warningpo>) ois.readObject();
		ois.close();
		
	}

	public boolean in(InStoringpo wpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
		ois.close();
		list.add(wpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}

	public boolean out(OutStoringpo opo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/outstock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<OutStoringpo> list = (List<OutStoringpo>) ois.readObject();
		ois.close();
		list.add(opo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/outstock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}

	public boolean initialize() throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
		return true;
	}

}
