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
public class Main {

    public static void main(String[] args) {
         Account acc = new Account ();
        InputGrade grade = new InputGrade();
        Salary sal = new Salary();
        InputProduct pro = new InputProduct();
       
        Scanner in = new Scanner (System.in);
    
        
        System.out.println("||Select a number to run a specific class||\n");
        System.out.println("1. Salary");
        System.out.println("2. Product");
        System.out.println("3. Grades");
        System.out.println("4. Account");
        System.out.print("Input: ");
        int select = in.nextInt();
        
        switch (select){
            
            case 1:
                sal.inputsalary();
                
                
                
                break;
            case 2:
                
                pro.inputprod();
                break;
                
            case 3:
                grade.inputgrade();
            break;
            
            case 4:
                acc.inputacc();
                
                break;
                
            default :
                System.out.println("||Please enter a correct number!||");
                break;
                
               
        }
         
  
//        
      
              


        
//   
//        
//        
//        

//Netpay pay = new Netpay ();
//
//pay.pay();
//       

        
        
        
        
        
        
        
        
        
 
        
    }
    
}
