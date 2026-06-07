package services;

import entity.accountsuse;

import java.util.Scanner;

public class accountublock {
    public void ublock(int accountCount, accountsuse[] accountdb,String code){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your UserName:");
        String ublock = sc.next();
        System.out.println("Enter Your Password:");
        String upassword = sc.next();
        System.out.println("Enter Verify Token Which USed While Creating Account!:");
        String ucode = sc.next();
        String tempnew = code;
        //U code logic
        for(int i=0;i<accountCount;i++){

            // Uc Code checker with code auth successful
            if(accountdb[i].getUsername().equals(ublock)&&accountdb[i].getPassword().equals(upassword)&&accountdb[i].getUcode().equals(ucode)&&accountdb[i].getAttempts()>=3){
                accountdb[i].setUcode(tempnew);
                accountdb[i].setAttempts(0);
                System.out.println("Your Account Has been Successful Unblocked!");
                System.out.println("Note! New Ucode:"+tempnew);
                return;
            }
            //UC code  invalid
            else if(accountdb[i].getUsername().equals(ublock)&&accountdb[i].getPassword().equals(upassword)){
                System.out.println("Your Ucode is Invalid Please Contact Admin!");
                return;
            }
            // UC code Account password Invalid
            else if(accountdb[i].getUsername().equals(ublock)){
                System.out.println("Your Password is Invalid");
                return;
            }
            // UC code Account username Invalid
            else {
                System.out.println("Invalid Username");
                return;
            }

        }
    }
}
