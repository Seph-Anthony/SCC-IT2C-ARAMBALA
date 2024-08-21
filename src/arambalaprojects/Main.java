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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Grade np = new Grade();
//        
//        
//        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student Id", "Name", "Prelim","Midterm","Prefinal","Final","Average","Remarks");
//        
//        
//        np.addGrade(10011, "Mike", 1.0, 1.0, 1.0, 1.0);
//        np.viewGrade();
//        
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Product ID", "Name", "Price","Sold","Stock","Profitl","Status","TEP");
        Product rr = new Product ();
        rr.addProduct(10011, "Soap", 20.00 , 30, 30);
        rr.viewProduct();
        
       
        
        
        
        
        
        
        
        
        
    }
    
}
