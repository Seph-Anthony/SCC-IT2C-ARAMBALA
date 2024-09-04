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
public class Account {
    
    public void inputacc(){
        
        Scanner in = new Scanner (System.in);
        Accounts acc[] = new  Accounts[100];
        
        System.out.print("Enter the number of Accounts: ");
        int num = in.nextInt();
        
        for (int i = 0; i<num; i++){
            System.out.printf("Details: #%d\n",i+1);
            
            int id;
            while(true){
            System.out.print("ID: ");
            id = in.nextInt();
            if(!dupID(acc, id, i))break;{
                System.out.println("ID Already existed. Input Another : ");
                
            }
            }
            
              System.out.print("First Name: ");
            String fname=in.next();
            
            System.out.print("Last Name: ");
            String lname=in.next();
            
            String email;
            while(true){
                System.out.print("Email: ");
                email=in.next();
                if(!dupemail(acc, email, i))break;{
                System.out.println("Email already existed. Input Another: ");
            }
            }
            
            String user;
            while(true){
                System.out.print("Username: ");
                user = in.next();
                if(!dupUser(acc, user, i))break;{
                System.out.println("Username already existed. Input Another");
                
            }
            }
            String pass;
            
            while (true){
            System.out.print("Password: ");
             pass=in.next();
             if(passwordvarify(pass))break;
   
            }
            
                acc[i] = new Accounts();
                acc[i].addacc(id, fname, lname, email, user, pass);
            }
        
         System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n","ID","FirstName","LastName","Email","User","Password");
         
         for (int i = 0; i <num; i++) {
             acc[i].viewacc();
             
         }
            
        }
         public boolean dupID(Accounts [ ] acc, int id, int current){
        for(int i = 0; i<current; i++){
            if (acc[i] != null && acc[i].id == id){
                return true;
            }
            
            
        }
        return false;
    }

public boolean dupemail(Accounts []acc, String email, int current){
for(int i = 0; i<current; i++){
if(acc[i] != null && acc[i].email.equals(email)){
return true;
}


}
return false;
}

public boolean dupUser(Accounts []acc, String user, int current){
    for(int i = 0; i<current; i++){
        if(acc[i] != null && acc[i].user.equals((user))){
            
            return true;
        }
        
    }
    return false;
    
}

public boolean passwordvarify(String password){
        
        if(password.length()<8){
            System.out.println("Password is too short");
            return false;
        }
          if (!password.matches(".*[A-Z].*")) {
              System.out.println("Password must contain atleast 1 capital letter");
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain atleast 1 lower case");
            return false;
        }

        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            System.out.println("Password must contain atleast 1 special character");
            return false;
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must have a number");
            return false;
        }
        String[] fpass = {"admin","password","1234"};
        for (String fp : fpass){
            if(password.toLowerCase().contains(fp)){
                System.out.println("Password is too common");
                return false;
            }
        }
        return true;
    }





        
    }
    
   