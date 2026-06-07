package controllers;

import entity.accountsuse;
import entity.cardacces;
import services.accountdelete;
import services.cardblock;
import services.changepass;
import services.changeucode;

import java.util.Scanner;

public class security {
    public void security(accountsuse[] accountdb, int curentaccount, String code, cardacces[] cardb){
        Scanner sc =new Scanner(System.in);
        String messages = """
              -----Security Manager-----
              1) Change Password
              2) Change Ucode
              3) Block Card
              4) Delete Account
              0) Back
                """;
        System.out.println(messages);
        System.out.println("Enter your choise:");
        int choise = sc.nextInt();
        if(choise==1){
            changepass changepass = new changepass();
            changepass.changepassword(accountdb,curentaccount);
            return;
        } else if (choise==2) {
            changeucode ucodechange = new changeucode();
            ucodechange.changeucode(accountdb,curentaccount,code);
        }else if(choise==3){
            cardblock cardbs = new cardblock();
            cardbs.cardblock(cardb,curentaccount,accountdb);
            return;
        } else if (choise==4) {
            accountdelete delete = new accountdelete();
            delete.deleteaccount(accountdb,curentaccount,cardb);
            return;
        } else{
            return;
        }

    }
}
