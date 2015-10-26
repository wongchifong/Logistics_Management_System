/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.orderdata;

/**
 *
 * @author user
 */
public class GoodsMes {
    
    public int num;
    public double weight;
    public double volume;
    public String name;
    
    public GoodsMes(int num , double weight , double volume , String name) {
        this.name = name;
        this.num = num;
        this.volume = volume;
        this.weight = weight;
    }
    
}
