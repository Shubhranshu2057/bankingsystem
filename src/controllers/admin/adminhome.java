package controllers.admin;

import entity.accountsuse;
import services.manageusers;

import java.util.Scanner;

public class adminhome {
    public void adminhome(accountsuse[] accountdb,int accountCount) {
        Scanner sc = new Scanner(System.in);
        int choise = 1;
        String message = """
                ----Admin HomePage----
                1)Manage Users(View/Disable/Money)
                2)Transactions(View user transactions)
                3)Manage User Cards
                4)Maintenance Mode(Turn off/On)
                5)Exit
                """;
        while (choise > 0) {
            System.out.println(message);
            System.out.println("Enter your choise:");
            choise = sc.nextInt();

            switch (choise) {
                case 1:
                    manageusers manage = new manageusers();
                    manage.mamage(accountdb, accountCount);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
}
