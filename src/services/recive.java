package services;

import entity.accountsuse;

public class recive {
    public void recives(accountsuse[] accountdb, int accountCount, int currentaccount){
        System.out.println("You can recives money throught your Account Number :");
        System.out.println(accountdb[currentaccount].getAccountno());

    }
}
