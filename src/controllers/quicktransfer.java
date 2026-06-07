package controllers;

import entity.accountsuse;
import entity.trxacces;
import services.paybill;
import services.recive;
import services.transfer;

import java.util.Scanner;

public class quicktransfer {

    int[] bills_no = {102, 103, 104, 105, 106};
    int[] paid = new int[bills_no.length];

    public void quick(accountsuse[] accountdb, int accountCount, int currentacoount,int trxcount,int trxid, trxacces[] trxdb){
        Scanner sc = new Scanner(System.in);
        int paid_count=0;
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
            if(transfer.send(accountdb,accountCount,currentacoount,trxcount,trxid,trxdb)){
                trxcount++;
            }
        } else if (inpu == 2) {
            recive recive = new recive();
            recive.recives(accountdb,accountCount,currentacoount);
        } else if (inpu == 3) {
          paybill billpay = new paybill();
           billpay.pay(accountdb,accountCount,currentacoount);
        } else if (inpu == 0) {

        }
    }

}
