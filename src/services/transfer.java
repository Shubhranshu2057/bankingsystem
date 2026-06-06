package services;

import entity.accountsuse;

import java.util.Scanner;

public class transfer {
    int currentsession =0;
    boolean found =false;
    public void send(accountsuse[] accountdb,int accountCount,int currentaccount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Reciver AccountNo:");
        int accountno = sc.nextInt();
        for(int i=0;i<accountCount;i++){
            if(accountdb[i].getAccountno()==accountno){
                currentsession=i;
                found =true;
            }
        }
        if(found){
            System.out.println("How much Amount Would You Wana Transfer?:");
            float amount = sc.nextFloat();
            if(accountdb[currentaccount].getBalance()>=amount){
                accountdb[currentsession].setBalance(accountdb[currentsession].getBalance()+amount);
                accountdb[currentaccount].setBalance(accountdb[currentaccount].getBalance()-amount);
            }
            else{
                System.out.println("Insufficient Balance!");
            }
        }else {
            System.out.println("Invalid Account no!");
        }
    }
}
