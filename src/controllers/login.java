package controllers;

import entity.accountsuse;
import entity.cardacces;
import entity.trxacces;

import java.util.Scanner;

public class login {
    public float balanace(int i,accountsuse[] accountdb){
        float bal = accountdb[i].getBalance();
        return bal;
    }
    public void logins(int accountCount, accountsuse[] accountdb, int trxcount, int trxidgen, trxacces[] trxdb, cardacces[] cardb,String code) {
        Boolean found =false;
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Your Username:");
        String username = sc.next();
        System.out.println("Enter Your Password:");
        String password = sc.next();
        for (int i = 0; i < accountCount; i++) {
            String usernamedb = accountdb[i].getUsername();
            String userpassdb = accountdb[i].getPassword();
            int useraccount = accountdb[i].getAccountno();
            String userhname = accountdb[i].getHname();

            //SuccessFull login
            if (usernamedb.equals(username) && userpassdb.equals(password)) {
                if (accountdb[i].getAttempts() >= 3) {
                    System.out.println("Account Blocked Retry After 24 Hours Or contact support!");
                    return;
                }
                System.out.println("SuccessFull Logging!");
                found = true;
                home homes = new home();
                homes.sar(usernamedb, userhname, useraccount, accountdb, accountCount, i,trxcount,trxidgen,trxdb,cardb,code);

            }
            // invalid password with 3 times blocked
            else if (usernamedb.equals(username)) {
                accountdb[i].setAttempts(accountdb[i].getAttempts() + 1);
                if (accountdb[i].getAttempts() >= 3) {
                    System.out.println("Account Blocked Retry After 24 Hours Or contact support!");
                   return;
                }
                System.out.println("Incoorect Password!");
                return;

            }
        }
        if(!found){
            System.out.println("Username Invalid!");
            return;
        }
    }
}
