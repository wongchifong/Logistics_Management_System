/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.couriervo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Personvo implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -1735687075842741650L;
	/**
	 * 
	 */
	public String name;
    public String address;
    public String company;
    public String telephone;
    public String phone;
    
    public Personvo(String n, String a, String c, String t, String p){
        name = n;
        address = a;
        company = c;
        telephone = t;
        phone = p;
    }
    
}
