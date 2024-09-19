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
public class ShowGrade {
    String name;
    int id;
    double pr, mid, prf, fi;
    
    
    public void addGrade(int id, String name, double pr, double mid, double prf, double fi ){
       this.id = id;
       this.name = name;
       this.pr = pr;
       this.mid = mid;
       this.prf = prf;
       this.fi = fi;
        
        
    }
    
    public void showGrade(){
          double ave = (this.pr + this.mid + this.prf + this.fi) / 4 ;
        String remarks = (ave>3.0) ? "Failed": "Passed";
        
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student Id", "Name", "Prelim","Midterm","Prefinal","Final","Average","Remarks");
        
        
  System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n ", this.id, this.name, this.pr,this.mid, this.prf, this.fi, ave, remarks );
        
        
    }
    
    
    public  void editgrade(ShowGrade dy[], int current, int id){
    Scanner in = new Scanner (System.in);
        for(int i = 0; i<=current; i++){
           if(dy[i] != null && dy[i].id == id){
               System.out.print("Enter New Prelim Grade: ");
               double pr1= in.nextDouble();
               dy[i].pr = pr1;
               
                System.out.print("Enter New Midterm Grade: ");
               double mid1= in.nextDouble();
               dy[i].mid = mid1;
               
                System.out.print("Enter New PreFinal Grade: ");
               double prf1= in.nextDouble();
               dy[i].prf = prf1;
               
                System.out.print("Enter New Final Grade: ");
               double fi1= in.nextDouble();
               dy[i].fi = fi1;
                              

               
           }
            
        
         
         
     }   
        
        
    }
    
    
    
}
