package services;

import entity.accountsuse;

import java.util.Scanner;

public class viwalluser {
        public void viewall(accountsuse[] accountdb,int accountcount){
           int choise =1;
           Scanner sc = new Scanner(System.in);
           String message = """
                   ----View System----
                   1)View All users(Get full list )
                   2)View Single user(By Account no)
                   0)Exit
                   """;
               while(choise>0){
                   System.out.println(message);
                   System.out.println("Enter your Option:");
                   choise =sc.nextInt();
                   switch (choise){
                       case 1:
                           System.out.println("----Users List----");
                           for(int i=0;i<accountcount;i++){
                               System.out.println("Account Holder Name:"+accountdb[i].getHname());
                               System.out.println("Account No:"+accountdb[i].getAccountno());
                               System.out.println("Account Type:"+accountdb[i].getType());
                               System.out.println("Account Status:"+accountdb[i].getStatus());
                               System.out.println("Account Current Ucode:"+accountdb[i].getUcode());
                               System.out.println("Account Transcations:"+accountdb[i].getTransactions());
                               System.out.println("Account Balance:"+accountdb[i].getBalance());
                               System.out.println("Account Username:"+accountdb[i].getUsername());
                               System.out.println("Account Attemptes:"+accountdb[i].getAttempts());
                               System.out.println("Accound Due Bill:"+accountdb[i].isBill());
                               System.out.println("-----------------------------------------------");
                               System.out.println(" ");
                           }
                           break;
                       case 2:
                           System.out.println("Enter Account No:");
                           int accountno =sc.nextInt();
                           for(int i=0;i<accountcount;i++){
                               if(accountdb[i].getAccountno()==accountno){
                                   System.out.println("Account Holder Name:"+accountdb[i].getHname());
                                   System.out.println("Account No:"+accountdb[i].getAccountno());
                                   System.out.println("Account Type:"+accountdb[i].getType());
                                   System.out.println("Account Status:"+accountdb[i].getStatus());
                                   System.out.println("Account Current Ucode:"+accountdb[i].getUcode());
                                   System.out.println("Account Transcations:"+accountdb[i].getTransactions());
                                   System.out.println("Account Balance:"+accountdb[i].getBalance());
                                   System.out.println("Account Username:"+accountdb[i].getUsername());
                                   System.out.println("Account Attemptes:"+accountdb[i].getAttempts());
                                   System.out.println("Accound Due Bill:"+accountdb[i].isBill());
                                   System.out.println("-----------------------------------------------");
                                   System.out.println(" ");
                                   return;
                               }
                           }
                           System.out.println("No Account Found");
                           break;
                   }
               }
        }
}
