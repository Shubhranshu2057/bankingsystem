package services.admin;

import entity.accountsuse;

import java.util.Scanner;

public class deductmoney {
    public void  deduct(accountsuse[] accountdb, int accountcount){
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Account No:");
        int accountno= sc.nextInt();
        System.out.println("Enter The amount:");
        float amount = sc.nextFloat();
        for(int i=0;i<accountcount;i++){
            if(accountdb[i].getAccountno()==accountno){
                accountdb[i].setBalance(accountdb[i].getBalance()-amount);
                System.out.println("Successfully Deducted!");
                return;
            }
        }
        System.out.println("No account Found!");
    }
}
