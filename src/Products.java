/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public abstract class Products {
    int stock;
    double price, total;
    JOptionPane JOptPane = new JOptionPane();
    
    public Products(){}
    
    public abstract int stockRemain(int a);
    
    public abstract double calcPrice(int a);
    
    public abstract int getQuantity();
    
}
