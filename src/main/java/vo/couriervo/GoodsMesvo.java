/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.couriervo;

/**
 *
 * @author user
 */
public class GoodsMesvo {
    
    public int number_of_goods;
    public String name;
    public double weight;
    public double volume;
    
    public GoodsMesvo(int num, String n, double w, double v){
        number_of_goods = num;
        name = n;
        weight = w;
        volume = v;
    }
    
}
