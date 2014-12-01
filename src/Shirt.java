/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Shirt extends Products{
    
    public Shirt(){
        super();
        stock = 27;
        price = 18.90;
    }
    
    public int getQuantity(){
        return Integer.parseInt(JOptPane.showInputDialog("Please enter desired amount: "));
    }
    
    public int stockRemain(int a){
        int new_stock = stock - a;
        return new_stock;
    }
    
    public double calcPrice(int a){
        total = a*price;
        return total;
    } 
    
}
