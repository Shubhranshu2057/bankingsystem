package services.admin;

import entity.trxacces;

import java.util.Scanner;

public class transactions {
    public void trxdata(trxacces[] trxdb,int trxcount){
        Scanner sc =new Scanner(System.in);
        String messges = """
                 ---Transction tool---
                 1)View all transcation
                 2)View Account Transaction
                 0)Exit
                 Enter your option :
                 """;
        System.out.println(messges);
        int choise = sc.nextInt();
        switch (choise){
            case 1:
                System.out.printf("%-10s %-12s %-20s %-10s %-25s%n",
                        "Trx ID",
                        "Account No",
                        "Payment Type",
                        "Amount",
                        "Date");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(trxcount);
                for(int i=0;i<trxdb.length;i++){
                    if(trxdb[i]!= null){
                        System.out.printf("%-10d %-12d %-20s %-10.2f %-25s%n",
                                trxdb[i].getTrxid(),
                                trxdb[i].getAccountno(),
                                trxdb[i].getPaymenttype(),
                                trxdb[i].getAmount(),
                                trxdb[i].getDate());
                    }
                }
                break;
            case 2:
                System.out.println("Enter Account No:");
                int accountno = sc.nextInt();
                System.out.printf("%-10s %-12s %-20s %-10s %-25s%n",
                        "Trx ID",
                        "Account No",
                        "Payment Type",
                        "Amount",
                        "Date");
                System.out.println("--------------------------------------------------------------------------------");
                for(int i=0;i<trxdb.length;i++) {
                    if (trxdb[i]!=null&&trxdb[i].getAccountno() == accountno) {
                        System.out.printf("%-10d %-12d %-20s %-10.2f %-25s%n",
                                trxdb[i].getTrxid(),
                                trxdb[i].getAccountno(),
                                trxdb[i].getPaymenttype(),
                                trxdb[i].getAmount(),
                                trxdb[i].getDate());
                    }
                }
                break;
            default:
                break;
                }

        }


    }
