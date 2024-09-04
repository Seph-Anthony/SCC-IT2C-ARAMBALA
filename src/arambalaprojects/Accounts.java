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
public class Accounts {
    int id;
    String fname, lname, email, user, pass; 
    public void addacc(int id, String fname, String lname, String email, String user, String pass){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.user= user;
        this.pass = pass;
        
        
    }
    public void  viewacc(){
        
         System.out.printf("%-15d %-15s %-15s %-15s %-15s %-15s\n",this.id,this.fname,this.lname,this.email,this.user,this.pass);
        
    }
    
}
