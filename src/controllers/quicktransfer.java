package controllers;

import entity.accountsuse;
import services.transfer;

import java.util.Scanner;

public class quicktransfer {
    public void quick(accountsuse[] accountdb,int accountCount,int currentacoount){
        Scanner sc = new Scanner(System.in);
        int inpu =0;
        String message = """
                            -----Quick Actions-----        
                              1)Transfer Money
                              2)Receive Money
                              3)Pay Bills      
                            """;
        System.out.println(message);
        System.out.println("Enter the Option:");
        inpu = sc.nextInt();
        if (inpu == 1) {
            transfer transfer = new transfer();
            transfer.send(accountdb,accountCount,currentacoount);
        } else if (inpu == 2) {

        } else if (inpu == 3) {

        } else if (inpu == 0) {

        }
    }

}
