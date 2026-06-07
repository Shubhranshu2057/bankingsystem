package services;

import entity.accountsuse;
import entity.trxacces;

public class transactions {

    public void showtrx(accountsuse[] accountdb,
                        trxacces[] trxdb,
                        int currentaccount) {

        int accountNo = accountdb[currentaccount].getAccountno();

        System.out.printf("%-10s %-12s %-20s %-10s %-25s%n",
                "Trx ID",
                "Account No",
                "Payment Type",
                "Amount",
                "Date");

        System.out.println("--------------------------------------------------------------------------------");

        boolean found = false;

        for (int i = 0; i < trxdb.length; i++) {

            if (trxdb[i] != null &&
                    trxdb[i].getAccountno() == accountNo) {

                found = true;

                System.out.printf("%-10d %-12d %-20s %-10.2f %-25s%n",
                        trxdb[i].getTrxid(),
                        trxdb[i].getAccountno(),
                        trxdb[i].getPaymenttype(),
                        trxdb[i].getAmount(),
                        trxdb[i].getDate());
            }
        }

        if (!found) {
            System.out.println("No transactions found.");
        }
    }
}