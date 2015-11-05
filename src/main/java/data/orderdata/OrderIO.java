package data.orderdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import po.courierpo.CourierOrderpo;

public class OrderIO {
	
	public static boolean write(CourierOrderpo cpo) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).getID().equals(cpo.getID()))
				return false;
		}
		list.add(cpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/courierOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	public static CourierOrderpo search(String ID) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		System.out.println("find");
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getID().equals(ID))
				return list.get(i);
		}
		return null;
	}
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/courierOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
			.getPackingType().toString());
		}
	}

}
