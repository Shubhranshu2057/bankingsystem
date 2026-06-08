package controllers;

import com.sun.jdi.connect.Connector;
import entity.accountsuse;
import entity.cardacces;
import entity.trxacces;
import services.overview;
import services.transactions;
import services.transfer;

import java.util.Arrays;
import java.util.Scanner;

public class home {
    public void sar(String User, String hname, int accountno, accountsuse[] accountdb, int accountCount, int currentacoount, int trxcount, int trxid, trxacces[] trxdb, cardacces[] cardb,String code) {
        Scanner sc = new Scanner(System.in);
        String Messgae =
                """
                        -----Welcome To HomePage """ + " " + User + "--- \n" +
                        """
                                1) Account Overview (Details about Account Holder)
                                2) Quick Actions (Transfer Money,Recive Money,Pay Bills)
                                3) Recent TRansactions (Get 5 Most recent transactions)
                                4) Card Section (Debit/Credit Card Info)
                                5) Security (Password, Code Login)
                                6) Logout  
                                """;
        int choise = 1;
        while (choise > 0) {
            System.out.println(Messgae);
            System.out.println("Enter Your Option:");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    overview overview = new overview();
                    login log = new login();
                    overview.show(hname, accountno, log.balanace(currentacoount,accountdb));
                    accountdb[currentacoount].setType("admin");
                    break;
                case 2:
                    quicktransfer quicktransfer = new quicktransfer();
                    quicktransfer.quick(accountdb,accountCount,currentacoount,trxcount,trxid,trxdb);
                    break;
                case 3:
                    transactions transactio = new transactions();
                    transactio.showtrx(accountdb,trxdb,currentacoount);
                    break;
                case 4:
                    cardSystem card = new cardSystem();
                    card.card(cardb,accountdb,currentacoount);
                    break;
                case 5:
                    security secure = new security();
                    secure.security(accountdb,currentacoount,code,cardb);
                    break;
                case 6:
                    choise =0;
                    break;
            }
        }
    }
}
