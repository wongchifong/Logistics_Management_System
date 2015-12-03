package data.reformdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dataservice.financialmandataservice.FinancialmanService;
import po.bushallsalmanpo.CashReceiveOrderpo;
import po.financialmanpo.Accountpo;
import po.financialmanpo.CostOrderpo;
import po.financialmanpo.IncomeInputpo;
import po.financialmanpo.RecieveListpo;

public class PaymentListIO implements FinancialmanService {

	public CostOrderpo search(String ID) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/PaymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
		System.out.println("find");
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getID().equals(ID))
				return list.get(i);
		}
		return null;
	}

	public boolean writeOrder(CostOrderpo cpo) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/java/data/save/PaymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			if(list.get(i).getID().equals(cpo.getID()))
//				return false;
//		}
		list.add(cpo);
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/paymentList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		return true;
	}
	
	
	public static void write() throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("src/main/java/data/save/PaymentList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> l = new ArrayList<String>();
		oos.writeObject(l);
		oos.close();
	}
	public static void main(String[] args) throws Exception {
		write();
		FileInputStream fis = new FileInputStream("src/main/java/data/save/PaymentList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<CostOrderpo> list = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		for(int i = 0 ; i < list.size() ; i++){
//			System.out.println(list.get(i).getExpressType().toString() + list.get(i)
//			.getPackingType().toString());
//		}
	}

	public boolean writeOrder2(IncomeInputpo incomeInputpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAccount(Accountpo accountpo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CashReceiveOrderpo[] SearchByMes(String y, String m, String d, String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CashReceiveOrderpo[] SearchReceive(String text, String text2, String text3, String text4, String text5,
			String text6) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CostOrderpo[] SearchPay(String year1, String month1, String day1, String year2, String month2,
			String day2)
			throws Exception {
		// TODO Auto-generated method stub
		try{
//			System.out.println("laile ");
			FileInputStream fis = new FileInputStream("src/main/java/data/save/PaymentList.txt");
//			System.out.println("?");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<CostOrderpo> result = (List<CostOrderpo>) ois.readObject();
		ois.close();
//		System.out.println("??");
		int k=0;
//		System.out.println("q");
		for(int i=0;i<result.size();i++){
//			System.out.println("66");
			if(Integer.parseInt(result.get(i).dvo.year)>=Integer.parseInt(year1)&&Integer.parseInt(result.get(i).dvo.mouth)>=Integer.parseInt(month1)&&Integer.parseInt(result.get(i).dvo.day)>=Integer.parseInt(day1)&&
					Integer.parseInt(result.get(i).dvo.year)<=Integer.parseInt(year2)&&Integer.parseInt(result.get(i).dvo.mouth)<=Integer.parseInt(month2)&&Integer.parseInt(result.get(i).dvo.day)<=Integer.parseInt(day2)){
				System.out.println("---");
                    k++;
			}
		}
		CostOrderpo[] sp = new CostOrderpo[k];
//		System.out.println("???");
			int p =0;
		for(int i=0;i<result.size();i++){
			if(Integer.parseInt(result.get(i).dvo.year)>=Integer.parseInt(year1)&&Integer.parseInt(result.get(i).dvo.mouth)>=Integer.parseInt(month1)&&Integer.parseInt(result.get(i).dvo.day)>=Integer.parseInt(day1)&&
					Integer.parseInt(result.get(i).dvo.year)<=Integer.parseInt(year2)&&Integer.parseInt(result.get(i).dvo.mouth)<=Integer.parseInt(month2)&&Integer.parseInt(result.get(i).dvo.day)<=Integer.parseInt(day2)){
				sp[p]=result.get(i);
				p++;
			}
		}
//		System.out.println("????");
		return sp;
		}catch(Exception e){
			e.printStackTrace();
		} 
	return null;
	}



}
