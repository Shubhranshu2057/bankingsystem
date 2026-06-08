package controllers.admin;

import entity.accountsuse;
import services.admin.addmoney;
import services.admin.deductmoney;

import java.util.Scanner;

public class managemoney {
    public void manage(accountsuse[] acccountdb, int accountcount){
        Scanner sc = new Scanner(System.in);
        int choise =1;
        String message = """
                -----Money Management Tool-----
                1)Add Money
                2)Deduct Money
                0)Exit
                Note ! (!Remember Use It carefully Logs Are captured!)
                """;
         while (choise>0){
             System.out.println(message);
             System.out.println("Enter Your Chooise:");
             choise = sc.nextInt();
             if(choise==1){
                 addmoney addm = new addmoney();
                 addm.addmoneys(acccountdb,accountcount);
             }else if(choise==2){
                deductmoney deduct = new deductmoney();
                deduct.deduct(acccountdb,accountcount);
             }
         }
    }
}
