package services.admin;

import entity.accountsuse;

import java.util.Scanner;

public class enableaccount {
    public void enable(accountsuse[] accountdb, int accountcount){
        Scanner sc =new Scanner(System.in);
        System.out.println("---Enable Acccount Tool---");
        System.out.println("Enter Account No:");
        int accountno = sc.nextInt();
        for(int i=0;i<accountcount;i++){
            if(accountdb[i].getAccountno()==accountno){
                accountdb[i].setStatus("active");
                System.out.println("Account Reactivated Successfully!");
                return;
            }
        }
        System.out.println("Account not Found!");

    }
}
