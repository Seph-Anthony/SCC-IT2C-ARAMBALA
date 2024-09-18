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
public class InputGrade {
    
    
    
   

    public  void editgrade(ShowGrade dy[], int current, int id){
    Scanner in = new Scanner (System.in);
        for(int i = 0; i<=current; i++){
           if(dy[i] != null && dy[i].id == id){
               System.out.println("Enter New Prelim Grade");
               double pr1= in.nextDouble();
               dy[i].pr = pr1;
               
                System.out.println("Enter New Midterm Grade");
               double mid1= in.nextDouble();
               dy[i].mid = mid1;
               
                System.out.println("Enter New PreFinal Grade");
               double prf1= in.nextDouble();
               dy[i].prf = prf1;
               
                System.out.println("Enter New Final Grade");
               double fi1= in.nextDouble();
               dy[i].fi = fi1;
                              

               
           }
            
        
         
         
     }   
        
        
    }
    public void inputgrade(){
        
        
        
           Scanner in = new Scanner (System.in);
      
        
        ShowGrade[] dy = new ShowGrade[100];
int num =0;
String op;



do{
        System.out.println("Welcome to Grading App");
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        
            
       
        System.out.println("Enter Action: ");
        int option =in.nextInt();
        
        while (option>5){
            System.out.println("Invalid Action\n Try Again: ");
            option = in.nextInt();
        }
        
        switch(option){
            
            case 1:
                System.out.print("Enter number of Students: ");
        num = in.nextInt();
        
        for (int i=0; i < num; i++){
            System.out.println("Enter details for Student "+(i+1)+": ");
            
           
            
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String name =in.next();
            System.out.print("Prelim: ");
            double pr = in.nextDouble();
            System.out.print("Midterm: ");
            double mid = in.nextDouble();
            System.out.print("Prefinal: ");
            double prf=in.nextDouble();
            System.out.print("Final: ");
            double fi = in.nextDouble();
            
            dy[i]=new ShowGrade();
            
            dy[i].addGrade(id, name, pr, mid, prf, fi);
            
        }
                break;
                
                
            case 2:
                
                  for (int i=0; i < num; i++){
            
            dy[i].showGrade();
            
                
               
        }
        break;
   
            case 3:
                
                System.out.println("Enter the ID to update: ");
               int ids = in.nextInt();
                System.out.println(""+ids);
                editgrade(dy, num, ids);
                
                break;
                
    }
        
            System.out.println("Do you want to continue (yes|Yes):" );
            op = in.next();
         }while(op.equals("Yes") ||op.equals("yes"));
    
    }
}
