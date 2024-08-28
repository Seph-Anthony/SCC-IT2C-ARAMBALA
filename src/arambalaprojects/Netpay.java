/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arambalaprojects;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author SCC-COLLEGE
 */
public class Netpay {
    
    public void pay (){
        Scanner input = new Scanner (System.in);
        
         String fname, mname;
        
        int age; 
        double ratehour, deduc, hourwork, sum, min; 
        
          System.out.print("\nEnter your name: ");
        fname=input.nextLine();
         mname=input.nextLine();
        System.out.print("\nEnter your age: ");
         age=input.nextInt();
         System.out.print("\nEnter Rate per Hour: ");
         ratehour=input.nextDouble();
         
         
         System.out.print("\nEnter total hours worked: ");
         
          hourwork=input.nextDouble();
         System.out.print("\nEnter total deductions: ");
         deduc=input.nextDouble();
         
         sum = ratehour * hourwork;
         
         System.out.println("\n______________________");
         System.out.println("\nSLIPT DETAILS");
         System.out.println("\n______________________");
         
         System.out.println("\nDate: August 14, 2024");
         
         System.out.println("\nName: "+fname+ " "+mname);
         
         System.out.println("\nAge: "+age);
         
         
         
         System.out.println("\nTotal Gross: "+sum);
           min = sum - deduc;
         
         System.out.println("\nTotal Deduction: "+deduc);
         
         System.out.println("\n______________________");
           
         
                   min = sum - deduc;
                   
                   
                  double money = min;
               double money2 = sum;
                  NumberFormat formatter = NumberFormat.getCurrencyInstance ();
                  String moneyString = formatter.format(money);
                  String money2String = formatter.format(money2);
             
                       
         System.out.println("\nTotal Gross: "+money2String);
           
         
                  
                      System.out.println("\nNet Pay: "+moneyString);
        
        
        
    }
    
    
}
