/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arambalaprojects;

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
    
    
}
