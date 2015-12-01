package data.orderdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.courierdataservice.CourierService;
import dataservice.generalmanagerdataservice.OrderExamineService;
import dataservice.otherdataservice.ExpressService;
import po.courierpo.CourierOrderpo;
import po.courierpo.ExamineType;
import po.courierpo.PriceAndTimepo;
import po.courierpo.ReceiveOrderpo;

public class OrderIO implements CourierService, ExpressService,OrderExamineService {
	
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
		cpo.getHistory().add("快递员已揽件");
		System.out.println(cpo.date);
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

	public boolean writeReceive(ReceiveOrderpo r) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
			
			
			CourierOrderpo cpo = null;
			for(int i = 0 ; i < list.size() ; i++){
				if(list.get(i).getID().equals(r.ID))
					cpo = list.get(i);
			}
			ois.close();
			System.out.println(r.ID);
			if(cpo == null) return false;
			if(cpo.rece) return false;
                        if(cpo.getExamineType() == ExamineType.NOApproval || 
                                cpo.getExamineType() == ExamineType.NotApprove)
                            return false;
			cpo.rece = true;
			cpo.getHistory().add("已收件，收件人是" + r.receiver + " , 收件时间是"
					+ r.date.year + "年" + r.date.month + "月" + 
					r.date.day + "日");
			
			FileOutputStream fos = 
					new FileOutputStream("src/main/java/data/save/courierOrder.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public PriceAndTimepo query(PriceAndTimepo p) {
		// TODO Auto-generated method stub
		p.price = 50;
		return p;
	}

	@Override
	public String[] SearchUnchecked() {
		// TODO Auto-generated method stub
		String result [] = null;
		int k=0;
		try{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/courierOrder.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CourierOrderpo> list = (List<CourierOrderpo>) ois.readObject();
		ois.close();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getExamineType().equals(ExamineType.NOApproval))
				result[k]=list.get(i).getID();
		}
	}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
}
