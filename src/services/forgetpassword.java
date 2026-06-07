package services;

import entity.accountsuse;

import java.util.Scanner;

public class forgetpassword {
    public void forget(int accountCount, accountsuse[] accountdb){
        Scanner sc = new Scanner(System.in);
        Boolean session =false;
        System.out.println("Enter Your Username:");
        String userforget = sc.next();
        System.out.println("Enter Your DOB Formate: DD/MM/YYYY");
        String userdob = sc.next();


        //Account Details Checker
        for(int i=0;i<accountCount;i++){
            //Check for coorect info and acccount not be blocked
            if(accountdb[i].getUsername().equals(userforget)&&accountdb[i].getDOB().equals(userdob)&&accountdb[i].getAttempts()<3){
                System.out.println("Enter Your New Password:");
                String newpassword = sc.next();
                accountdb[i].setPassword(newpassword);
                session =true;
                break;
            } // Account Blocked
            else if(accountdb[i].getUsername().equals(userforget)&&accountdb[i].getAttempts()>=3){
                System.out.println("Sorry Your Account Is Blocked First Unblock It !");
                session =false;
                break;
            } //Account Date of birth invalid
            else if(accountdb[i].getUsername().equals(userforget)){
                System.out.println("Invalid DateOfBirth!");
                session = false;
                break;
            }// No user Found Or Invalid username
            else{
                System.out.println("Invalid Username!");
                session  =false;
                break;
            }
        } // Break Session immediately For Wrong infos
        if(!session){
          return;
        }
        System.out.println("Your Password Has Benn Succesfully Updated!");

        return;
    }
}
