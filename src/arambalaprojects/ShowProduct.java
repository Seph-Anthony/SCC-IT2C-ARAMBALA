/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arambalaprojects;

/**
 *
 * @author SCC-COLLEGE
 */
public class ShowProduct {
    
    int id, sold, stock;
    String name;
    double price;
    
    public void addProduct(int id, String name, double price,int sold, int stock){

this.id = id;
this.name = name;
this.sold = sold; 
this.stock = stock;
this.price = price;


}
    public void viewProduct(){
        
        double profit = this.sold * this.price;
        String stat = (this.sold<1)? "Out of Stock":"Available";
        double tep = this.stock *this.price;
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %10s %-10.2f  \n  ", this.id, this.name, this.price, this.sold, this.stock, profit, stat, tep);
        
    }
    
}
