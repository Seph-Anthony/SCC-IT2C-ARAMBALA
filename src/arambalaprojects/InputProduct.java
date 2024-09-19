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
        
       int num =0;
        String another;
        do{
          System.out.println("Welcome to Grading App");
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Exit");
        
        
        System.out.print("Enter Action: ");
       int action = in.nextInt();
        
        while(action>4){
            System.out.print("Not Valid! \n Try Again:  ");
            action = in.nextInt();
        }
        
        switch(action){
        case 1:
            
         System.out.print("Enter the number of Products: ");
          num = in.nextInt();
         
         for(int i = 0; i<num; i++){
             
             System.out.printf("Details %d \n",i+1);
             
             
             int id;
             while (true){
             System.out.print("Product ID: ");
             id = in.nextInt();
             if(!dupid(prod, id, i))break;{
                 System.out.println("ID ALREADY EXISTED! \n Try again");
                 
             }
             
             }
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
         
         break;
//       
        
        case 2:
         for(int i = 0; i<num; i++){
             prod[i].viewProduct();
             
            
         }
          break;
             case 3:
                 System.out.print("Enter the ID you want to update: ");
                 int ids = in.nextInt();
                 ShowProduct pr = new ShowProduct();
                 pr.editprod(prod, ids, num);
             break;
             
             
             case 4:
                 System.out.println("Program Exiting. . .");
                 System.exit(0);
                 break;
        }
        
            System.out.println("Do you want to make another transaction(yes|Yes):");
            another = in.next();
         }while (another.equals("yes") || another.equals("Yes")); 
        
        }
    
    public boolean dupid(ShowProduct prod[], int id, int current){
        for(int i = 0; i<current; i++){
            if(prod[i] != null && prod[i].id == id){
                return true;
            }
            
        }
        
        
        return false;
    }
    }


