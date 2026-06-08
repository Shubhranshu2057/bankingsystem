package services.admin;

import entity.accountsuse;

import java.util.Scanner;

public class addmoney {
    public void addmoneys(accountsuse[] accountdb,int accountcount){
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter Account No:");
        int accountno=sc.nextInt();
        System.out.println("Enter Amount :");
        float amount = sc.nextFloat();
        for(int i =0;i<accountcount;i++){
            if(accountdb[i].getAccountno()==accountno){
                accountdb[i].setBalance(accountdb[i].getBalance()+amount);
                System.out.println("Succesflly Amount Added!");
                System.out.println("Updated balnce:"+accountdb[i].getBalance());
                return;
            }
        }
        System.out.println("No account found!");
    }
}
