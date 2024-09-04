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
public class Salary {
    
    public void inputsalary(){
        
        Scanner in = new Scanner (System.in);
        
         Salaries[] ha = new Salaries[100];
         
         
         System.out.println("Enter the number of Employees: ");
         int num = in.nextInt();
         double totalrequ=0;
         double totaldeduction=0;
         double release = 0;
          for (int i=0; i < num; i++){
           
              System.out.printf("Details of EMP: %d\n",i+1);
              
              System.out.print("ID: ");
              int id=in.nextInt();
              System.out.print("Name: ");
              String name=in.next();
                System.out.print("Rate(Hour): ");
              double rate=in.nextDouble();
                    System.out.print("Hours Worked: ");
              double work=in.nextDouble();
                    System.out.print("Total Deduction: ");
              double deduc=in.nextDouble();
              
              
              totaldeduction += deduc;
              ha[i]= new Salaries();
              
              ha[i].addsalary(id, name, rate, work, deduc);
              
          }
          System.out.println("______________________________________________________________________________________________________\n");
          
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n","ID","Name","Rate","Hours","Gross","Deductions","NetPay");
          
          for (int i=0; i<num; i++){
              ha[i].showsalary();
             
             totalrequ+=(ha[i].ts);
             
   release +=(ha[i].p);
              
          }
        System.out.println("___________________________________________\n");
          System.out.printf("Total Salary for Request: %.2f\n",totalrequ);
      
          System.out.printf("Total Deductions:%.2f\n",totaldeduction);
        
          System.out.printf("Total Salary to release:%.2f\n",release);
          
           
              
              
        
    }
    
}
