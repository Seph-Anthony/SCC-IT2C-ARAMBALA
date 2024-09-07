/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arambalaprojects;
import java.util.Scanner;
/**
 *
 * @author SCC-COLLEGE
 */
public class InputProduct {
    public void inputprod(){
        Scanner in = new Scanner (System.in);
        ShowProduct prod[ ] = new ShowProduct[100];
        
        
         System.out.print("Enter the number of Products: ");
         int num = in.nextInt();
         
         for(int i = 0; i<num; i++){
             
             System.out.printf("Details %d \n",i+1);
             
             System.out.print("Product ID: ");
             int id = in.nextInt();
             
             System.out.print("Product Name: ");
       String name = in.next();
             
                System.out.print("Product Price: ");
             double  price = in.nextDouble();
             
                System.out.print("Product Sold: ");
             int sold = in.nextInt();
             
             System.out.print("Product Stock: ");
             int stock = in.nextInt();
             
             prod[i] = new ShowProduct();
             prod[i].addProduct(id, name, price, sold, stock);
         }
         
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Product ID", "Name", "Price","Sold","Stock","Profit","Status","TEP");
        
           
         for(int i = 0; i<num; i++){
             prod[i].viewProduct();
         }
         }
    }
    

