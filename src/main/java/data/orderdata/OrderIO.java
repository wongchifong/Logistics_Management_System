package data.orderdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.courierdataservice.CourierService;
import dataservice.otherdataservice.ExpressService;
import po.courierpo.CourierOrderpo;
import po.courierpo.PriceAndTimepo;
import po.courierpo.ReceiveOrderpo;

public class OrderIO implements CourierService, ExpressService {
	
	public boolean writeOrder(CourierOrderpo cpo) throws Exception {
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
	
	public CourierOrderpo search(String ID) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		System.out.println("find"+"22222");
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
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
			.getPackingType().toString());
		}
	}

	public PriceAndTimepo query() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean writeReceive(ReceiveOrderpo r) {
		// TODO Auto-generated method stub
		return false;
	}

}
