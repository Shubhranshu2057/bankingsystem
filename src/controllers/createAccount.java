package controllers;

import entity.accountsuse;

import java.util.Scanner;

public class createAccount {
    public boolean create(int accountCount, accountsuse[] accountdb,String code,int accgen){
        Scanner sc = new Scanner(System.in);
        boolean isuserexist =false;
        System.out.println("Enter First Name:");
        String FirstName = sc.next();
        System.out.println("Enter Last Name:");
        String LastName = sc.next();
        System.out.println("Enter DateOfBirth Fromate DD/MM/YYYY:");
        String dob = sc.next();
        System.out.println("Enter UserName:");
        String userName = sc.next();


        // check For user alrady exists
        for(int i=0;i<accountCount;i++) {
            String userdb = accountdb[i].getUsername();
            if (userdb.equals(userName)) {
                System.out.println("Username Already Exists Please Set Different name");
                isuserexist =true;
                break;
            }
        }
        if(isuserexist){
            return false;
        }
        System.out.println("Enter Your PassWord:");
        String Password = sc.next();
        String temp = code;
        int accountno = accgen;
        accountdb[accountCount] = new accountsuse(FirstName,LastName,dob,userName,Password,0,"user",temp,accountno,FirstName+LastName,1000);
        System.out.println("Thanks Created! Now You can Use Our Servieces! Note ! Backup THe Ucode For Future Unblocks:"+temp);
        return true;
    }

}
