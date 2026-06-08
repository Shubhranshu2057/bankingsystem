package controllers.admin;

import entity.accountsuse;
import services.manageusers;

import java.util.Scanner;

public class adminhome {
    public void adminhome(accountsuse[] accountdb,int accountCount){
        Scanner sc = new Scanner(System.in);
        String message = """
                ----Admin HomePage----
                1)Manage Users(View/Disable/Money)
                2)Transactions(View user transactions)
                3)Manage User Cards
                4)Maintenance Mode(Turn off/On)
                5)Exit
                """;
        System.out.println(message);
        System.out.println("Enter your choise:");
        int choise =  sc.nextInt();
        if(choise==1){
          manageusers manage = new manageusers();
          manage.mamage(accountdb);
          return;
        }else if(choise==2){

        }else if(choise==3){

        } else if (choise==4) {

        }else if(choise==5){

        }
    }
}
