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
        System.out.println("4. Exit");
        
            
       
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
            
           
            int id;
            while(true){
            System.out.print("ID: ");
             id = in.nextInt();
             if(!dupid(dy, id, i))break;{
                System.out.println("!ID ALREADY EXISTED!"); 
                
            }
            }
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
                ShowGrade edit = new ShowGrade();
                edit.editgrade(dy, num, ids);
                
                break;
                
            case 4:
                System.out.println("Program Exiting. . .");
                System.exit(0);
                break;
                
    }
        
            System.out.println("Do you want to continue (yes|Yes):" );
            op = in.next();
         }while(op.equals("Yes") ||op.equals("yes"));
    
    }
    public boolean dupid(ShowGrade dy[], int id, int current){
        for (int i = 0; i <current; i++){
            
            if(dy[i]!= null && dy[i].id == id){
                return true;
            }
            
        }
        
        return false;
    }
}
