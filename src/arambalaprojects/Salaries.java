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
public class Salaries {
    
    String name;
    int id;
    double rate, work, deduc;
    double ts;
    double p;
    public void addsalary(int id, String name, double rate, double work, double deduc){
        
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.work = work;
        this.deduc = deduc;
        
        
    }
    
    public void showsalary(){
        
       double gross = this.work*this.rate;
        double net = gross - this.deduc;
      this.ts = gross;
        this.p = net;
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f \n ", this.id, this.name, this.rate,this.work, gross, this.deduc, net );
     
        

    }
    
    public void editemployee(Salaries ha[], int ids, int current){
        Scanner in = new Scanner (System.in);
        for(int i = 0; i<current; i++){
        if(ha[i] != null && ha[i].id == ids){
            System.out.print("Enter new Rate(Hour): ");
            double rate1 = in.nextDouble();
            ha[i].rate = rate1;
            
            System.out.print("Enter new Hours Worked: ");
            double hour1 = in.nextDouble();
            ha[i].work = hour1;
            
            System.out.print("Enter new Total Deduction: ");
            double deduction1 = in.nextDouble();
            ha[i].deduc = deduction1;
            
        }
        }
        
    }
         
    
    
    
}
