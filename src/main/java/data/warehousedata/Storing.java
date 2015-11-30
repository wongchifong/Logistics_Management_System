package data.warehousedata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dataservice.stockmanagermandataservice.StockManagermanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.ClExamineType;
import po.courierpo.CourierOrderpo;
import po.generalmanagepo.Institutionpo;
import po.stockmanagermanpo.InStoringpo;
import po.stockmanagermanpo.IsExamineType;
import po.stockmanagermanpo.OsExamineType;
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

	public boolean in(InStoringpo ipo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
		ois.close();
		if(ipo.getExamineType() == IsExamineType.NOApproval || 
                ipo.getExamineType() == IsExamineType.NotApprove){
            return false;
		}
		list.add(ipo);
		FileInputStream fis1 = new FileInputStream("src/main/java/data/save/warning.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		@SuppressWarnings("unchecked")
		List<Warningpo> list1 = (List<Warningpo>) ois1.readObject();
		//System.out.println(4*Integer.parseInt(list1.get(0).warning)/100);
		if(list.size()>=1000*Integer.parseInt(list1.get(0).warning)/100){
			JOptionPane.showMessageDialog(null, "库存数量已超过警戒比例", "警告！", 
            		JOptionPane.ERROR_MESSAGE);
		}
		ois1.close();
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
		if(opo.getExamineType() == OsExamineType.NOApproval || 
                opo.getExamineType() == OsExamineType.NotApprove){
            return false;
		}
		list.add(opo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/outstock.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		FileInputStream fis1 = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		@SuppressWarnings("unchecked")
		List<InStoringpo> list1 = (List<InStoringpo>) ois1.readObject();
		for(int i=0;i<list1.size();i++){
			if(((list1.get(i)).getID()).equals(opo.getID())){
				list1.remove(i);
				i--;
				//System.out.println("Delete ");
			}}
		ois1.close();
        FileOutputStream fos1 = 
				new FileOutputStream("src/main/java/data/save/instock.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(list1);
		oos1.close();

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

	public List<InStoringpo> search() throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/instock.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<InStoringpo> list = (List<InStoringpo>) ois.readObject();
		ois.close();
		System.out.println("find");
//		for(int i = 0; i < list.size(); i++){
////			if(list.get(i).getID().equals(ID))
//				return list.get(i);
//		}
		return list;
	
	}

}
