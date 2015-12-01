package data.institutiondata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.bushallsalmandataservice.BushallsalmanService;
import po.bushallsalmanpo.CarLoadingpo;
import po.bushallsalmanpo.CarMespo;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.bushallsalmanpo.ClExamineType;
import po.bushallsalmanpo.CmExamineType;
import po.bushallsalmanpo.CrExamineType;
import po.bushallsalmanpo.DmExamineType;
import po.bushallsalmanpo.DriverMespo;
import po.bushallsalmanpo.ReceiveOrderpo;
import po.bushallsalmanpo.RoExamineType;
import po.bushallsalmanpo.SendOrderpo;
import po.bushallsalmanpo.SoExamineType;
import po.courierpo.ExamineType;


public class BusinessHall implements BushallsalmanService {

	public boolean writeCarloading(CarLoadingpo clpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/carLoading.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CarLoadingpo> list = (List<CarLoadingpo>) ois.readObject();
		ois.close();
		
		list.add(clpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/carLoading.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	public static void write1() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/carLoading.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	private static void write2() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/carMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	private static void write3() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/driverMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	private static void write4() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/cashReceive.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	private static void write5() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/receiveOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	
	private static void write6() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/sendOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}

	public static void main(String[] args) throws Exception {
		write1();
		write2();
		write3();
		write4();
		write5();
		write6();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/carLoading.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CarLoadingpo> list = (List<CarLoadingpo>) ois.readObject();
		ois.close();

	}


	public boolean writeCarMes(CarMespo cmpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/carMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CarMespo> list = (List<CarMespo>) ois.readObject();
		ois.close();
		list.add(cmpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/carMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}

	public boolean writeDriverMes(DriverMespo dmpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/driverMes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<DriverMespo> list = (List<DriverMespo>) ois.readObject();
		ois.close();
		list.add(dmpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/driverMes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}

	public boolean writecash(CashReceiveOrderpo cropo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/cashReceive.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CashReceiveOrderpo> list = (List<CashReceiveOrderpo>) ois.readObject();
		ois.close();
		list.add(cropo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/cashReceive.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}

	public boolean writereceive(ReceiveOrderpo ropo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/receiveOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<ReceiveOrderpo> list = (List<ReceiveOrderpo>) ois.readObject();
		ois.close();
		list.add(ropo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/receiveOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}

	public boolean writesend(SendOrderpo sopo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/sendOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<SendOrderpo> list = (List<SendOrderpo>) ois.readObject();
		ois.close();
		list.add(sopo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/sendOrder.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
}
