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

        
        System.out.print("Enter number of Students: \n");
        int num = in.nextInt();
        
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
       System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student Id", "Name", "Prelim","Midterm","Prefinal","Final","Average","Remarks");
        
        for (int i=0; i < num; i++){
            
            dy[i].showGrade();
            
        }
    }
    
    
}
