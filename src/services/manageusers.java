package services;

import entity.accountsuse;

import java.util.Scanner;

public class manageusers {
    public void mamage(accountsuse[] accountdb){
        Scanner sc = new Scanner(System.in);
           String message = """
                   ----Manage Users----
                   1)View All users
                   2)Disable Users
                   3)Manage Money
                   0)Exit
                   """;
           System.out.println(message);
           System.out.println("Enter Your Choise:");
           int choise = sc.nextInt();
           if(choise==1){

           } else if (choise==2){

           }else if (choise==3){

           }else {

           }

    }
}
