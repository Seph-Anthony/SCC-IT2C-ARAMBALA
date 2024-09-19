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
         int action;
         String choose;
         double totalrequ = 0;
         double release = 0;
         double totaldeduction = 0;
         int num=0;
         do{
             
             
             System.out.println("|Employee Status|");
             System.out.println("____________________________");
             System.out.println("1. ADD");
             System.out.println("2. VIEW");
             System.out.println("3. UPDATE");
             System.out.println("4. EXIT");
       
             System.out.print("Enter action: ");
             action = in.nextInt();
             
                while (action>4){
            System.out.print("Invalid Action\n Try Again: ");
            action = in.nextInt();
        }
                
                switch (action){
                case 1:
             
         System.out.print("Enter the number of Employees: ");
          num = in.nextInt();
       
          for (int i=0; i < num; i++){
           
              System.out.printf("Details of EMP: %d\n",i+1);
              
              int id;
              while (true){
              System.out.print("ID: ");
               id=in.nextInt();
               if(!dupid(ha, id, i))break;{
                  System.out.println("|ID ALREADY EXISTED|");
                  
              }
              }
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

        
          break;
          
          case 2:
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
          
           break;
           
           case 3:
                System.out.println("Enter the ID you want to update");
                int ids = in.nextInt();
                
                Salaries sal = new Salaries();
                sal.editemployee(ha, ids, num);
                break;
         
                
                
           case 4:
               System.out.println("Program Exiting. . .");
               System.exit(0);
               break;
                }
                
                
           
           System.out.println("Do you want to make another transaction (yes|Yes)");
           choose = in.next();
         } while(choose.equals("yes") || choose.equals("Yes"));
        
    }
    public boolean dupid(Salaries ha[], int id, int current){
        for(int i = 0; i<current; i++){
            if(ha[i]!=null && ha[i].id == id){
                
                return true;
            }
            
            
        }
        
        
        return false;
    }
    
    
    
}
