package services;

import entity.accountsuse;
import entity.trxacces;

import java.util.Date;
import java.util.Scanner;

public class transfer {
    int currentsession =0;
    int trxcount =0;
    boolean found =false;
    public boolean send(accountsuse[] accountdb, int accountCount, int currentaccount,int trxcounts,int trxid,trxacces[] trxdb) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Reciver AccountNo:");
        int accountno = sc.nextInt();
        for(int i=0;i<accountCount;i++){
            if(accountdb[i].getAccountno()==accountno){
                currentsession=i;
                found =true;
            }
        }

        // if  Found account
        if(found){
            System.out.println("How much Amount Would You Wana Transfer?:");
            float amount = sc.nextFloat();
            if(accountdb[currentaccount].getBalance()>=amount){
                // transfer money to reciver
                accountdb[currentsession].setBalance(accountdb[currentsession].getBalance()+amount);
                accountdb[currentaccount].setBalance(accountdb[currentaccount].getBalance()-amount);
                // trxid genrtaor
                int trxids = Math.abs((int)System.currentTimeMillis());
               // transaction genrator sender logs
                trxdb[trxcount] =new trxacces(trxids,accountdb[currentsession].getAccountno(),"Credited Via "+accountdb[currentaccount].getAccountno(),amount,new Date());
                accountdb[currentsession].setTransactions(accountdb[currentsession].getTransactions()+1);
                trxcount++;
                trxdb[trxcount] = new trxacces(trxids,accountdb[currentaccount].getAccountno(),"transfer",amount,new Date());
                accountdb[currentaccount].setTransactions(accountdb[currentaccount].getTransactions()+1);
                trxcount++;
                // transaction genrator reciver logs

                System.out.println("SuccessFull transfer Amount:"+amount+"to"+currentsession);
                return true;
            }
            else{
                System.out.println("Insufficient Balance!");
                return false;
            }
        }else {
            System.out.println("Invalid Account no!");
            return false;
        }
    }
}
