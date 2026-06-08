package controllers.admin;

import entity.accountsuse;
import services.admin.disableuser;
import services.admin.enableaccount;
import services.admin.viwalluser;

import java.util.Scanner;

public class manageusers {
    public void mamage(accountsuse[] accountdb,int accountcount){
        Scanner sc = new Scanner(System.in);
           String message = """
                   ----Manage Users----
                   1)View All users(All / singal)
                   2)Disable Users
                   3)Enable Users Account(active)
                   4)Manage Money (Add Money/Deduct Money)
                   0)Exit
                   """;
           System.out.println(message);
           System.out.println("Enter Your Choise:");
           int choise = sc.nextInt();
           if(choise==1){
            viwalluser view = new viwalluser();
            view.viewall(accountdb,accountcount);
           } else if (choise==2){
            disableuser userdis = new disableuser();
            userdis.disable(accountdb,accountcount);
           }else if (choise==3){
               enableaccount enable =new enableaccount();
               enable.enable(accountdb,accountcount);
           }else if(choise==4){
               managemoney money = new managemoney();
               money.manage(accountdb,accountcount);
           }

    }
}
