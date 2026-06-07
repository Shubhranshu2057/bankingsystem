package services;

import entity.accountsuse;

import java.util.Scanner;

public class changepass {
    public void changepassword(accountsuse[] accountdb,int curentaccount){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter you Old Password:");
        String pass = sc.next();
        if(pass.equals(accountdb[curentaccount].getPassword())){
            if(accountdb[curentaccount].getAttempts()<=3){
                System.out.println("Enter New Password:");
                String newpass =sc.next();
                accountdb[curentaccount].setPassword(newpass);
                System.out.println("Successful Changed!");
                return;
            }else{
                System.out.println("Sorry Our Account is blocked Please Logout And unblock");
                return;
            }

        }else{
            if(accountdb[curentaccount].getAttempts()>=3){
                System.out.println("Your Account is blocked PLease Unblock it!");
                return;
            }
            accountdb[curentaccount].setAttempts(accountdb[curentaccount].getAttempts()+1);
            System.out.println("Your Old Password Incorrect!");
            return;
        }

    }
}
