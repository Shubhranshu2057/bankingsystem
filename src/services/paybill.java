package services;

import entity.accountsuse;
import entity.trxacces;

import java.util.Date;
import java.util.Scanner;

public class paybill {

    public boolean pay(accountsuse[] accountdb, int countaccount, int currentaccount, trxacces[] trxdb) {

        Scanner sc = new Scanner(System.in);

        if (!accountdb[currentaccount].isBill()) {
            System.out.println("You have no outstanding bill left!");
            return false;
        }

        System.out.println("You have a pending bill of Rs.500");
        System.out.println("Y to pay / N to cancel");

        char choice = sc.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {

            if (accountdb[currentaccount].getBalance() < 500) {
                System.out.println("Insufficient balance!");
                return false;
            }

            accountdb[currentaccount].setBalance(
                    accountdb[currentaccount].getBalance() - 500
            );

            accountdb[currentaccount].setBill(false);

            System.out.println("Your bill has been successfully paid!");
            int trxid = Math.abs((int) System.currentTimeMillis());
            trxdb[accountdb[currentaccount].getTransactions()] = new trxacces(trxid,accountdb[currentaccount].getAccountno(),"Bill Pay",500,new Date());
            accountdb[currentaccount].setTransactions(accountdb[currentaccount].getTransactions()+1);
            System.out.println("Remaining Balance: " +
                    accountdb[currentaccount].getBalance());

            return true;
        }

        System.out.println("Payment cancelled.");
        return false;
    }
}