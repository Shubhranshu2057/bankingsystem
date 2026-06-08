package services;

import entity.accountsuse;

import java.util.Scanner;

public class manageusers {
    public void mamage(accountsuse[] accountdb,int accountcount){
        Scanner sc = new Scanner(System.in);
           String message = """
                   ----Manage Users----
                   1)View All users(All / singal)
                   2)Disable Users
                   3)Manage Money
                   0)Exit
                   """;
           System.out.println(message);
           System.out.println("Enter Your Choise:");
           int choise = sc.nextInt();
           if(choise==1){
            viwalluser view = new viwalluser();
            view.viewall(accountdb,accountcount);
           } else if (choise==2){

           }else if (choise==3){

           }else {

           }

    }
}
