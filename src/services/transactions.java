package services;

import entity.accountsuse;
import entity.trxacces;

public class transactions {
    public void showtrx(accountsuse[] accountdb, trxacces[] trxdb, int currentaccount){

        System.out.printf("%-10s %-12s %-15s %-10s %-25s%n",
                "Trx ID",
                "Account No",
                "Payment Type",
                "Amount",
                "Date");

        System.out.println("--------------------------------------------------------------------------");

        for(int i = 0; i < accountdb[currentaccount].getTransactions(); i++){

            System.out.printf("%-10d %-12d %-15s %-10.2f %-25s%n",
                    trxdb[i].getTrxid(),
                    trxdb[i].getAccountno(),
                    trxdb[i].getPaymenttype(),
                    trxdb[i].getAmount(),
                    trxdb[i].getDate());
            System.out.println(" ");
        }
    }
}
