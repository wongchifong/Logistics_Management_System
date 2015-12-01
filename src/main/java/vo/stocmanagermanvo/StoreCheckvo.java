package vo.stocmanagermanvo;

import java.io.Serializable;

import po.stockmanagermanpo.InStoringpo;

public class StoreCheckvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5207751139013560124L;
    private InStoringpo io;
    
    public StoreCheckvo(InStoringpo io){
    	this.io=io;
    }
    
    public String getBianhao(){
    	return io.getKuaidi().bianhao;
    }
    
    public String getDestination(){
    	return io.getKuaidi().destination;
    }
    
    public String getQuhao(){
    	return io.getWeizhi().quhao;
    }
    
    public String getPaihao(){
    	return io.getWeizhi().paihao;
    }
    
    public String getJiahao(){
    	return io.getWeizhi().jiahao;
    }
    
    public String getWeihao(){
    	return io.getWeizhi().weihao;
    }
}