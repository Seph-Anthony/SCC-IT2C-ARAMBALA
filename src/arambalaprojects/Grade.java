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
public class Grade {
    
    int id;
    String name;
    double p, m, pf, f;
    
    public void addGrade(int id, String name, double p, double m, double pf, double f){
        
        this.name =name;
        this.id = id;
        this.p = p;
        this.m = m;
        this.pf = pf;
        this.f =f;
        
        
    }
    
    public void viewGrade(){
        
        
        double ave = (this.p + this.m + this.pf + this.f) / 4 ;
        String remarks = (ave>3.0) ? "Failed": "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n ", this.id, this.name, this.p,this.m, this.pf, this.f, ave, remarks );
        
        
    }
}
