package services.admin;

import entity.accountsuse;

import java.util.Scanner;

public class disableuser {
    public void disable(accountsuse[] accountdb,int accountcount){
        Scanner sc =new Scanner(System.in);
        System.out.println("-----Account Disabler-----");
        System.out.println("Enter Account No Of:");
        int accountno = sc.nextInt();
        for(int i=0;i<accountcount;i++){
            if(accountdb[i].getAccountno()==accountno){
                accountdb[i].setStatus("disabled");
                System.out.println("Successfully Blocked!");
                System.out.println("Account No:"+accountno+":"+accountdb[i].getStatus());
                return;
            }
        }
        System.out.println("No account Found!");

    }

}
