package data.safetydata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.administratordataservice.AdministratorService;
import po.administratorpo.UserMespo;



public class AddaccountIO implements AdministratorService {
	public UserMespo search(String ID) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/UserMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List< UserMespo> list = (List< UserMespo>) ois.readObject();
		ois.close();
		System.out.println("find");
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getID().equals(ID))
				return list.get(i);
		}
		return null;
	}

	public boolean writeOrder( UserMespo cpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/UserMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List< UserMespo> list = (List< UserMespo>) ois.readObject();
		ois.close();
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).getID().equals(cpo.getID()))
				return false;
		}
		list.add(cpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/UserMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/UserMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/UserMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List< UserMespo> list = (List< UserMespo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
//			.getPackingType().toString());
//		}
	}
}
