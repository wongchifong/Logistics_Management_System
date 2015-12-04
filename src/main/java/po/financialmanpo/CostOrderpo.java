package po.financialmanpo;

import java.io.Serializable;

import vo.financialmanvo.PaymentInputvo;

public class CostOrderpo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6035340333141173086L;
    final Datepo dvo;
	final String ID;
	final Paypo pay;
	final Tiaomupo tiaomu;
	final Beizhupo beizhu;
	public ExamineType ext;
	public CostOrderpo(PaymentInputvo order){
		System.out.println(order.pay.name+"jdkhfdgf");
		dvo=new Datepo(order.date.year,order.date.mouth,order.date.day);
		ID=order.beizhu.number;
		pay=new Paypo(order.pay.money, order.pay.name, order.pay.account);
		tiaomu=new Tiaomupo(order.tiaomu.yearfee, order.tiaomu.trafficfee, order.tiaomu.salary,
				order.tiaomu.bonus);
		beizhu=new Beizhupo(order.beizhu.moneyyear, order.beizhu.number, order.beizhu.moneymouth);
		ext = ExamineType.NOApproval;
		
	}
	public Datepo getDate(){
		return dvo;
	}
	public String getID(){
		return ID;
	}
	public Paypo getPaymentMes(){
		return pay;
	}
	public Tiaomupo getTiaomu(){
		return tiaomu;
	}
	public Beizhupo getBeizhu(){
		return beizhu;
	}
	public ExamineType getExamineType() {
	        return ext;
	    }

}
