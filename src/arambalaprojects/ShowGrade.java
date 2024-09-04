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
        
   System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f \n ", this.id, this.name, this.pr,this.mid, this.prf, this.fi );
        
        
    }
    
    
    
}
