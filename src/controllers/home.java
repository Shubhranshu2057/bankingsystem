package controllers;

import com.sun.jdi.connect.Connector;
import entity.accountsuse;
import services.overview;
import services.transfer;

import java.util.Arrays;
import java.util.Scanner;

public class home {
    public void sar(String User, String hname, int accountno, float balance, accountsuse[] accountdb,int accountCount,int currentacoount) {
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
                    overview.show(hname, accountno, balance);
                    break;
                case 2:
                    quicktransfer quicktransfer = new quicktransfer();
                    quicktransfer.quick(accountdb,accountCount,currentacoount);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    choise =0;
                    break;
            }
        }
    }
}
