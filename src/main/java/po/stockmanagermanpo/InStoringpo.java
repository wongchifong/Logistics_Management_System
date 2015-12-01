package po.stockmanagermanpo;

import java.io.Serializable;

import vo.stocmanagermanvo.Instockvo;
import vo.stocmanagermanvo.Kuaidivo;
import vo.stocmanagermanvo.Weizhivo;

public class InStoringpo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3668577120125954843L;
    final Kuaidipo kuaidi;
    final Weizhipo weizhi;
	
	public InStoringpo(Kuaidivo kd,Weizhivo wz) {
		// TODO Auto-generated constructor stub
		kuaidi = new Kuaidipo(kd.year,kd.month,kd.day,kd.bianhao,kd.destination);
		weizhi = new Weizhipo(wz.quhao,wz.paihao,wz.jiahao,wz.weihao);
		
	}
	
	public Kuaidipo getKuaidi(){
		return kuaidi;
	}
	
	public Weizhipo getWeizhi(){
		return weizhi;
	}

	


	

}