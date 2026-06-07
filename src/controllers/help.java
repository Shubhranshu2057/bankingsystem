package controllers;

import entity.accountsuse;
import services.accountublock;
import services.forgetpassword;
import services.forgetusername;

import java.util.Scanner;

public class help {
    public void helpcenter(int accountCount, accountsuse[] accountdb,String code){
        Scanner sc = new Scanner(System.in);
        int inpu=0;
        String helpmessage = """
               -------Help Center------
               1)Forget Password
               2)Forget Username
               3)Account Blocked
               0)Exit
                      """;
        System.out.println(helpmessage);
        System.out.println("Enter Your Option:");
        inpu = sc.nextInt();
        while(inpu>0){

            // Forget Password Logic
            if(inpu==1){
                forgetpassword forget = new forgetpassword();
                forget.forget(accountCount,accountdb);
                inpu=0;
                break;
            }
            // Forget Account Username
            else if(inpu==2){
               forgetusername forgetu = new forgetusername();
               forgetu.forget(accountCount,accountdb);
               inpu=0;
               break;
            }

            // Account UnblockER Using Ucode
            else if(inpu==3){
                accountublock accountubloc = new accountublock();
                accountubloc.ublock(accountCount,accountdb,code);
                return;
            }
            else{
                System.out.println("Enter Valid Options");
                return;
            }
        }
    }
}
